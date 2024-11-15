package com.lyx2333.createtaczguns.item;

import com.lyx2333.createtaczguns.createtaczguns;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, createtaczguns.MODID);

    public static final RegistryObject<Item> test = ITEMS.register("test",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
