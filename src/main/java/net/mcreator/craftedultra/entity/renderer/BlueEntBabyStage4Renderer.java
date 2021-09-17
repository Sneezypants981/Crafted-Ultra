package net.mcreator.craftedultra.entity.renderer;

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

import net.mcreator.craftedultra.entity.BlueEntBabyStage4Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlueEntBabyStage4Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlueEntBabyStage4Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelblue_ent_baby(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("crafted_ultra:textures/pixil-frame-0_4.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelblue_ent_baby extends EntityModel<Entity> {
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeaf;
		private final ModelRenderer LeftLeaf;
		private final ModelRenderer Torso;
		private final ModelRenderer Belly;
		private final ModelRenderer Head;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelblue_ent_baby() {
			textureWidth = 16;
			textureHeight = 16;
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightArm.setTextureOffset(0, 0).addBox(-10.0F, -23.0F, -2.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftArm.setTextureOffset(0, 0).addBox(7.0F, -23.0F, -2.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);
			RightLeaf = new ModelRenderer(this);
			RightLeaf.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightLeaf.setTextureOffset(0, 0).addBox(-12.0F, -28.0F, -3.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			LeftLeaf = new ModelRenderer(this);
			LeftLeaf.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftLeaf.setTextureOffset(0, 0).addBox(7.0F, -28.0F, -3.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			Torso = new ModelRenderer(this);
			Torso.setRotationPoint(0.0F, 24.0F, 0.0F);
			Torso.setTextureOffset(0, 0).addBox(-7.0F, -24.0F, -3.0F, 14.0F, 5.0F, 6.0F, 0.0F, false);
			Belly = new ModelRenderer(this);
			Belly.setRotationPoint(0.0F, 24.0F, 0.0F);
			Belly.setTextureOffset(0, 0).addBox(-5.0F, -19.0F, -2.0F, 10.0F, 8.0F, 5.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 24.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-2.0F, -28.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -29.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(2.0F, -28.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(3.0F, -29.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -28.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightLeg.setTextureOffset(0, 0).addBox(-5.0F, -11.0F, -1.0F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 0).addBox(2.0F, -11.0F, -1.0F, 3.0F, 11.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeaf.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeaf.render(matrixStack, buffer, packedLight, packedOverlay);
			Torso.render(matrixStack, buffer, packedLight, packedOverlay);
			Belly.render(matrixStack, buffer, packedLight, packedOverlay);
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
