package net.mcreator.pact.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class AbilityTwoOnActiveProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure AbilityTwoOnActive!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"/tellraw @a {\"text\":\"Testing\"}");
			}
		}
	}
}
