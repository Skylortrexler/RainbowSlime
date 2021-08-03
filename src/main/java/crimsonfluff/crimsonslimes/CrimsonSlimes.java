package crimsonfluff.crimsonslimes;

import crimsonfluff.crimsonslimes.init.blocksInit;
import crimsonfluff.crimsonslimes.init.entitiesInit;
import crimsonfluff.crimsonslimes.init.itemsInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CrimsonSlimes.MOD_ID)
public class CrimsonSlimes {
    public static final String MOD_ID = "crimsonslimes";
//    public static final Logger LOGGER = LogManager.getLogger(CrimsonSlimes.MOD_ID);

    public CrimsonSlimes() {
        entitiesInit.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        itemsInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        blocksInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(CrimsonSlimes.MOD_ID) {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() { return new ItemStack(blocksInit.SLIME_LIME_BLOCK.get()); }
    };
}
