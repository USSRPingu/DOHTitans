package net.mcreator.pact.procedures;

import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleRegistries;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.pact.potion.CooldownPotionEffect;
import net.mcreator.pact.potion.AttackTitanShiftedEffectPotionEffect;
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
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(Effects.INVISIBILITY);
					}
					for (final ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
						type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
						type.getScaleData(entity).resetScale();
					}
				}
			}
		}
	}
}
