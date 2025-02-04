package net.mcreator.pact.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraft.entity.Entity;

import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class PureTitanShiftedSpawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure PureTitanShiftedSpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ScaleTypes.BASE.getScaleData(entity)
				.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.BASE.getScaleData(entity).getTargetScale(), 7));
		ScaleTypes.HITBOX_WIDTH.getScaleData(entity)
				.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_WIDTH.getScaleData(entity).getTargetScale(), 0.7));
	}
}
