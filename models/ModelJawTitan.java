// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelJawTitan extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r4;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public ModelJawTitan() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 12.0F, -4.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(4, 16).addBox(-1.0F, -1.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(-3.0F, -0.6F, -4.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(11, 16).addBox(1.0F, -1.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(11, 16).addBox(3.0F, -1.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(11, 16).addBox(-4.0F, -1.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-4.4F, -7.9F, -3.9F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(3.4F, -7.9F, -3.9F, 1.0F, 7.0F, 3.0F, 0.0F, true);
		Head.setTextureOffset(6, 16).addBox(1.6F, -1.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(6, 16).addBox(-2.6F, -1.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(10, 16).addBox(-1.2F, -1.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(10, 16).addBox(0.2F, -1.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(3.0F, -2.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(1.6F, -2.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(8, 16).addBox(0.2F, -2.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(8, 16).addBox(-1.2F, -2.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-2.6F, -2.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-4.0F, -2.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-4.0F, -3.0F, -4.4F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 16).addBox(-1.0F, -4.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(12, 16).addBox(-4.0F, -4.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(12, 16).addBox(3.0F, -4.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-3.0F, -5.0F, -4.4F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(12, 16).addBox(-1.0F, -6.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(11, 16).addBox(2.0F, -6.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(11, 16).addBox(-4.0F, -6.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-2.0F, -7.0F, -4.4F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(-3.0F, -1.0F, -4.4F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		Head.setTextureOffset(18, 16).addBox(-4.0F, -1.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(18, 16).addBox(-4.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(21, 16).addBox(-4.5F, -2.0F, -3.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(19, 16).addBox(-4.5F, -2.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(18, 16).addBox(-4.5F, -3.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(16, 16).addBox(-4.5F, -4.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(17, 16).addBox(-4.5F, -5.0F, -1.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(18, 17).addBox(-4.0F, -5.0F, 3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(18, 17).addBox(-3.0F, -6.0F, 3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(18, 17).addBox(-3.0F, -4.0F, 3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(18, 17).addBox(-1.0F, -3.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(18, 17).addBox(2.0F, -4.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(18, 17).addBox(1.0F, -5.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(18, 17).addBox(1.0F, -6.0F, 3.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(18, 17).addBox(-1.0F, -7.0F, 3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(18, 17).addBox(-1.0F, -8.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(19, 16).addBox(-4.5F, -6.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(-4.5F, -7.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(-4.5F, -7.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(19, 16).addBox(-4.5F, -6.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(17, 16).addBox(-4.5F, -5.0F, -1.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(16, 16).addBox(-4.5F, -4.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(18, 16).addBox(-4.5F, -3.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(19, 16).addBox(-4.5F, -2.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(21, 16).addBox(-4.5F, -2.0F, -3.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(18, 16).addBox(-4.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(19, 17).addBox(-4.0F, -1.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(17, 16).addBox(3.5F, -5.0F, -1.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(16, 16).addBox(3.5F, -4.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, true);
		Head.setTextureOffset(18, 16).addBox(3.5F, -3.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(19, 16).addBox(3.5F, -2.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
		Head.setTextureOffset(21, 16).addBox(3.5F, -2.0F, -3.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(18, 16).addBox(3.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(22, 16).addBox(3.0F, -1.4F, -3.9F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(2.0F, -1.4F, -3.9F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(1.0F, -1.4F, -3.9F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(0.0F, -1.4F, -3.9F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(-1.0F, -1.4F, -3.9F, 1.0F, 2.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(20, 16).addBox(-2.0F, -1.4F, -3.9F, 1.0F, 2.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(20, 16).addBox(-3.0F, -1.4F, -3.9F, 1.0F, 2.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(22, 16).addBox(-4.0F, -1.4F, -3.9F, 1.0F, 2.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(18, 16).addBox(3.0F, -1.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(19, 16).addBox(3.5F, -6.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
		Head.setTextureOffset(20, 16).addBox(3.5F, -7.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, true);
		Head.setTextureOffset(12, 16).addBox(3.0F, -8.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(12, 16).addBox(-4.0F, -8.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		Head.setTextureOffset(9, 16).addBox(0.0F, -8.5F, -4.0F, 3.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(13, 18).addBox(-2.0F, -8.5F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(13, 18).addBox(-4.0F, -8.0F, -4.5F, 8.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(14, 16).addBox(-3.0F, -8.5F, -4.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(19, 21).addBox(-4.0F, -8.5F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(19, 21).addBox(-4.0F, -8.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(11, 16).addBox(-3.0F, -1.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(2.0F, -1.0F, -4.4F, 1.0F, 1.0F, 1.0F, -0.1F, true);
		Head.setTextureOffset(18, 17).addBox(2.0F, -5.0F, 3.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(18, 17).addBox(1.0F, -4.0F, 3.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(18, 17).addBox(0.0F, -3.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(18, 17).addBox(-3.0F, -4.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(18, 17).addBox(-2.0F, -5.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(18, 17).addBox(0.0F, -8.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(19, 17).addBox(3.0F, -1.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(9, 16).addBox(-3.0F, -8.5F, -4.0F, 3.0F, 1.0F, 7.0F, 0.0F, true);
		Head.setTextureOffset(14, 16).addBox(0.0F, -8.5F, -4.0F, 3.0F, 1.0F, 6.0F, 0.0F, true);
		Head.setTextureOffset(19, 21).addBox(1.0F, -8.5F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(19, 21).addBox(3.0F, -8.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);
		Head.setTextureOffset(4, 16).addBox(-1.0F, -1.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-3.0F, -0.6F, -4.1F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-4.0F, -3.0F, -4.4F, 8.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(9, 16).addBox(-1.0F, -4.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-3.0F, -5.0F, -4.4F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(12, 16).addBox(-1.0F, -6.0F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 16).addBox(-2.0F, -7.0F, -4.4F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(18, 17).addBox(-1.0F, -7.0F, 3.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(13, 18).addBox(-2.0F, -8.5F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -12.0F, 4.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(13, 18).addBox(0.0F, 4.0F, -4.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -12.0F, 4.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(13, 18).addBox(-8.0F, 4.0F, -4.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 12.0F, -4.0F);
		setRotationAngle(Body, 1.4399F, 0.0F, 0.0F);
		Body.setTextureOffset(36, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(0, 59).addBox(-4.0F, 2.0F, -2.2F, 8.0F, 3.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 56).addBox(-3.0F, 5.0F, -2.2F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(20, 61).addBox(-4.0F, 1.0F, -2.2F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(20, 61).addBox(2.0F, 1.0F, -2.2F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		Body.setTextureOffset(0, 51).addBox(3.2F, 2.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 51).addBox(-4.2F, 2.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		Body.setTextureOffset(22, 56).addBox(-4.2F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(22, 56).addBox(3.2F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(0, 48).addBox(-3.0F, 4.0F, 0.2F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 43).addBox(-4.0F, 1.0F, 0.2F, 8.0F, 3.0F, 2.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 14.0F, -4.0F);
		RightArm.setTextureOffset(32, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(12, 48).addBox(-2.0F, -2.2F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 39).addBox(-3.0F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(22, 42).addBox(-3.2F, -2.0F, -1.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(18, 35).addBox(-2.0F, -2.0F, 1.2F, 2.0F, 8.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(18, 35).addBox(-2.0F, -2.0F, -2.2F, 2.0F, 8.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 49).addBox(-3.0F, -1.0F, -2.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 43).addBox(0.2F, 2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 40).addBox(0.2F, 2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 36).addBox(0.0F, -2.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(24, 38).addBox(0.2F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 60).addBox(0.2F, -2.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 30).addBox(0.2F, -2.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(14, 36).addBox(-3.0F, 2.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(10, 36).addBox(-3.2F, 2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(32, 48).addBox(-3.2F, 2.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(32, 45).addBox(-3.2F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(14, 40).addBox(-3.2F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(6, 39).addBox(0.0F, -2.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 57).addBox(0.0F, 2.0F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 52).addBox(-3.0F, 2.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(10, 40).addBox(-3.0F, -1.0F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 46).addBox(0.0F, 2.0F, -2.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(32, 42).addBox(-3.0F, 8.0F, -2.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(32, 42).addBox(-1.0F, 8.0F, -2.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -12.0F, 4.0F);
		RightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.setTextureOffset(32, 42).addBox(5.0F, 21.3F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(32, 42).addBox(5.0F, 20.0F, -3.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(32, 42).addBox(3.0F, 20.0F, -3.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(32, 42).addBox(5.0F, 21.3F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(32, 42).addBox(3.0F, 21.3F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 14.0F, -4.0F);
		LeftArm.setTextureOffset(48, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
		LeftArm.setTextureOffset(28, 52).addBox(2.0F, 2.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(12, 48).addBox(-1.0F, -2.2F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, true);
		LeftArm.setTextureOffset(0, 39).addBox(2.0F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(22, 42).addBox(2.2F, -2.0F, -1.0F, 1.0F, 8.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(18, 35).addBox(0.0F, -2.0F, 1.2F, 2.0F, 8.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(18, 35).addBox(0.0F, -2.0F, -2.2F, 2.0F, 8.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(28, 57).addBox(-1.0F, 2.0F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(6, 39).addBox(-1.0F, -2.0F, 1.2F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(10, 40).addBox(2.0F, -1.0F, 1.2F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(28, 49).addBox(2.0F, -1.0F, -2.2F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(14, 40).addBox(2.2F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(28, 40).addBox(-1.2F, 2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(0, 30).addBox(-1.2F, -2.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(14, 36).addBox(2.0F, 2.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(10, 36).addBox(2.2F, 2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(32, 48).addBox(2.2F, 2.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(32, 45).addBox(2.2F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(28, 36).addBox(-1.0F, -2.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(24, 38).addBox(-1.2F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(28, 60).addBox(-1.2F, -2.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(28, 46).addBox(-1.0F, 2.0F, -2.2F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(28, 43).addBox(-1.2F, 2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(32, 42).addBox(2.0F, 8.0F, -2.3F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(32, 42).addBox(0.0F, 8.0F, -2.3F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -12.0F, 4.0F);
		LeftArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.setTextureOffset(32, 42).addBox(-4.0F, 21.3F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r4.setTextureOffset(32, 42).addBox(-6.0F, 21.3F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r4.setTextureOffset(32, 42).addBox(-6.0F, 21.3F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r4.setTextureOffset(32, 42).addBox(-4.0F, 20.0F, -3.3F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r4.setTextureOffset(32, 42).addBox(-6.0F, 20.0F, -3.3F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 6.0F);
		RightLeg.setTextureOffset(32, 22).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(56, 13).addBox(-1.0F, 6.0F, -2.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(56, 11).addBox(-1.0F, 8.0F, -2.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(45, 7).addBox(0.0F, 11.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(45, 7).addBox(0.0F, 11.3F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(45, 7).addBox(-2.0F, 11.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(45, 7).addBox(-2.3F, 11.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(45, 7).addBox(-2.0F, 11.3F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(46, 5).addBox(0.0F, 2.0F, -2.2F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(39, 5).addBox(-2.0F, 1.0F, -2.2F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(50, 9).addBox(-2.2F, 0.0F, -1.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(44, 9).addBox(-1.0F, 0.0F, 1.2F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(40, 9).addBox(-2.2F, 1.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(40, 12).addBox(-2.2F, 1.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(36, 11).addBox(-2.0F, 1.0F, 1.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(32, 11).addBox(1.0F, 2.0F, 1.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(36, 7).addBox(1.0F, 2.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(32, 7).addBox(-2.0F, 1.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(32, 0).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(32, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 6.0F);
		LeftLeg.setTextureOffset(40, 12).addBox(1.2F, 1.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(36, 11).addBox(1.0F, 1.0F, 1.2F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(36, 7).addBox(-2.0F, 2.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(32, 7).addBox(1.0F, 1.0F, -2.2F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(39, 5).addBox(0.0F, 1.0F, -2.2F, 2.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(46, 5).addBox(-2.0F, 2.0F, -2.2F, 2.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(32, 11).addBox(-2.0F, 2.0F, 1.2F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(32, 0).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 6.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(40, 9).addBox(1.2F, 1.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(44, 9).addBox(-1.0F, 0.0F, 1.2F, 2.0F, 6.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(50, 9).addBox(1.2F, 0.0F, -1.0F, 1.0F, 5.0F, 2.0F, 0.0F, true);
		LeftLeg.setTextureOffset(32, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, -6.0F);
		LeftLeg.addChild(cube_r5);
		cube_r5.setTextureOffset(45, 7).addBox(1.3F, 11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r5.setTextureOffset(45, 7).addBox(1.0F, 11.0F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r5.setTextureOffset(45, 7).addBox(1.0F, 11.3F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, -6.0F);
		LeftLeg.addChild(cube_r6);
		cube_r6.setTextureOffset(45, 7).addBox(-1.0F, 11.0F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r6.setTextureOffset(45, 7).addBox(-1.0F, 11.3F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, -6.0F);
		LeftLeg.addChild(cube_r7);
		cube_r7.setTextureOffset(56, 11).addBox(-1.0F, 8.0F, 3.8F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r7.setTextureOffset(56, 13).addBox(-2.0F, 6.0F, 3.8F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r7.setTextureOffset(32, 22).addBox(-2.0F, 6.0F, 4.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}