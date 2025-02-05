
package net.mcreator.pact.entity;

import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.builder.ILoopType.EDefaultLoopTypes;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.IAnimatable;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.World;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ActionResultType;
import net.minecraft.network.IPacket;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.pact.procedures.MonkeyTitanSpawnProcedure;
import net.mcreator.pact.DohtitansModElements;

import javax.annotation.Nullable;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@DohtitansModElements.ModElement.Tag
public class MonkeyBeastTitanEntity extends DohtitansModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("monkey_beast_titan").setRegistryName("monkey_beast_titan");

	public MonkeyBeastTitanEntity(DohtitansModElements instance) {
		super(instance, 16);
		FMLJavaModLoadingContext.get().getModEventBus().register(new MonkeyBeastTitanGeckolibEntity());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(
				() -> new SpawnEggItem(entity, -1, -1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("monkey_beast_titan_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}

	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 10);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);
			ammma = ammma.createMutableAttribute(Attributes.FOLLOW_RANGE, 16);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity implements IAnimatable {
		private AnimationFactory factory = new AnimationFactory(this);
		public String animationprocedure = "empty";
		private boolean swinging;
		private long lastSwing;

		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			this.ignoreFrustumCheck = true;
			experienceValue = 0;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();

		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public double getMountedYOffset() {
			return super.getMountedYOffset() + -15;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		public ILivingEntityData onInitialSpawn(IServerWorld world, DifficultyInstance difficulty, SpawnReason reason,
				@Nullable ILivingEntityData livingdata, @Nullable CompoundNBT tag) {
			ILivingEntityData retval = super.onInitialSpawn(world, difficulty, reason, livingdata, tag);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;

			MonkeyTitanSpawnProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			return retval;
		}

		@Override
		public ActionResultType func_230254_b_(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			ActionResultType retval = ActionResultType.func_233537_a_(this.world.isRemote());
			super.func_230254_b_(sourceentity, hand);
			sourceentity.startRiding(this);
			return retval;
		}

		@Override
		public void travel(Vector3d dir) {
			Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
			if (this.isBeingRidden()) {
				this.rotationYaw = entity.rotationYaw;
				this.prevRotationYaw = this.rotationYaw;
				this.rotationPitch = entity.rotationPitch * 0.5F;
				this.setRotation(this.rotationYaw, this.rotationPitch);
				this.jumpMovementFactor = this.getAIMoveSpeed() * 0.15F;
				this.renderYawOffset = entity.rotationYaw;
				this.rotationYawHead = entity.rotationYaw;
				this.stepHeight = 1.0F;
				if (entity instanceof LivingEntity) {
					this.setAIMoveSpeed((float) this.getAttributeValue(Attributes.MOVEMENT_SPEED));
					float forward = ((LivingEntity) entity).moveForward;
					float strafe = ((LivingEntity) entity).moveStrafing;
					super.travel(new Vector3d(strafe, 0, forward));
				}
				this.prevLimbSwingAmount = this.limbSwingAmount;
				double d1 = this.getPosX() - this.prevPosX;
				double d0 = this.getPosZ() - this.prevPosZ;
				float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
				if (f1 > 1.0F)
					f1 = 1.0F;
				this.limbSwingAmount += (f1 - this.limbSwingAmount) * 0.4F;
				this.limbSwing += this.limbSwingAmount;
				return;
			}
			this.stepHeight = 0.5F;
			this.jumpMovementFactor = 0.02F;
			super.travel(dir);
		}

		private <E extends IAnimatable> PlayState movementPredicate(AnimationEvent<E> event) {
			if (this.animationprocedure == "empty") {
				if (event.isMoving()) {
					event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", EDefaultLoopTypes.LOOP));
					return PlayState.CONTINUE;
				}
				if (this.dead) {
					event.getController().setAnimation(new AnimationBuilder().addAnimation("death", EDefaultLoopTypes.PLAY_ONCE));
					return PlayState.CONTINUE;
				}
				if (this.isInWaterOrBubbleColumn()) {
					event.getController().setAnimation(new AnimationBuilder().addAnimation("swim", EDefaultLoopTypes.LOOP));
					return PlayState.CONTINUE;
				}
				if (this.isSprinting()) {
					event.getController().setAnimation(new AnimationBuilder().addAnimation("sprint", EDefaultLoopTypes.LOOP));
					return PlayState.CONTINUE;
				}
				if (this.isSneaking()) {
					event.getController().setAnimation(new AnimationBuilder().addAnimation("sneak", EDefaultLoopTypes.LOOP));
					return PlayState.CONTINUE;
				}
				event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", EDefaultLoopTypes.LOOP));
				return PlayState.CONTINUE;
			}
			return PlayState.STOP;
		}

		private <E extends IAnimatable> PlayState attackingPredicate(AnimationEvent<E> event) {
			if (getSwingProgress(event.getPartialTick()) > 0f && !this.swinging) {
				this.swinging = true;
				this.lastSwing = world.getGameTime();
			}
			if (this.swinging && this.lastSwing + 15L <= world.getGameTime()) {
				this.swinging = false;
			}
			if (this.swinging && event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
				event.getController().markNeedsReload();
				event.getController().setAnimation(new AnimationBuilder().addAnimation("attack", EDefaultLoopTypes.PLAY_ONCE));
				return PlayState.CONTINUE;
			}
			return PlayState.CONTINUE;
		}

		private <E extends IAnimatable> PlayState procedurePredicate(AnimationEvent<E> event) {
			if (!(this.animationprocedure == "empty")
					&& event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
				event.getController().setAnimation(new AnimationBuilder().addAnimation(this.animationprocedure, EDefaultLoopTypes.PLAY_ONCE));
				if (event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
					this.animationprocedure = "empty";
					event.getController().markNeedsReload();
				}
			}
			return PlayState.CONTINUE;
		}

		@Override
		public void registerControllers(AnimationData data) {
			data.addAnimationController(new AnimationController<>(this, "movement", 4, this::movementPredicate));
			data.addAnimationController(new AnimationController<>(this, "attacking", 4, this::attackingPredicate));
			data.addAnimationController(new AnimationController<>(this, "procedure", 4, this::procedurePredicate));
		}

		@Override
		public AnimationFactory getFactory() {
			return this.factory;
		}
	}
}
