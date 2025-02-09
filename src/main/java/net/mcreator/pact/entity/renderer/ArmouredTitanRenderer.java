
package net.mcreator.pact.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.pact.entity.ArmouredTitanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ArmouredTitanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ArmouredTitanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelArmoredTitan(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("dohtitans:textures/entities/armouredskin.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.11.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelArmoredTitan extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;

		public ModelArmoredTitan() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(-4.4F, -5.0F, 2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(25, 9).addBox(-4.4F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(-4.4F, -7.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(-4.4F, -5.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(25, 9).addBox(-4.4F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(25, 9).addBox(3.4F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(25, 9).addBox(3.0F, -6.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(25, 9).addBox(2.0F, -7.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(25, 9).addBox(-2.0F, -7.0F, -4.4F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(25, 9).addBox(-4.0F, -6.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(1, 17).addBox(-3.0F, -5.0F, -4.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(1, 17).addBox(-1.0F, -4.0F, -4.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(1, 17).addBox(1.0F, -5.0F, -4.6F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(9, 19).addBox(-4.0F, -2.0F, -4.6F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(9, 19).addBox(3.0F, -3.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(9, 19).addBox(-4.0F, -3.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(9, 19).addBox(-3.0F, -1.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(9, 19).addBox(-1.0F, -1.0F, -4.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 17).addBox(-1.0F, -0.5F, -4.1F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(8, 17).addBox(-3.0F, -0.5F, -4.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(8, 17).addBox(2.0F, -0.5F, -4.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Head.setTextureOffset(9, 19).addBox(2.0F, -1.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(9, 19).addBox(3.5F, -3.0F, -4.1F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(9, 19).addBox(3.5F, -3.0F, -2.1F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(9, 19).addBox(-4.5F, -3.0F, -2.1F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(9, 19).addBox(-4.5F, -3.0F, -4.1F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(3.4F, -5.0F, 2.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);
			Head.setTextureOffset(25, 9).addBox(3.4F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(3.4F, -7.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(3.4F, -5.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(-4.0F, -5.0F, 3.4F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(-3.0F, -4.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(-2.0F, -6.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(-2.0F, -3.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(-1.0F, -5.0F, 3.4F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(0.0F, -5.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(0.0F, -2.0F, 3.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(1.0F, -3.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(1.0F, -6.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(2.0F, -4.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(3.0F, -5.0F, 3.4F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(25, 9).addBox(-3.0F, -7.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(25, 9).addBox(-1.0F, -7.0F, -4.4F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(0.0F, -5.0F, 3.4F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(-1.0F, -5.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(24, 8).addBox(-1.0F, -2.0F, 3.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(56, 9).addBox(-3.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(52, 8).addBox(2.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(44, 8).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(37, 8).addBox(-1.0F, 0.0F, 1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(18, 3).addBox(2.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(29, 6).addBox(-3.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(16, 2).addBox(-4.0F, 3.0F, 1.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(55, 14).addBox(-4.5F, 3.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(18, 4).addBox(-4.5F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(45, 11).addBox(-4.5F, 7.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(39, 11).addBox(-4.5F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(29, 11).addBox(-4.5F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(6, 8).addBox(-4.5F, 10.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(19, 2).addBox(3.0F, 3.0F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(18, 4).addBox(2.0F, 6.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(17, 2).addBox(0.0F, 5.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(17, 2).addBox(1.0F, 3.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(12, 11).addBox(-1.0F, 3.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(58, 20).addBox(3.5F, 3.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(38, 17).addBox(3.5F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(37, 12).addBox(3.5F, 7.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(6, 11).addBox(3.5F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 10).addBox(3.5F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(7, 5).addBox(3.5F, 10.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(36, 32).addBox(-4.0F, 2.0F, -2.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(40, 34).addBox(-3.0F, 3.0F, -2.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 5).addBox(1.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(4, 5).addBox(-2.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 7).addBox(-3.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(19, 4).addBox(2.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(17, 3).addBox(-2.0F, 4.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(60, 14).addBox(1.0F, 4.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(16, 3).addBox(-1.0F, 5.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(58, 26).addBox(-1.0F, 7.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(58, 28).addBox(-1.0F, 9.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(58, 30).addBox(-1.0F, 11.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(56, 32).addBox(-1.0F, 11.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 19).addBox(2.0F, 11.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(56, 35).addBox(-4.0F, 11.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(52, 36).addBox(-4.0F, 11.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(46, 36).addBox(3.0F, 11.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(42, 37).addBox(3.0F, 11.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(40, 39).addBox(2.0F, 10.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(44, 39).addBox(3.0F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(48, 39).addBox(2.0F, 6.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(52, 39).addBox(3.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(57, 38).addBox(-4.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(60, 39).addBox(-3.0F, 6.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(56, 40).addBox(-3.0F, 10.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(40, 41).addBox(-4.0F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(44, 41).addBox(-4.0F, 11.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(52, 41).addBox(-3.0F, 11.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(40, 43).addBox(-2.0F, 10.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(44, 43).addBox(-3.0F, 8.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(48, 43).addBox(-1.0F, 8.0F, 1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(55, 42).addBox(2.0F, 8.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(58, 43).addBox(2.0F, 11.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 22).addBox(3.0F, 9.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(4, 22).addBox(-4.0F, 9.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(8, 22).addBox(1.0F, 10.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(50, 0).addBox(-2.0F, -2.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(56, 0).addBox(-3.0F, -1.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(44, 0).addBox(-3.0F, 0.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(40, 0).addBox(-2.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(36, 0).addBox(-2.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(30, 0).addBox(-2.0F, -2.0F, 1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(22, 0).addBox(-3.0F, -1.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(16, 0).addBox(-3.0F, 0.0F, 1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(17, 2).addBox(-3.5F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(19, 3).addBox(-3.5F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(4, 0).addBox(-3.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 0).addBox(-3.5F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(60, 2).addBox(-3.5F, 4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(56, 3).addBox(-3.5F, 5.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(54, 3).addBox(-3.5F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(50, 2).addBox(-3.5F, 3.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(46, 2).addBox(-3.0F, 3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(42, 2).addBox(-2.0F, 4.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(38, 2).addBox(-2.0F, 3.0F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(60, 7).addBox(-1.0F, 7.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(56, 7).addBox(-2.0F, 8.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(53, 6).addBox(-1.0F, 9.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(49, 6).addBox(-3.0F, 9.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(45, 6).addBox(-3.5F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(34, 2).addBox(-3.5F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(30, 2).addBox(-3.5F, 9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(26, 2).addBox(-1.0F, 2.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(22, 2).addBox(-3.5F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(20, 3).addBox(-3.0F, 8.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 3).addBox(-2.0F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(4, 3).addBox(-2.0F, 9.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(17, 4).addBox(-3.0F, 9.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(20, 2).addBox(-3.0F, 9.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(15, 2).addBox(-1.0F, 9.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(42, 7).addBox(-1.0F, 8.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(10.0F, 0.0F, 0.0F);
			RightArm.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 3.1416F);
			cube_r1.setTextureOffset(30, 4).addBox(10.0F, 1.5F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r1.setTextureOffset(33, 6).addBox(11.0F, 1.5F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r1.setTextureOffset(17, 3).addBox(10.0F, 1.5F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			LeftArm.setTextureOffset(19, 3).addBox(2.5F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(30, 0).addBox(0.0F, -2.0F, 1.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(22, 0).addBox(0.0F, -1.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(17, 2).addBox(1.0F, 0.0F, 1.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(44, 0).addBox(1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(56, 0).addBox(0.0F, -1.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(50, 0).addBox(0.0F, -2.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(40, 0).addBox(1.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(36, 0).addBox(1.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(26, 2).addBox(0.0F, 2.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(17, 4).addBox(2.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(18, 3).addBox(2.5F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(0, 0).addBox(2.5F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(60, 2).addBox(2.5F, 4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(56, 3).addBox(2.5F, 5.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			LeftArm.setTextureOffset(54, 3).addBox(2.5F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(50, 2).addBox(2.5F, 3.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(46, 2).addBox(2.0F, 3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(42, 2).addBox(1.0F, 4.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(42, 7).addBox(0.0F, 8.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(38, 2).addBox(1.0F, 3.0F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(60, 7).addBox(0.0F, 7.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(56, 7).addBox(1.0F, 8.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(53, 6).addBox(0.0F, 9.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(17, 4).addBox(2.0F, 9.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(18, 3).addBox(2.5F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(34, 2).addBox(2.5F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(19, 3).addBox(2.5F, 9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(18, 3).addBox(2.5F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(19, 3).addBox(2.0F, 8.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(16, 2).addBox(0.0F, 9.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(0, 3).addBox(1.0F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(4, 3).addBox(1.0F, 9.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(18, 3).addBox(2.0F, 9.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(16, 3).addBox(2.0F, 9.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(17, 4).addBox(0.0F, -2.5F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(33, 6).addBox(1.0F, -2.5F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(30, 4).addBox(0.0F, -2.5F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(12, 18).addBox(0.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(16, 18).addBox(0.0F, 3.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(20, 18).addBox(0.0F, 6.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(24, 18).addBox(-2.0F, 6.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(28, 17).addBox(-2.0F, 8.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(32, 18).addBox(0.0F, 8.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(16, 20).addBox(-2.5F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(20, 20).addBox(-2.5F, 6.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(24, 20).addBox(-2.5F, 4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(28, 20).addBox(-2.5F, 6.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(32, 20).addBox(-2.5F, 7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(16, 22).addBox(-2.5F, 9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(20, 22).addBox(-2.5F, 3.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(24, 22).addBox(-2.5F, 1.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(16, 25).addBox(-2.5F, 2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(28, 24).addBox(-2.0F, 2.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(32, 22).addBox(-1.0F, 1.0F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(23, 27).addBox(0.0F, 5.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(16, 28).addBox(-1.0F, 6.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(27, 27).addBox(-2.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(31, 27).addBox(-1.0F, 10.0F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(25, 29).addBox(-1.0F, 10.0F, 1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(33, 27).addBox(-1.0F, 11.5F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(20, 30).addBox(-2.0F, 4.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(37, 20).addBox(-1.0F, 2.0F, 1.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			LeftLeg.setTextureOffset(37, 20).addBox(0.0F, 2.0F, 1.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(12, 18).addBox(-1.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(16, 18).addBox(-1.0F, 3.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(20, 18).addBox(-1.0F, 6.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(33, 27).addBox(-1.0F, 11.5F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, true);
			LeftLeg.setTextureOffset(20, 30).addBox(1.0F, 4.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(24, 18).addBox(1.0F, 6.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(28, 17).addBox(1.0F, 8.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(32, 18).addBox(-1.0F, 8.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(16, 20).addBox(1.5F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(20, 20).addBox(1.5F, 6.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(24, 20).addBox(1.5F, 4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(28, 20).addBox(1.5F, 6.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(32, 20).addBox(1.5F, 7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(16, 22).addBox(1.5F, 9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(20, 22).addBox(1.5F, 3.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(24, 22).addBox(1.5F, 1.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(16, 25).addBox(1.5F, 2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(28, 24).addBox(1.0F, 2.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(32, 22).addBox(0.0F, 1.0F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(23, 27).addBox(-1.0F, 5.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(16, 28).addBox(0.0F, 6.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(27, 27).addBox(1.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(31, 27).addBox(-1.0F, 10.0F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(25, 29).addBox(-1.0F, 10.0F, 1.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
