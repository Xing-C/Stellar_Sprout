package cn.mcxkly.stellar_sprout;

import cn.mcxkly.stellar_sprout.init.StellarSproutBlockEntities;
import cn.mcxkly.stellar_sprout.init.Stellar_Sprout_Blocks;
import cn.mcxkly.stellar_sprout.init.Stellar_Sprout_Items;
import cn.mcxkly.stellar_sprout.init.Stellar_Sprout_Tabs;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(stellar_sprout.MODID)
public class stellar_sprout {
    // ModId
    public static final String MODID = "stellar_sprout";
    // 直接引用 slf4j 记录器
    private static final Logger LOGGER = LogUtils.getLogger();
    public stellar_sprout() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        // 注册方块
        Stellar_Sprout_Blocks.REGISTRY.register(bus);
        // 注册实体方块
        StellarSproutBlockEntities.REGISTRY.register(bus);
        // 注册物品
        Stellar_Sprout_Items.REGISTRY.register(bus);
        // 注册创造栏
        Stellar_Sprout_Tabs.REGISTRY.register(bus);

        // 注册 commonSetup 方法进行 modloading
        bus.addListener(this::commonSetup);

        // 注册我们感兴趣的服务器和其他游戏活动
        MinecraftForge.EVENT_BUS.register(this);

        // 注册我们的 mod 的 ForgeConfigSpec，以便 Forge 可以为我们创建和加载配置文件
        // ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // 一些常见的设置代码
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

    }

    // 您可以使用 SubscribeEvent 并让事件总线发现要调用的方法
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    //可以使用 EventBusSubscriber 自动注册带注释的类中的所有静态方法@SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // 一些客户端设置代码
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
