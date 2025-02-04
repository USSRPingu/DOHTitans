package net.mcreator.pact.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.pact.potion.MonkeyTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.JawTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.CooldownPotionEffect;
import net.mcreator.pact.potion.ColoTitanEffectShiftedPotionEffect;
import net.mcreator.pact.potion.CartTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.AttackTitanShiftedEffectPotionEffect;
import net.mcreator.pact.potion.ArmouredTitanShiftedEffectPotionEffect;
import net.mcreator.pact.DohtitansMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class UnshiftedProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure Unshifted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
							if (effect.getPotion() == AttackTitanShiftedEffectPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if (entity.isSneaking()) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldownPotionEffect.potion, (int) 800, (int) 1, (false), (false)));
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(AttackTitanShiftedEffectPotionEffect.potion);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 1));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 1));
				}
			}
		}
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
							if (effect.getPotion() == MonkeyTitanShiftedEffectPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if (entity.isSneaking()) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldownPotionEffect.potion, (int) 800, (int) 1, (false), (false)));
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(MonkeyTitanShiftedEffectPotionEffect.potion);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 1));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 1));
				}
			}
		}
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
							if (effect.getPotion() == ColoTitanEffectShiftedPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if (entity.isSneaking()) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldownPotionEffect.potion, (int) 24000, (int) 1, (false), (false)));
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(ColoTitanEffectShiftedPotionEffect.potion);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 1));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 1));
				}
			}
		}
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
							if (effect.getPotion() == JawTitanShiftedEffectPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if (entity.isSneaking()) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldownPotionEffect.potion, (int) 800, (int) 1, (false), (false)));
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(JawTitanShiftedEffectPotionEffect.potion);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 1));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 1));
					ScaleTypes.BASE.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.BASE.getScaleData(entity).getTargetScale(), 1));
				}
			}
		}
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
							if (effect.getPotion() == ArmouredTitanShiftedEffectPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if (entity.isSneaking()) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldownPotionEffect.potion, (int) 800, (int) 1, (false), (false)));
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(ArmouredTitanShiftedEffectPotionEffect.potion);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 1));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 1));
				}
			}
		}
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
							if (effect.getPotion() == CartTitanShiftedEffectPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if (entity.isSneaking()) {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(CartTitanShiftedEffectPotionEffect.potion);
					}
					ScaleTypes.THIRD_PERSON.getScaleData(entity).setTargetScale(
							(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.THIRD_PERSON.getScaleData(entity).getTargetScale(), 1));
					ScaleTypes.REACH.getScaleData(entity)
							.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 1));
				}
			}
		}
	}
}
