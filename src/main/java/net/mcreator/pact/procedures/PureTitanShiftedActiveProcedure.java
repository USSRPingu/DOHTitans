package net.mcreator.pact.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class PureTitanShiftedActiveProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure PureTitanShiftedActive!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setSneaking((false));
	}
}
