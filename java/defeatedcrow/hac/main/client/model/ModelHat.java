package defeatedcrow.hac.main.client.model;

import defeatedcrow.hac.core.client.base.ModelThinBiped;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

// ぼうし
@SideOnly(Side.CLIENT)
public class ModelHat extends ModelThinBiped {
	ModelRenderer top;
	ModelRenderer brim;
	ModelRenderer face;

	public boolean isSneak = false;
	public boolean isBlocking = false;
	public boolean aimedBow = false;
	public int slot;

	public ModelHat(int b) {
		this(0.55F, b);
	}

	public ModelHat(float f, int b) {
		this(f, 0.0F, 64, 64, b);
	}

	public ModelHat(float f1, float f2, int i3, int i4, int s) {
		super(s);
		this.leftArmPose = ModelBiped.ArmPose.EMPTY;
		this.rightArmPose = ModelBiped.ArmPose.EMPTY;
		slot = s;
		textureWidth = i3;
		textureHeight = i4;
		top = new ModelRenderer(this, 0, 0);
		top.addBox(-4F, -10F, -4F, 8, 3, 8, f1);
		top.setRotationPoint(0.0F, 0.0F + f2, 0.0F);
		brim = new ModelRenderer(this, 0, 32);
		brim.addBox(-7F, -6.5F, -7F, 14, 1, 14, f1);
		brim.setRotationPoint(0.0F, 0.0F + f2, 0.0F);
		face = new ModelRenderer(this, 0, 12);
		face.addBox(-4F, -7F, -4F, 8, 7, 8, f1);
		face.setRotationPoint(0.0F, 0.0F + f2, 0.0F);

	}

	@Override
	public void render(Entity ent, float f2, float f3, float f4, float f5, float f6, float f7) {

		this.setRotationAngles(f2, f3, f4, f5, f6, f7, ent);
		GlStateManager.pushMatrix();

		// showModelをここでいじる
		top.showModel = true;
		brim.showModel = true;
		face.showModel = true;

		if (this.isChild) {
			float f = 2.0F;
			GlStateManager.scale(1.5F / f, 1.5F / f, 1.5F / f);
			GlStateManager.translate(0.0F, 16.0F * f7, 0.0F);
			this.top.render(f7);
			this.brim.render(f7);
			this.face.render(f7);
		} else {
			if (ent.isSneaking()) {
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.top.render(f7);
			this.brim.render(f7);
			this.face.render(f7);
		}

		GlStateManager.popMatrix();
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

		setAngle(top, this.bipedHead);
		setAngle(brim, this.bipedHead);
		setAngle(face, this.bipedHead);
	}

	@Override
	public void setModelAttributes(ModelBase model) {
		super.setModelAttributes(model);

		if (model instanceof ModelBiped) {
			ModelBiped modelbiped = (ModelBiped) model;
			this.leftArmPose = modelbiped.leftArmPose;
			this.rightArmPose = modelbiped.rightArmPose;
			this.isSneak = modelbiped.isSneak;
			this.isChild = modelbiped.isChild;
			this.isRiding = modelbiped.isRiding;
			this.swingProgress = modelbiped.swingProgress;
		}
	}

	@Override
	public void setVisible(boolean invisible) {
		this.top.showModel = invisible;
		this.brim.showModel = invisible;
		this.face.showModel = invisible;
	}

	@Override
	public void postRenderArm(float scale, EnumHandSide side) {
		this.getArmForSide(side).postRender(scale);
	}

	@Override
	protected ModelRenderer getArmForSide(EnumHandSide side) {
		return side == EnumHandSide.LEFT ? this.bipedLeftArm : this.bipedRightArm;
	}

	@Override
	protected EnumHandSide getMainHand(Entity entityIn) {
		return entityIn instanceof EntityLivingBase ? ((EntityLivingBase) entityIn).getPrimaryHand() :
				EnumHandSide.RIGHT;
	}
}
