package net.mcreator.pact.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.pact.potion.PureTitanShiftedPotionPotionEffect;
import net.mcreator.pact.entity.PureTitanShiftedEntity;
import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class PureTitanInjectionRightclickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DohtitansMod.LOGGER.warn("Failed to load dependency world for procedure PureTitanInjectionRightclicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DohtitansMod.LOGGER.warn("Failed to load dependency x for procedure PureTitanInjectionRightclicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DohtitansMod.LOGGER.warn("Failed to load dependency y for procedure PureTitanInjectionRightclicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DohtitansMod.LOGGER.warn("Failed to load dependency z for procedure PureTitanInjectionRightclicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure PureTitanInjectionRightclicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(PureTitanShiftedPotionPotionEffect.potion, (int) 72000, (int) 1, (false), (false)));
				for (int index0 = 0; index0 < (int) (50); index0++) {
					if (world instanceof ServerWorld) {
						LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
						_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, 3, z)));
						_ent.setEffectOnly(true);
						((World) world).addEntity(_ent);
					}
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new PureTitanShiftedEntity.CustomEntity(PureTitanShiftedEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				ScaleTypes.THIRD_PERSON.getScaleData(entity)
						.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 2));
				ScaleTypes.REACH.getScaleData(entity)
						.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 0));
				ScaleTypes.BASE.getScaleData(entity)
						.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.BASE.getScaleData(entity).getTargetScale(), 5));
				ScaleTypes.HITBOX_WIDTH.getScaleData(entity).setTargetScale(
						(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_WIDTH.getScaleData(entity).getTargetScale(), 1.5));
				ScaleTypes.HITBOX_HEIGHT.getScaleData(entity).setTargetScale(
						(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_HEIGHT.getScaleData(entity).getTargetScale(), 0.1));
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"/title @a actionbar {\"text\":\"Pure Titans Cannot be controlled\",\"color\":\"dark_red\"}");
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 200);
	}
}
