package net.mcreator.pact.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;

import net.mcreator.pact.potion.HandcuffsPotionPotionEffect;
import net.mcreator.pact.entity.renderer.HandcuffsEntityRenderer;
import net.mcreator.pact.DohtitansMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class HandcuffSkinProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void KleidersRenderEvent(RenderLivingEvent event) {
			Entity entity = event.getEntity();
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

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DohtitansMod.LOGGER.warn("Failed to load dependency entity for procedure HandcuffSkin!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Object _obj = dependencies.get("event");
		RenderLivingEvent _evt = (RenderLivingEvent) _obj;
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == HandcuffsPotionPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (_evt.getRenderer() instanceof PlayerRenderer) {
				if (_evt instanceof RenderLivingEvent.Pre) {
					//  _evt.setCanceled(true); 
				}
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(_evt.getRenderer().getRenderManager(),
						new ResourceLocation("pact:textures/entities/Handcuffs.png"), new HandcuffsEntityRenderer.ModelHandcuffs())
						.render((AbstractClientPlayerEntity) _evt.getEntity(), _evt.getEntity().rotationYaw, _evt.getPartialRenderTick(),
								_evt.getMatrixStack(), _evt.getBuffers(), _evt.getLight());
			}
		}
	}
}
