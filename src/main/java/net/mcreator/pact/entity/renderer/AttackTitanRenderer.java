
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

import net.mcreator.pact.entity.AttackTitanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AttackTitanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AttackTitanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelAttackTitan(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("dohtitans:textures/entities/attacktitantexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.11.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelAttackTitan extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer RightEar;
		private final ModelRenderer RightEar2;
		private final ModelRenderer Mouth;
		private final ModelRenderer Hair;
		private final ModelRenderer Body;
		private final ModelRenderer Muscles;
		private final ModelRenderer RightArm;
		private final ModelRenderer Muscles2;
		private final ModelRenderer LeftArm;
		private final ModelRenderer Muscles3;
		private final ModelRenderer RightLeg;
		private final ModelRenderer Muscles5;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer Muscles4;

		public ModelAttackTitan() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			RightEar = new ModelRenderer(this);
			RightEar.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(RightEar);
			RightEar.setTextureOffset(1, 1).addBox(-4.4F, -4.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightEar.setTextureOffset(1, 1).addBox(-4.4F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightEar.setTextureOffset(1, 1).addBox(-4.4F, -5.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightEar2 = new ModelRenderer(this);
			RightEar2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(RightEar2);
			RightEar2.setTextureOffset(1, 1).addBox(3.4F, -4.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightEar2.setTextureOffset(1, 1).addBox(3.4F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightEar2.setTextureOffset(1, 1).addBox(3.4F, -5.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Mouth = new ModelRenderer(this);
			Mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(Mouth);
			Mouth.setTextureOffset(26, 3).addBox(-2.2F, -2.9F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Mouth.setTextureOffset(26, 1).addBox(-2.0F, -0.8F, -4.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Mouth.setTextureOffset(26, 3).addBox(1.2F, -2.9F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Hair = new ModelRenderer(this);
			Hair.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(Hair);
			Hair.setTextureOffset(24, 12).addBox(-4.5F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-1.0F, -8.0F, -4.5F, 1.0F, 6.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(10, 1).addBox(-2.0F, -8.0F, -4.5F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-3.0F, -8.0F, -4.5F, 1.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-4.0F, -6.0F, -4.5F, 1.0F, 4.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-4.1F, -4.0F, 3.5F, 1.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-3.1F, -3.0F, 3.5F, 1.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-2.1F, -3.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-3.1F, -7.0F, 3.5F, 2.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-2.1F, -8.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-1.1F, -8.0F, 3.5F, 3.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-0.1F, -6.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(0.9F, -5.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(1.9F, -7.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-1.1F, -3.0F, 3.5F, 1.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-0.1F, -3.0F, 3.5F, 1.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(0.9F, -3.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(1.9F, -2.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-4.5F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-4.5F, -6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-4.5F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 10).addBox(-4.5F, -8.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-4.5F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(24, 12).addBox(-3.5F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(24, 12).addBox(-4.5F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(24, 12).addBox(3.5F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(24, 12).addBox(3.5F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 10).addBox(3.5F, -8.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.1F, false);
			Hair.setTextureOffset(24, 12).addBox(2.5F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(24, 12).addBox(3.5F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(23, 11).addBox(3.5F, -6.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.1F, false);
			Hair.setTextureOffset(24, 12).addBox(3.5F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(3.0F, -6.0F, -4.5F, 1.0F, 5.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(1.9F, -7.0F, -4.5F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(-0.1F, -8.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(22, 9).addBox(0.9F, -5.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(10, 1).addBox(-3.0F, -8.0F, -3.5F, 5.0F, 2.0F, 1.0F, 0.1F, false);
			Hair.setTextureOffset(23, 12).addBox(-2.0F, -8.0F, -2.5F, 3.0F, 2.0F, 1.0F, 0.1F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Muscles = new ModelRenderer(this);
			Muscles.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(Muscles);
			Muscles.setTextureOffset(5, 16).addBox(-1.0F, -0.3F, 1.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(6, 16).addBox(-1.0F, 0.7F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(6, 15).addBox(-3.0F, -0.3F, 1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(6, 15).addBox(2.0F, -0.3F, 1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(5, 32).addBox(-3.0F, 0.7F, -2.3F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(13, 33).addBox(-4.0F, 1.7F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(13, 33).addBox(3.0F, 1.7F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(0, 32).addBox(1.0F, 4.7F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(0, 35).addBox(-3.0F, 4.7F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(0, 35).addBox(-3.0F, 6.7F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(0, 32).addBox(1.0F, 6.7F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(0, 32).addBox(1.0F, 8.7F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(0, 35).addBox(-3.0F, 8.7F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(0, 34).addBox(-1.0F, 10.7F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(13, 33).addBox(3.4F, 1.7F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(13, 33).addBox(-4.4F, 1.7F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(34, 32).addBox(-1.0F, 3.7F, 1.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(18, 32).addBox(-3.0F, 1.7F, 1.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(24, 32).addBox(1.0F, 1.7F, 1.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(30, 32).addBox(3.0F, 1.7F, 1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(30, 32).addBox(-4.0F, 1.7F, 1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(30, 36).addBox(-2.0F, 4.7F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles.setTextureOffset(30, 36).addBox(1.0F, 4.7F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(0, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			Muscles2 = new ModelRenderer(this);
			Muscles2.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightArm.addChild(Muscles2);
			Muscles2.setTextureOffset(12, 50).addBox(-3.2F, 9.2F, -1.8F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 36).addBox(-3.2F, -2.2F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 36).addBox(-3.2F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 36).addBox(-3.0F, -1.2F, 0.3F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 36).addBox(-3.0F, -1.2F, -2.3F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 36).addBox(-2.0F, -1.2F, -2.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 36).addBox(-2.0F, -1.2F, 0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 36).addBox(-3.2F, -1.2F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 44).addBox(-3.2F, 3.8F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			Muscles2.setTextureOffset(15, 47).addBox(-3.2F, 3.8F, -2.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles2.setTextureOffset(15, 47).addBox(-3.2F, 3.8F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles2.setTextureOffset(12, 50).addBox(-3.2F, 9.2F, 0.2F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(16, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			Muscles3 = new ModelRenderer(this);
			Muscles3.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftArm.addChild(Muscles3);
			setRotationAngle(Muscles3, 0.0F, 3.1416F, 0.0F);
			Muscles3.setTextureOffset(12, 50).addBox(-3.2F, 9.2F, -1.2F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 36).addBox(-3.2F, -2.2F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 36).addBox(-3.2F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 36).addBox(-3.0F, -1.2F, 0.3F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 36).addBox(-3.0F, -1.2F, -2.3F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 36).addBox(-2.0F, -1.2F, -2.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 36).addBox(-2.0F, -1.2F, 0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 36).addBox(-3.2F, -1.2F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 44).addBox(-3.2F, 3.8F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			Muscles3.setTextureOffset(15, 47).addBox(-3.2F, 3.8F, -2.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles3.setTextureOffset(15, 47).addBox(-3.2F, 3.8F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles3.setTextureOffset(12, 50).addBox(-3.2F, 9.2F, 0.8F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			Muscles5 = new ModelRenderer(this);
			Muscles5.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightLeg.addChild(Muscles5);
			setRotationAngle(Muscles5, 0.0F, 3.1416F, 0.0F);
			Muscles5.setTextureOffset(35, 0).addBox(1.2F, 1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			Muscles5.setTextureOffset(35, 0).addBox(1.2F, 5.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles5.setTextureOffset(35, 0).addBox(1.2F, 5.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles5.setTextureOffset(35, 0).addBox(1.0F, 1.0F, -2.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles5.setTextureOffset(35, 0).addBox(1.0F, 1.0F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles5.setTextureOffset(54, 0).addBox(1.0F, 5.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles5.setTextureOffset(54, 0).addBox(1.0F, 5.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles5.setTextureOffset(41, 0).addBox(-1.0F, 11.0F, 1.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles5.setTextureOffset(41, 6).addBox(0.0F, 3.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			Muscles4 = new ModelRenderer(this);
			Muscles4.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftLeg.addChild(Muscles4);
			Muscles4.setTextureOffset(35, 0).addBox(1.2F, 1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			Muscles4.setTextureOffset(35, 0).addBox(1.2F, 5.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles4.setTextureOffset(35, 0).addBox(1.2F, 5.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles4.setTextureOffset(35, 0).addBox(1.0F, 1.0F, -2.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles4.setTextureOffset(35, 0).addBox(1.0F, 1.0F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Muscles4.setTextureOffset(54, 0).addBox(1.0F, 5.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles4.setTextureOffset(54, 0).addBox(1.0F, 5.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Muscles4.setTextureOffset(41, 0).addBox(-1.0F, 11.0F, -2.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Muscles4.setTextureOffset(41, 6).addBox(0.0F, 3.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
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
