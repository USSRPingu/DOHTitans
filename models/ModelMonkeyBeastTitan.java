// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelMonkeyBeastTitan extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public ModelMonkeyBeastTitan() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 41).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 57).addBox(-3.0F, -5.0F, -4.3F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 59).addBox(-3.0F, -2.9F, -4.3F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(-3.0F, -0.9F, -4.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(-3.0F, -0.5F, -3.9F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(-2.0F, -0.5F, -2.9F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(-1.0F, -0.5F, -1.9F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(-3.0F, -0.5F, -1.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(2.0F, -0.5F, -1.9F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(20, 57).addBox(2.0F, -1.9F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(20, 57).addBox(-3.0F, -1.9F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(9, 45).addBox(-4.0F, -7.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(2.0F, -7.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(9, 45).addBox(3.5F, -7.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(-4.5F, -7.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(15, 57).addBox(-4.3F, -4.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(21, 57).addBox(-4.3F, -5.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(4, 62).addBox(-4.3F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(4, 62).addBox(3.3F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(21, 57).addBox(3.3F, -5.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
		Head.setTextureOffset(15, 57).addBox(3.3F, -4.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		Head.setTextureOffset(9, 45).addBox(-2.0F, -7.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(1.0F, -7.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(9, 45).addBox(-3.0F, -8.0F, -4.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 45).addBox(-3.0F, -8.5F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(46, 0).addBox(-4.0F, 1.0F, 1.5F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(32, 0).addBox(-3.0F, 4.0F, 1.4F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 0).addBox(-4.0F, 8.0F, 1.3F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(20, 0).addBox(-4.3F, 8.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(41, 2).addBox(-4.3F, 7.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Body.setTextureOffset(40, 3).addBox(-4.3F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(46, 5).addBox(-4.5F, 10.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Body.setTextureOffset(41, 2).addBox(3.3F, 7.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		Body.setTextureOffset(37, 6).addBox(3.3F, 3.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(37, 6).addBox(-4.3F, 3.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		Body.setTextureOffset(29, 3).addBox(3.5F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(1, 1).addBox(3.5F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(53, 5).addBox(-4.5F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(58, 10).addBox(-4.0F, 1.0F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(48, 10).addBox(-2.0F, 2.0F, -2.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(58, 10).addBox(2.0F, 1.0F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(36, 10).addBox(2.0F, 3.0F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(36, 10).addBox(-4.0F, 3.0F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(54, 13).addBox(-2.0F, 4.0F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(40, 13).addBox(-3.0F, 5.0F, -2.3F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(22, 13).addBox(-4.0F, 7.0F, -2.3F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(30, 11).addBox(-1.0F, 9.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 11).addBox(1.0F, 11.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 11).addBox(-3.0F, 11.0F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(26, 3).addBox(-2.0F, 10.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(26, 3).addBox(1.0F, 10.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(21, 7).addBox(1.0F, 9.0F, -2.3F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(58, 15).addBox(2.0F, 10.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(58, 15).addBox(-4.0F, 10.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(21, 7).addBox(-4.0F, 9.0F, -2.3F, 3.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(29, 3).addBox(-4.5F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		Body.setTextureOffset(40, 3).addBox(3.3F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(46, 5).addBox(3.5F, 10.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		Body.setTextureOffset(20, 0).addBox(3.3F, 8.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(4, 12).addBox(-4.0F, 10.0F, 1.5F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 0).addBox(1.0F, 8.0F, 1.3F, 3.0F, 2.0F, 1.0F, 0.0F, true);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 17.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(41, 22).addBox(-2.0F, -2.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(43, 24).addBox(-3.0F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(43, 24).addBox(-3.5F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(41, 22).addBox(-3.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(43, 24).addBox(-3.5F, 1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.5F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-1.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-1.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.0F, -1.0F, 1.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-2.0F, -2.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(0.0F, -1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(0.0F, -1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.0F, -1.0F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-2.0F, -2.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.0F, 7.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-1.0F, 7.0F, 1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-1.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-2.0F, 6.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.5F, 7.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(-3.5F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(0.5F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(0.5F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(0.5F, 7.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(1, 1).addBox(0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 25).addBox(0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(41, 22).addBox(0.5F, -2.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(41, 22).addBox(8.5F, -2.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 17.0F, 4.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.5F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(41, 22).addBox(-1.0F, -2.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		LeftArm.setTextureOffset(43, 24).addBox(2.0F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(43, 24).addBox(2.5F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(41, 22).addBox(2.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, true);
		LeftArm.setTextureOffset(43, 24).addBox(2.5F, 1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(2.5F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(2.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(0.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(0.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.0F, -1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(2.0F, 7.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.0F, 7.0F, 1.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(0.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(1.0F, 6.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(2.0F, 7.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(2.5F, 7.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(2.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(0.0F, -1.0F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.0F, -2.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(0.0F, -1.0F, 1.5F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.0F, -1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(2.5F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.5F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.5F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.5F, 7.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(1, 1).addBox(-1.5F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm.setTextureOffset(44, 25).addBox(-1.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-1.0F, 0.0F, 1.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.0F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(2, 20).addBox(-2.5F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(2, 20).addBox(-2.5F, 1.0F, -2.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.0F, 1.0F, -2.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-1.0F, 5.0F, -2.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.0F, 7.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.0F, 6.0F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(1.0F, 8.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(1.0F, 3.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(1.0F, 2.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(1.0F, 8.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(1, 1).addBox(-2.0F, 11.0F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(0.0F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.5F, 7.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.5F, 5.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.5F, 5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.5F, 6.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.5F, 2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-2.0F, 2.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(4, 22).addBox(-1.0F, 3.0F, 1.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(1, 1).addBox(-2.0F, 11.0F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(0, 4).addBox(-2.0F, 10.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 4).addBox(-2.0F, 11.0F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 3.1416F, 0.0F);
		cube_r2.setTextureOffset(0, 4).addBox(-2.0F, 10.0F, -2.3F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-1.0F, 3.0F, 1.5F, 2.0F, 6.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-2.0F, 0.0F, 1.5F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.0F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(2, 20).addBox(1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.5F, 6.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(2, 20).addBox(1.5F, 1.0F, -2.0F, 1.0F, 4.0F, 3.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.5F, 2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.0F, 2.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-1.0F, 1.0F, -2.5F, 3.0F, 4.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-1.0F, 5.0F, -2.5F, 2.0F, 4.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-1.0F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.5F, 7.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.5F, 5.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.5F, 5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.0F, 7.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(1.0F, 6.0F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-2.0F, 8.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-2.0F, 3.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-2.0F, 2.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(4, 22).addBox(-2.0F, 8.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(1, 1).addBox(-2.0F, 11.0F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(1, 1).addBox(-2.0F, 11.0F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.setTextureOffset(0, 4).addBox(-2.0F, 11.0F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r3.setTextureOffset(0, 4).addBox(0.0F, 10.0F, -2.3F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -3.1416F, 0.0F);
		cube_r4.setTextureOffset(0, 4).addBox(-2.0F, 10.0F, -2.3F, 4.0F, 2.0F, 1.0F, 0.0F, true);
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
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}