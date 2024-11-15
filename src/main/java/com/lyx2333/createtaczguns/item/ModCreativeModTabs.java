package com.lyx2333.createtaczguns.item;

import com.lyx2333.createtaczguns.createtaczguns;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.mojang.serialization.codecs.RecordCodecBuilder.build;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, createtaczguns.MODID);

    public static final RegistryObject<CreativeModeTab> MASK_TAB = CREATIVE_MODE_TABS.register("mask",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.test.get()))
                    .title(Component.translatable("creativetab.test_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.test.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


