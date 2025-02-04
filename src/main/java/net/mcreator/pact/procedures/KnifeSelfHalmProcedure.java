package net.mcreator.pact.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

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

import net.mcreator.pact.potion.MonkeyTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.MonkeyTitanEffectPotionEffect;
import net.mcreator.pact.potion.JawTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.JawTitanEffectPotionEffect;
import net.mcreator.pact.potion.CooldownPotionEffect;
import net.mcreator.pact.potion.ColoTitanEffectShiftedPotionEffect;
import net.mcreator.pact.potion.ColoTitanEffectPotionEffect;
import net.mcreator.pact.potion.CartTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.CartTitanEffectPotionEffect;
import net.mcreator.pact.potion.AttackTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.AttackTitanEffectPotionEffect;
import net.mcreator.pact.potion.ArmouredTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.ArmouredTitanEffectPotionEffect;
import net.mcreator.pact.entity.MonkeyBeastTitanEntity;
import net.mcreator.pact.entity.JawTitanEntity;
import net.mcreator.pact.entity.ColoTitanEntity;
import net.mcreator.pact.entity.CartTitanEntity;
import net.mcreator.pact.entity.AttackTitanEntity;
import net.mcreator.pact.entity.ArmouredTitanEntity;
import net.mcreator.pact.DohtitansMod;

import java.util.Map;
import java.util.Collection;

public class KnifeSelfHalmProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DohtitansMod.LOGGER.warn("Failed to load dependency world for procedure KnifeSelfHalm!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DohtitansMod.LOGGER.warn("Failed to load dependency x for procedure KnifeSelfHalm!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DohtitansMod.LOGGER.warn("Failed to load dependency y for procedure KnifeSelfHalm!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DohtitansMod.LOGGER.warn("Failed to load dependency z for procedure KnifeSelfHalm!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure KnifeSelfHalm!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == CooldownPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"/title @s actionbar {\"text\":\"You cannot shift yet!\",\"color\":\"red\"}");
				}
			}
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AttackTitanShiftedEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"/title @s actionbar {\"text\":\"You are already shifted\",\"color\":\"red\"}");
				}
			}
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == CartTitanShiftedEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"/title @s actionbar {\"text\":\"You are already shifted\",\"color\":\"red\"}");
				}
			}
		}
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AttackTitanShiftedEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (!(new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == CooldownPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity))) {
				if (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == AttackTitanEffectPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
					for (int index0 = 0; index0 < (int) (50); index0++) {
						if (world instanceof ServerWorld) {
							LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
							_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, 3, z)));
							_ent.setEffectOnly(true);
							((World) world).addEntity(_ent);
						}
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new AttackTitanEntity.CustomEntity(AttackTitanEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 20));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 10));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(
								new EffectInstance(AttackTitanShiftedEffectPotionEffect.potion, (int) 12000, (int) 1, (false), (false)));
				}
			}
		}
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == ColoTitanEffectShiftedPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (!(new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == CooldownPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity))) {
				if (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ColoTitanEffectPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
					for (int index1 = 0; index1 < (int) (50); index1++) {
						if (world instanceof ServerWorld) {
							LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
							_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, 3, z)));
							_ent.setEffectOnly(true);
							((World) world).addEntity(_ent);
						}
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ColoTitanEntity.CustomEntity(ColoTitanEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 20));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 10));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(
								new EffectInstance(ColoTitanEffectShiftedPotionEffect.potion, (int) 12000, (int) 1, (false), (false)));
				}
			}
		}
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == MonkeyTitanShiftedEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (!(new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == CooldownPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity))) {
				if (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == MonkeyTitanEffectPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
					for (int index2 = 0; index2 < (int) (50); index2++) {
						if (world instanceof ServerWorld) {
							LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
							_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, 3, z)));
							_ent.setEffectOnly(true);
							((World) world).addEntity(_ent);
						}
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new MonkeyBeastTitanEntity.CustomEntity(MonkeyBeastTitanEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 20));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 10));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(
								new EffectInstance(MonkeyTitanShiftedEffectPotionEffect.potion, (int) 12000, (int) 1, (false), (false)));
				}
			}
		}
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == JawTitanShiftedEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (!(new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == CooldownPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity))) {
				if (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == JawTitanEffectPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
					for (int index3 = 0; index3 < (int) (50); index3++) {
						if (world instanceof ServerWorld) {
							LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
							_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, 3, z)));
							_ent.setEffectOnly(true);
							((World) world).addEntity(_ent);
						}
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new JawTitanEntity.CustomEntity(JawTitanEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 5));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 10));
					ScaleTypes.BASE.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.BASE.getScaleData(entity).getTargetScale(), 0.1));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(
								new EffectInstance(JawTitanShiftedEffectPotionEffect.potion, (int) 1728000, (int) 1, (false), (false)));
				}
			}
		}
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == ArmouredTitanShiftedEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (!(new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == CooldownPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity))) {
				if (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ArmouredTitanEffectPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
					for (int index4 = 0; index4 < (int) (50); index4++) {
						if (world instanceof ServerWorld) {
							LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
							_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, 3, z)));
							_ent.setEffectOnly(true);
							((World) world).addEntity(_ent);
						}
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ArmouredTitanEntity.CustomEntity(ArmouredTitanEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 20));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 10));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(
								new EffectInstance(ArmouredTitanShiftedEffectPotionEffect.potion, (int) 1728000, (int) 1, (false), (false)));
				}
			}
		}
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == CartTitanShiftedEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (!(new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == CooldownPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity))) {
				if (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == CartTitanEffectPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
					for (int index5 = 0; index5 < (int) (50); index5++) {
						if (world instanceof ServerWorld) {
							LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
							_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, 3, z)));
							_ent.setEffectOnly(true);
							((World) world).addEntity(_ent);
						}
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new CartTitanEntity.CustomEntity(CartTitanEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 20));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 10));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(
								new EffectInstance(CartTitanShiftedEffectPotionEffect.potion, (int) 1728000, (int) 1, (false), (false)));
				}
			}
		}
	}
}
