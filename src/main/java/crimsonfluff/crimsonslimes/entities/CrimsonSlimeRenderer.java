package crimsonfluff.crimsonslimes.entities;

import com.mojang.blaze3d.vertex.PoseStack;
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
    private final ResourceLocation TEXTURE;

    public CrimsonSlimeRenderer(EntityRendererProvider.Context p_174391_, ResourceLocation textureIn) {
        super(p_174391_, new SlimeModel<>(p_174391_.bakeLayer(ModelLayers.SLIME)), 0.25F);
        this.addLayer(new SlimeOuterLayer<>(this, p_174391_.getModelSet()));
        TEXTURE = textureIn;
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
        return TEXTURE;
    }
}
