package com.dekolis.senor_wooly.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class SenorWoolyItems {
    public static void register(String modId) {
        Registry.register(Registries.ITEM, new Identifier(modId, "tubes"), TUBES);
        Registry.register(Registries.ITEM, new Identifier(modId, "heart_backpack"), HEART_BACKPACK);
        Registry.register(Registries.ITEM, new Identifier(modId, "magic_yarn"), MAGIC_YARN);
        Registry.register(Registries.ITEM, new Identifier(modId, "senor_woolium"), SENOR_WOOLIUM);
    }

    public static final Item TUBES = new Item(new QuiltItemSettings());
    public static final Item HEART_BACKPACK = new Item(new QuiltItemSettings());
    public static final Item MAGIC_YARN = new Item(new QuiltItemSettings());
    public static final Item SENOR_WOOLIUM = new Item(new QuiltItemSettings());
}
