package net.mcreator.pact.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class JawTitanSpawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure JawTitanSpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ScaleTypes.HITBOX_HEIGHT.getScaleData(entity)
				.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_HEIGHT.getScaleData(entity).getTargetScale(), 0.5));
		ScaleTypes.HITBOX_WIDTH.getScaleData(entity)
				.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_WIDTH.getScaleData(entity).getTargetScale(), 1.5));
		ScaleTypes.BASE.getScaleData(entity)
				.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.BASE.getScaleData(entity).getTargetScale(), 5));
		ScaleTypes.MOTION.getScaleData(entity)
				.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.MOTION.getScaleData(entity).getTargetScale(), 4));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 72000, (int) 5, (false), (false)));
	}
}
