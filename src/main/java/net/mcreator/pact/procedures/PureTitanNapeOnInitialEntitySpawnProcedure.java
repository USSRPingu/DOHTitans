package net.mcreator.pact.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.pact.DohtitansMod;

import java.util.Map;

public class PureTitanNapeOnInitialEntitySpawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DohtitansMod.LOGGER.warn("Failed to load dependency world for procedure PureTitanNapeOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure PureTitanNapeOnInitialEntitySpawn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				ScaleTypes.BASE.getScaleData(entity)
						.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.BASE.getScaleData(entity).getTargetScale(), 2.7));
				ScaleTypes.HITBOX_WIDTH.getScaleData(entity)
						.setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_WIDTH.getScaleData(entity).getTargetScale(), 5));
				ScaleTypes.HITBOX_HEIGHT.getScaleData(entity).setTargetScale(
						(float) ScaleOperations.SET.applyAsDouble(ScaleTypes.HITBOX_HEIGHT.getScaleData(entity).getTargetScale(), 1.7));
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 20);
	}
}
