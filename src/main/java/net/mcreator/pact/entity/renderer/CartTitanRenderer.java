
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

import net.mcreator.pact.entity.CartTitanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CartTitanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CartTitanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPaCCartTitanCrawl(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("dohtitans:textures/entities/pac_carttitan_texture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.10.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPaCCartTitanCrawl extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;

		public ModelPaCCartTitanCrawl() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 15.0F, -17.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(19, 9).addBox(-2.0F, -8.4F, -4.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(11, 2).addBox(3.4F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(10, 4).addBox(3.4F, -7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(6, 4).addBox(3.4F, -6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(8, 3).addBox(3.4F, -5.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(9, 3).addBox(3.4F, -5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(11, 4).addBox(3.4F, -6.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 3).addBox(-2.0F, -6.0F, 3.4F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(9, 3).addBox(-2.0F, -7.0F, 3.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 8).addBox(-4.4F, -6.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(11, 1).addBox(-4.4F, -5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 1).addBox(-4.4F, -7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(6, 4).addBox(-4.4F, -6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(8, 2).addBox(-4.4F, -5.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 16).addBox(-3.0F, -4.3F, -9.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 12.0F, -13.0F);
			setRotationAngle(Body, 1.5708F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(19, 20).addBox(-4.0F, 1.0F, -2.2F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(25, 20).addBox(2.0F, 1.0F, -2.2F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(21, 21).addBox(-2.0F, 2.0F, -2.2F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(20, 24).addBox(-3.0F, 5.0F, -2.2F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(18, 20).addBox(-4.2F, 2.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(25, 20).addBox(3.2F, 2.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 14.0F, -11.0F);
			RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightArm.setTextureOffset(-3, -2).addBox(-2.0F, -2.2F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(-1, 0).addBox(-3.0F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(-1, 0).addBox(-3.2F, -2.0F, -1.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 1).addBox(-3.2F, 2.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 1).addBox(-3.2F, 2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(1, 1).addBox(-2.0F, -2.0F, -2.2F, 2.0F, 8.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 1).addBox(-3.2F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 1).addBox(-3.2F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 14.0F, -12.0F);
			LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
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
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
