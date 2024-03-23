package com.dekolis.senor_wooly;

import com.dekolis.senor_wooly.blocks.SenorWoolyBlocks;
import com.dekolis.senor_wooly.items.SenorWoolyItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SenorWooly implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod name as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("Señor Wooly Mod");

    public static final ItemGroup SENOR_WOOLY_TAB = ItemGroup.builder(ItemGroup.VerticalPosition.BOTTOM, 5)
            .name(Text.translatable("itemGroup.senor_wooly.senor_wooly_tab"))
            .icon(SenorWoolyItems.TUBES::getDefaultStack)
            .entries((c, entries) -> {
                entries.addItem(SenorWoolyItems.TUBES);
                entries.addItem(SenorWoolyItems.HEART_BACKPACK);
                entries.addItem(SenorWoolyItems.MAGIC_YARN);
                entries.addItem(SenorWoolyItems.SENOR_WOOLIUM);
                entries.addItem(SenorWoolyBlocks.MAGIC_WOOL.asItem());
                entries.addItem(SenorWoolyBlocks.SENOR_WOOLIUM_ORE.asItem());
            })
            .build();

    @Override
    public void onInitialize(ModContainer mod) {
        SenorWoolyBlocks.register(mod.metadata().id());
        SenorWoolyItems.register(mod.metadata().id());

        Registry.register(Registries.ITEM_GROUP, new Identifier(mod.metadata().id(), "senor_wooly_tab"), SENOR_WOOLY_TAB);
    }
}
