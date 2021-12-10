package crimsonfluff.crimsonslimes.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import crimsonfluff.crimsonslimes.CrimsonSlimes;
import net.minecraft.client.model.SlimeModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SlimeOuterLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.monster.Slime;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CrimsonSlimeRenderer extends MobRenderer<Slime, SlimeModel<Slime>> {
    private static final ResourceLocation WHITE_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/white.png");
    private static final ResourceLocation ORANGE_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/orange.png");
    private static final ResourceLocation MAGENTA_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/magenta.png");
    private static final ResourceLocation LIGHT_BLUE_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/light_blue.png");
    private static final ResourceLocation YELLOW_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/yellow.png");
    private static final ResourceLocation LIME_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/lime.png");
    private static final ResourceLocation PINK_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/pink.png");
    private static final ResourceLocation GRAY_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/gray.png");
    private static final ResourceLocation LIGHT_GRAY_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/light_gray.png");
    private static final ResourceLocation CYAN_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/cyan.png");
    private static final ResourceLocation PURPLE_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/purple.png");
    private static final ResourceLocation BLUE_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/blue.png");
    private static final ResourceLocation BROWN_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/brown.png");
    private static final ResourceLocation GREEN_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/green.png");
    private static final ResourceLocation RED_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/red.png");
    private static final ResourceLocation BLACK_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/black.png");
    private static final ResourceLocation MISSING_LOC = new ResourceLocation(CrimsonSlimes.MOD_ID, "textures/entity/missing.png");

    public CrimsonSlimeRenderer(EntityRendererProvider.Context p_174391_) {
        super(p_174391_, new SlimeModel<>(p_174391_.bakeLayer(ModelLayers.SLIME)), 0.25F);
        this.addLayer(new SlimeOuterLayer<>(this, p_174391_.getModelSet()));
    }

    protected void scale(Slime p_115983_, PoseStack p_115984_, float p_115985_) {
        p_115984_.scale(0.999F, 0.999F, 0.999F);
        p_115984_.translate(0.0D, 0.001F, 0.0D);
        float f1 = (float)p_115983_.getSize();
        float f2 = Mth.lerp(p_115985_, p_115983_.oSquish, p_115983_.squish) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        p_115984_.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
    }

    @Override
    public ResourceLocation getTextureLocation(Slime entityIn) {
        switch (entityIn.getEntityData().get(CrimsonSlimeEntity.DATA_COLOUR)) {
            default -> { return WHITE_LOC; }
            case 1 -> { return ORANGE_LOC; }
            case 2 -> { return MAGENTA_LOC; }
            case 3 -> { return LIGHT_BLUE_LOC; }
            case 4 -> { return YELLOW_LOC; }
            case 5 -> { return LIME_LOC; }
            case 6 -> { return PINK_LOC; }
            case 7 -> { return GRAY_LOC; }
            case 8 -> { return LIGHT_GRAY_LOC; }
            case 9 -> { return CYAN_LOC; }
            case 10 -> { return PURPLE_LOC; }
            case 11 -> { return BLUE_LOC; }
            case 12 -> { return BROWN_LOC; }
            case 13 -> { return GREEN_LOC; }
            case 14 -> { return RED_LOC; }
            case 15 -> { return BLACK_LOC; }
            case 16 -> { return MISSING_LOC; }
        }
    }
}
