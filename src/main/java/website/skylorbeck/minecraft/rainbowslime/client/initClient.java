package website.skylorbeck.minecraft.rainbowslime.client;

import website.skylorbeck.minecraft.rainbowslime.SlimeConfig;
import website.skylorbeck.minecraft.rainbowslime.entity.RainbowSlimeRenderer;
import website.skylorbeck.minecraft.rainbowslime.init.initBlocks;
import website.skylorbeck.minecraft.rainbowslime.init.initEntities;
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

    }
}
