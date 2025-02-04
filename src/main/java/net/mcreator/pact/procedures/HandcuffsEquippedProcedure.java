package net.mcreator.pact.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.pact.potion.HandcuffsPotionPotionEffect;
import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class HandcuffsEquippedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency sourceentity for procedure HandcuffsEquipped!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity)
					.addPotionEffect(new EffectInstance(HandcuffsPotionPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
	}
}
