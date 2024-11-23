package com.lyx2333.createtaczguns.item;

import com.lyx2333.createtaczguns.createtaczguns;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, createtaczguns.MODID);

    public static final RegistryObject<Item> steelore = ITEMS.register("steelore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> blackironite = ITEMS.register("blackironite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> wire = ITEMS.register("wire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_blackironite = ITEMS.register("raw_blackironite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_steelore = ITEMS.register("raw_steelore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> thickironbars = ITEMS.register("thickironbars",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}

}
