package net.mcreator.pact.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.pact.potion.CooldownAbility1stPotionEffect;
import net.mcreator.pact.potion.AttackTitanShiftedEffectPotionEffect;
import net.mcreator.pact.DohtitansMod;

import java.util.Map;
import java.util.Collection;

public class AbilityOneActiveProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure AbilityOneActive!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == CooldownAbility1stPotionEffect.potion)
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
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "/tellraw @a {\"text\":\"Testing\"}");
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(CooldownAbility1stPotionEffect.potion, (int) 1200, (int) 1, (true), (false)));
			}
		}
	}
}
