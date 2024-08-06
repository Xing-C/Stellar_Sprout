package cn.mcxkly.stellar_sprout.init;


import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import cn.mcxkly.stellar_sprout.stellar_sprout;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Stellar_Sprout_Tabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, stellar_sprout.MODID);
    // 创造栏列表
    public static final RegistryObject<CreativeModeTab> stellar_sprout_main = REGISTRY.register("stellar_sprout_main",
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.stellar_sprout.stellar_sprout_main")).icon(() -> new ItemStack(Stellar_Sprout_Blocks.LASER_RED.get())).displayItems((parameters, tabData) -> {
                        tabData.accept(Stellar_Sprout_Blocks.LASER_RED.get().asItem());
                        tabData.accept(Stellar_Sprout_Items.STAR_ENERGY_DUST.get().asItem());
                        tabData.accept(Stellar_Sprout_Items.STARRY_SKY_SPACE.get().asItem());
                    })

                    .build());

    @SubscribeEvent
    public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
        if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            tabData.accept(Stellar_Sprout_Blocks.LASER_RED.get());
        }
    }
}

