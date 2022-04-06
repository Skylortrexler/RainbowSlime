package minecraft.skylorbeck.website.rainbowslime.entity;

import minecraft.skylorbeck.website.rainbowslime.RainbowSlime;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class RainbowSlimeRenderer extends MobEntityRenderer<RainbowSlimeEntity, SlimeEntityModel<RainbowSlimeEntity>> {
    private static final Identifier[] LOCS = {
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/white.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/orange.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/magenta.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/light_blue.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/yellow.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/lime.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/pink.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/gray.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/light_gray.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/cyan.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/purple.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/blue.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/brown.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/green.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/red.png"),
        new Identifier(RainbowSlime.MOD_ID, "textures/entity/black.png"),
        new Identifier(RainbowSlime.MOD_ID,"textures/entity/missing.png"),
        new Identifier(RainbowSlime.MOD_ID,"textures/entity/clear.png")};

    public RainbowSlimeRenderer(EntityRendererFactory.Context context) {
        super(context, new SlimeEntityModel<>(context.getPart(EntityModelLayers.SLIME)), 0.25F);
        this.addFeature(new SlimeOverlayFeatureRenderer<>(this, context.getModelLoader()));
    }

    @Override
    public Identifier getTexture(RainbowSlimeEntity entity) {
        int d = entity.getDataTracker().get(RainbowSlimeEntity.iCOLOUR);
        return LOCS[d];
    }

    @Override
    protected void scale(RainbowSlimeEntity slimeEntity, MatrixStack matrixStack, float f) {
        //float g = 0.999F;
        matrixStack.scale(0.999F, 0.999F, 0.999F);
        matrixStack.translate(0.0D, 0.0010000000474974513D, 0.0D);
        float h = (float)slimeEntity.getSize();
        float i = MathHelper.lerp(f, slimeEntity.lastStretch, slimeEntity.stretch) / (h * 0.5F + 1.0F);
        float j = 1.0F / (i + 1.0F);
        matrixStack.scale(j * h, 1.0F / j * h, j * h);
    }
}
