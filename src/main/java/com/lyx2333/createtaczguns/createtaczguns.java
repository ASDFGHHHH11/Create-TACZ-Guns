package com.lyx2333.createtaczguns;

import com.lyx2333.createtaczguns.item.ModCreativeModTabs;
import com.lyx2333.createtaczguns.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(createtaczguns.MODID)
public class createtaczguns
{
    public static final String MODID = "createtaczguns";
    private static final Logger LOGGER = LogUtils.getLogger();

    public createtaczguns() {
        IEventBus modEventbus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventbus);

        ModItems.register(modEventbus);

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.test);
        }
    }
}
