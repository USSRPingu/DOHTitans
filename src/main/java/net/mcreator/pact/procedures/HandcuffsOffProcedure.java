package net.mcreator.pact.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraft.entity.Entity;

import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class HandcuffsOffProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure HandcuffsOff!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ScaleTypes.STEP_HEIGHT.getScaleData(entity)
				.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.STEP_HEIGHT.getScaleData(entity).getTargetScale(), 1));
		ScaleTypes.REACH.getScaleData(entity)
				.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 1));
	}
}
