package net.mcreator.pact.procedures;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.util.ResourceLocation;

import net.mcreator.pact.entity.AttackTitanEntity;

//modified for 1.16.5, use at your own risk
public class TestProcedure extends AnimatedGeoModel<AttackTitanEntity.CustomEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(AttackTitanEntity.CustomEntity entity) {
		return new ResourceLocation("dohtitans", "animations/AttackTitanRun.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(AttackTitanEntity.CustomEntity entity) {
		return new ResourceLocation("dohtitans", "geo/AttackTitanRun.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(AttackTitanEntity.CustomEntity entity) {
		return new ResourceLocation("dohtitans", "textures/entities/AttackTitanTexture.png");
	}

	@Override
	public void setCustomAnimations(AttackTitanEntity.CustomEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F));
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F));
	}
	/** **/
}
