package crimsonfluff.crimsonslimes.entity;

import crimsonfluff.crimsonslimes.CrimsonSlimes;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class CrimsonSlimeRenderer extends MobEntityRenderer<CrimsonSlimeEntity, SlimeEntityModel<CrimsonSlimeEntity>> {
    private static final Identifier[] LOCS = {
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/white.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/orange.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/magenta.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/light_blue.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/yellow.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/lime.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/pink.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/gray.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/light_gray.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/cyan.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/purple.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/blue.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/brown.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/green.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/red.png"),
        new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/black.png"),
        new Identifier(CrimsonSlimes.MOD_ID,"textures/entity/missing.png")};

    public CrimsonSlimeRenderer(EntityRendererFactory.Context context) {
        super(context, new SlimeEntityModel<>(context.getPart(EntityModelLayers.SLIME)), 0.25F);
        this.addFeature(new SlimeOverlayFeatureRenderer<>(this, context.getModelLoader()));
    }

    @Override
    public Identifier getTexture(CrimsonSlimeEntity entity) {
        int d = entity.getDataTracker().get(CrimsonSlimeEntity.iCOLOUR);
        return LOCS[d];
//        if (d == 16)
//            return new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/missing.png");
//        else
//            return new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/" + DyeColor.byId(d).getName() + ".png");

//        return entity.texture;
    }

    @Override
    protected void scale(CrimsonSlimeEntity slimeEntity, MatrixStack matrixStack, float f) {
        //float g = 0.999F;
        matrixStack.scale(0.999F, 0.999F, 0.999F);
        matrixStack.translate(0.0D, 0.0010000000474974513D, 0.0D);
        float h = (float)slimeEntity.getSize();
        float i = MathHelper.lerp(f, slimeEntity.lastStretch, slimeEntity.stretch) / (h * 0.5F + 1.0F);
        float j = 1.0F / (i + 1.0F);
        matrixStack.scale(j * h, 1.0F / j * h, j * h);
    }
}
