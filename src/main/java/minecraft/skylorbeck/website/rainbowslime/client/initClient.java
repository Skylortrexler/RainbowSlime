package minecraft.skylorbeck.website.rainbowslime.client;

import me.shedaniel.autoconfig.AutoConfig;
import minecraft.skylorbeck.website.rainbowslime.SlimeConfig;
import minecraft.skylorbeck.website.rainbowslime.entity.RainbowSlimeRenderer;
import minecraft.skylorbeck.website.rainbowslime.init.initBlocks;
import minecraft.skylorbeck.website.rainbowslime.init.initEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class initClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(initEntities.SLIME, RainbowSlimeRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_MISSING_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_CLEAR_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_WHITE_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_ORANGE_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_MAGENTA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_LIGHT_BLUE_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_YELLOW_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_LIME_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_PINK_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_GRAY_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_LIGHT_GRAY_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_CYAN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_PURPLE_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_BLUE_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_BROWN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_GREEN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_RED_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.SLIME_BLACK_BLOCK, RenderLayer.getTranslucent());

        AutoConfig.getGuiRegistry(SlimeConfig.class);
    }
}
