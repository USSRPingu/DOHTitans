package net.mcreator.pact.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.pact.potion.AttackTitanEffectPotionEffect;
import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class AttackTitanInjectionRightclickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure AttackTitanInjectionRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(AttackTitanEffectPotionEffect.potion, (int) 72000, (int) 1, (false), (false)));
	}
}
