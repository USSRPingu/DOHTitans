
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

import net.mcreator.pact.entity.HandcuffsEntityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HandcuffsEntityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HandcuffsEntityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelHandcuffs(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("dohtitans:textures/entities/handcuffs.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.11.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelHandcuffs extends EntityModel<Entity> {
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer LeftArm;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;

		public ModelHandcuffs() {
			textureWidth = 32;
			textureHeight = 32;
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(12, 6).addBox(-4.0F, 7.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(12, 12).addBox(0.0F, 7.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-1.0F, 9.0F, 2.0F);
			RightArm.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
			cube_r1.setTextureOffset(12, 18).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-1.0F, 9.0F, -2.0F);
			RightArm.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
			cube_r2.setTextureOffset(0, 18).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(0, 0).addBox(-2.0F, 7.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 6).addBox(2.0F, 7.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(1.0F, 9.0F, 2.0F);
			LeftArm.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
			cube_r3.setTextureOffset(12, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(1.0F, 9.0F, -2.0F);
			LeftArm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
			cube_r4.setTextureOffset(0, 12).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
