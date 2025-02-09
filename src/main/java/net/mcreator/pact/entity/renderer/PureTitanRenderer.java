
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

import net.mcreator.pact.entity.PureTitanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PureTitanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PureTitanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPureTitanNormal(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("dohtitans:textures/entities/pureskin.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.11.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPureTitanNormal extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;

		public ModelPureTitanNormal() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(36, 35).addBox(-4.0F, -8.5F, -3.0F, 8.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-3.0F, -8.5F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-4.0F, -7.0F, 3.5F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-3.0F, -8.0F, 3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-3.0F, -2.0F, 3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-3.0F, -8.0F, -4.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(2.0F, -6.0F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-2.0F, -6.0F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-4.5F, -7.0F, -3.9F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-4.5F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-4.5F, -5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-4.5F, -7.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(36, 35).addBox(-4.5F, -8.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(36, 35).addBox(3.5F, -8.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(3.5F, -7.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(3.5F, -5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(3.5F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(3.5F, -7.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-4.0F, -6.0F, -4.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(3.0F, -5.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(41, 40).addBox(-3.0F, -8.5F, 3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(19, 34).addBox(-2.0F, 3.0F, -2.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(19, 34).addBox(1.0F, 3.0F, -2.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
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
