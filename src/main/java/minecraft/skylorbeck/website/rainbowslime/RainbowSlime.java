package minecraft.skylorbeck.website.rainbowslime;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import minecraft.skylorbeck.website.rainbowslime.entity.RainbowSlimeEntity;
import minecraft.skylorbeck.website.rainbowslime.init.initAttributes;
import minecraft.skylorbeck.website.rainbowslime.init.initBlocks;
import minecraft.skylorbeck.website.rainbowslime.init.initEntities;
import minecraft.skylorbeck.website.rainbowslime.init.initItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;

//  /summon rainbowslime:slime ~ ~ ~ {Size:3}
//  /summon rainbowslime:slime ~ ~ ~ {Colour:5}

public class RainbowSlime implements ModInitializer {
    public static final String MOD_ID = "rainbowslime";
    public static final ItemGroup CREATIVE_TAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "tab"), () -> new ItemStack(initBlocks.SLIME_LIGHT_BLUE_BLOCK));
    public static SlimeConfig config;
    @Override
    public void onInitialize() {
        initItems.register();
        initBlocks.register();
        initAttributes.register();
        ConfigHolder<SlimeConfig>configHolder = AutoConfig.register(SlimeConfig.class, GsonConfigSerializer::new);
        config = configHolder.getConfig();

        // Vanilla Slime from SpawnEgg/Spawner/Summon
        ServerEntityEvents.ENTITY_LOAD.register((entity, serverWorld) -> {
            if (entity.getType() == EntityType.SLIME) {
                if (serverWorld.random.nextInt(100) < config.spawnChance) {
                    entity.remove(Entity.RemovalReason.DISCARDED);

                    RainbowSlimeEntity mimic = initEntities.SLIME.create(serverWorld);
                    if (mimic != null) {
                        mimic.copyPositionAndRotation(entity);

                        NbtCompound nbtCompound = entity.writeNbt(new NbtCompound());
                        nbtCompound.remove("Dimension");
                        nbtCompound.remove("UUID");
                        mimic.readNbt(nbtCompound);

                        serverWorld.spawnEntity(mimic);
                    }
                }
            }
        });
    }
}
//todo patreon skins
//todo clear slime