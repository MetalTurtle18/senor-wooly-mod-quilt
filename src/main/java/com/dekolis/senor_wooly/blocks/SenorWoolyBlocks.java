package com.dekolis.senor_wooly.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class SenorWoolyBlocks {
    public static void register(String modId) {
        Registry.register(Registries.BLOCK, new Identifier(modId, "magic_wool"), MAGIC_WOOL);
        Registry.register(Registries.BLOCK, new Identifier(modId, "senor_woolium_ore"), SENOR_WOOLIUM_ORE);

        Registry.register(Registries.ITEM, new Identifier(modId, "magic_wool"), new BlockItem(MAGIC_WOOL, new QuiltItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(modId, "senor_woolium_ore"), new BlockItem(SENOR_WOOLIUM_ORE, new QuiltItemSettings()));
    }

    public static final Block MAGIC_WOOL = new Block(QuiltBlockSettings.create());
    public static final Block SENOR_WOOLIUM_ORE = new Block(QuiltBlockSettings.create());
}
