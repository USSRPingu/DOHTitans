// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTitanscares extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelTitanscares() {
		textureWidth = 16;
		textureHeight = 16;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 25.0F, 0.0F);
		Head.addChild(bb_main);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.1F, -26.2F, -3.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0352F, -0.1063F, -1.3948F);
		cube_r1.setTextureOffset(0, 2).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.3F, -25.3F, -3.1F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0276F, 0.1101F, 1.4122F);
		cube_r2.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}