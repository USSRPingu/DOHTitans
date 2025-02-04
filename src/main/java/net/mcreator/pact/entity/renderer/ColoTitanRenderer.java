
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

import net.mcreator.pact.entity.ColoTitanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ColoTitanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ColoTitanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelColossalTitanCakedUp(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("dohtitans:textures/entities/colossaltexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.11.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelColossalTitanCakedUp extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer Titties;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;

		public ModelColossalTitanCakedUp() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(17, 0).addBox(3.4F, -4.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(25, 7).addBox(3.4F, -6.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(20, 3).addBox(3.4F, -6.0F, -1.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(23, 5).addBox(3.4F, -7.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(24, 5).addBox(3.4F, -4.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(25, 6).addBox(3.4F, -3.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(25, 6).addBox(3.4F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(17, 0).addBox(-4.4F, -4.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			Head.setTextureOffset(25, 7).addBox(-4.4F, -6.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(20, 3).addBox(-4.4F, -6.0F, -1.0F, 1.0F, 2.0F, 5.0F, 0.0F, true);
			Head.setTextureOffset(23, 5).addBox(-4.4F, -7.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			Head.setTextureOffset(24, 5).addBox(-4.4F, -4.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			Head.setTextureOffset(25, 6).addBox(-4.4F, -3.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Head.setTextureOffset(25, 6).addBox(-4.4F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Head.setTextureOffset(8, 4).addBox(-4.0F, -6.0F, 3.4F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 4).addBox(-1.0F, -6.0F, 3.4F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 2).addBox(-3.0F, -7.0F, 3.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 2).addBox(1.0F, -7.0F, 3.4F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(1, 8).addBox(-3.0F, -3.0F, 3.4F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 4).addBox(3.0F, -6.0F, 3.4F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(9, 3).addBox(3.0F, -6.0F, -4.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(9, 3).addBox(-4.0F, -6.0F, -4.4F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(9, 3).addBox(-3.0F, -2.0F, -4.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(11, 3).addBox(-2.0F, -3.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(10, 4).addBox(-1.0F, -4.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(11, 3).addBox(1.0F, -3.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(9, 3).addBox(2.0F, -2.0F, -4.4F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(8, 2).addBox(2.0F, -0.6F, -4.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(8, 2).addBox(-3.0F, -0.6F, -4.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			Head.setTextureOffset(10, 4).addBox(2.0F, -7.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(10, 4).addBox(-1.0F, -7.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(10, 4).addBox(-3.0F, -7.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(0, 7).addBox(-3.0F, -6.0F, -4.4F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(18, 50).addBox(-1.0F, 2.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(18, 48).addBox(-3.0F, 2.0F, 1.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(18, 48).addBox(1.0F, 2.0F, 1.3F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(12, 50).addBox(3.0F, 1.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(12, 50).addBox(-4.0F, 1.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(31, 56).addBox(-4.0F, 3.0F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(31, 56).addBox(3.0F, 3.0F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(35, 52).addBox(2.0F, 4.0F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(12, 58).addBox(-1.0F, 6.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(12, 56).addBox(0.0F, 7.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(25, 46).addBox(2.0F, 8.0F, 1.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(25, 46).addBox(-3.0F, 8.0F, 1.3F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(25, 42).addBox(1.0F, 9.0F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(52, 53).addBox(1.0F, 11.3F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(52, 53).addBox(-3.0F, 11.3F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(25, 42).addBox(-2.0F, 9.0F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(57, 50).addBox(3.0F, 9.0F, 1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(57, 50).addBox(-4.0F, 9.0F, 1.3F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(35, 52).addBox(-3.0F, 4.0F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(30, 47).addBox(1.0F, 1.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(30, 47).addBox(-2.0F, 1.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(48, 50).addBox(-4.0F, 2.0F, -2.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(42, 52).addBox(-2.0F, 3.0F, -2.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(32, 62).addBox(-1.0F, 4.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(42, 52).addBox(1.0F, 3.0F, -2.3F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(48, 50).addBox(2.0F, 2.0F, -2.3F, 2.0F, 3.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(54, 58).addBox(1.0F, 7.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(54, 58).addBox(-3.0F, 7.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(48, 54).addBox(-1.0F, 6.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(48, 56).addBox(-1.0F, 8.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(53, 56).addBox(-3.0F, 9.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(53, 56).addBox(1.0F, 9.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(47, 61).addBox(-2.0F, 10.0F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(26, 45).addBox(3.3F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(54, 60).addBox(3.3F, 9.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(44, 52).addBox(3.3F, 8.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(44, 52).addBox(3.3F, 6.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(46, 58).addBox(3.3F, 5.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(2, 54).addBox(3.3F, 3.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(9, 61).addBox(3.3F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(50, 58).addBox(3.3F, 1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(50, 58).addBox(-4.3F, 1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(21, 53).addBox(-4.3F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(2, 54).addBox(-4.3F, 3.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, true);
			Body.setTextureOffset(46, 58).addBox(-4.3F, 5.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(44, 52).addBox(-4.3F, 6.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(44, 52).addBox(-4.3F, 8.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(54, 60).addBox(-4.3F, 9.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(26, 45).addBox(-4.3F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
			Body.setTextureOffset(12, 58).addBox(0.0F, 6.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(12, 56).addBox(-1.0F, 7.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Titties = new ModelRenderer(this);
			Titties.setRotationPoint(0.0F, 7.4F, 0.0F);
			Body.addChild(Titties);
			setRotationAngle(Titties, 0.0F, 3.1416F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(4.4F, 0.4F, 0.0F);
			Titties.addChild(cube_r1);
			setRotationAngle(cube_r1, -1.1694F, 0.0139F, -1.5813F);
			cube_r1.setTextureOffset(56, 45).addBox(-3.5F, 0.2F, -4.9F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(4.4F, 0.4F, 0.0F);
			Titties.addChild(cube_r2);
			setRotationAngle(cube_r2, -1.1694F, 0.0139F, 1.5603F);
			cube_r2.setTextureOffset(56, 44).addBox(0.6F, 2.2F, -0.3F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r2.setTextureOffset(56, 44).addBox(0.6F, 1.9F, -0.3F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-0.2F, 0.0F, 0.0F);
			Titties.addChild(cube_r3);
			setRotationAngle(cube_r3, -1.4835F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(56, 44).addBox(0.6F, 1.5F, -0.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r3.setTextureOffset(56, 44).addBox(-3.2F, 1.5F, -0.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.2F, 0.0F, 0.0F);
			Titties.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.5411F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(56, 44).addBox(0.6F, 1.4F, -2.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r4.setTextureOffset(56, 44).addBox(-3.2F, 1.4F, -2.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.2F, 0.0F, 0.0F);
			Titties.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(52, 46).addBox(0.6F, 1.0F, -3.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
			cube_r5.setTextureOffset(52, 46).addBox(-3.2F, 1.0F, -3.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(4.0F, 4.9F, 0.0F);
			Titties.addChild(cube_r6);
			setRotationAngle(cube_r6, -1.4835F, 0.0F, 3.1416F);
			cube_r6.setTextureOffset(56, 44).addBox(0.6F, 1.5F, -0.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(4.0F, 4.9F, 0.0F);
			Titties.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.5585F, 0.0F, 3.1416F);
			cube_r7.setTextureOffset(56, 44).addBox(0.6F, 1.4F, -2.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-4.4F, 0.4F, 0.0F);
			Titties.addChild(cube_r8);
			setRotationAngle(cube_r8, -1.1694F, -0.0139F, -1.5603F);
			cube_r8.setTextureOffset(56, 44).addBox(-3.6F, 1.9F, -0.3F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r8.setTextureOffset(56, 44).addBox(-3.6F, 2.2F, -0.3F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-4.0F, 4.9F, 0.0F);
			Titties.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.5585F, 0.0F, -3.1416F);
			cube_r9.setTextureOffset(56, 44).addBox(-3.6F, 1.4F, -2.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-4.0F, 4.9F, 0.0F);
			Titties.addChild(cube_r10);
			setRotationAngle(cube_r10, -1.4835F, 0.0F, -3.1416F);
			cube_r10.setTextureOffset(56, 44).addBox(-3.6F, 1.5F, -0.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-4.4F, 0.4F, 0.0F);
			Titties.addChild(cube_r11);
			setRotationAngle(cube_r11, -1.1694F, -0.0139F, 1.5813F);
			cube_r11.setTextureOffset(56, 45).addBox(0.5F, 0.2F, -4.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(24, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(27, 61).addBox(-1.0F, -1.0F, 1.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(43, 62).addBox(-1.0F, 1.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(7, 60).addBox(0.0F, 2.0F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(43, 60).addBox(0.0F, 8.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(43, 57).addBox(-3.3F, 8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(27, 56).addBox(-2.0F, 6.0F, -2.3F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(21, 55).addBox(-2.0F, 2.0F, -2.3F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(15, 55).addBox(-3.0F, -1.0F, -2.3F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(37, 56).addBox(-2.0F, -1.0F, -2.3F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(12, 48).addBox(-3.3F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(27, 50).addBox(-3.3F, 3.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(24, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			LeftArm.setTextureOffset(27, 50).addBox(2.3F, 3.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, true);
			LeftArm.setTextureOffset(27, 61).addBox(-1.0F, -1.0F, 1.3F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(43, 62).addBox(0.0F, 1.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(7, 60).addBox(-1.0F, 2.0F, 1.3F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(43, 60).addBox(-1.0F, 8.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftArm.setTextureOffset(43, 57).addBox(2.3F, 8.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			LeftArm.setTextureOffset(27, 56).addBox(1.0F, 6.0F, -2.3F, 1.0F, 3.0F, 2.0F, 0.0F, true);
			LeftArm.setTextureOffset(21, 55).addBox(1.0F, 2.0F, -2.3F, 1.0F, 3.0F, 2.0F, 0.0F, true);
			LeftArm.setTextureOffset(15, 55).addBox(2.0F, -1.0F, -2.3F, 1.0F, 3.0F, 2.0F, 0.0F, true);
			LeftArm.setTextureOffset(37, 56).addBox(1.0F, -1.0F, -2.3F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			LeftArm.setTextureOffset(12, 48).addBox(2.3F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, true);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(40, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(47, 32).addBox(-2.0F, 2.0F, 1.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(37, 32).addBox(-2.0F, 2.0F, -2.3F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(47, 32).addBox(-1.0F, 4.0F, -2.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(49, 32).addBox(-2.3F, 2.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(43, 45).addBox(-2.0F, 6.0F, 1.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(49, 44).addBox(-2.3F, 6.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(43, 42).addBox(-2.3F, 9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(39, 51).addBox(-2.0F, 6.0F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(40, 49).addBox(0.0F, 8.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(37, 46).addBox(-1.0F, 9.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(37, 48).addBox(-1.0F, 9.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(43, 40).addBox(-1.0F, 11.0F, 1.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(43, 37).addBox(-1.0F, 11.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(52, 39).addBox(-1.0F, 11.3F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(40, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			LeftLeg.setTextureOffset(43, 42).addBox(1.3F, 9.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			LeftLeg.setTextureOffset(47, 32).addBox(0.0F, 4.0F, -2.3F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(43, 45).addBox(0.0F, 6.0F, 1.3F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(52, 39).addBox(-1.0F, 11.3F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, true);
			LeftLeg.setTextureOffset(37, 32).addBox(-1.0F, 2.0F, -2.3F, 3.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(49, 32).addBox(0.3F, 2.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);
			LeftLeg.setTextureOffset(47, 32).addBox(0.0F, 2.0F, 1.3F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(39, 51).addBox(0.0F, 6.0F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(40, 49).addBox(-1.0F, 8.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(37, 46).addBox(0.0F, 9.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(49, 44).addBox(0.3F, 6.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);
			LeftLeg.setTextureOffset(37, 48).addBox(0.0F, 9.0F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(43, 40).addBox(-1.0F, 11.0F, 1.3F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftLeg.setTextureOffset(43, 37).addBox(-1.0F, 11.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, true);
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
