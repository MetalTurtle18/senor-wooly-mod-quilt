package com.dekolis.senor_wooly.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.util.math.int_provider.UniformIntProvider;

public class SenorWooliumOre extends ExperienceDroppingBlock {
    public SenorWooliumOre(AbstractBlock.Settings settings) {
        super(settings
                .strength(3.0f, 3.0f)
                .requiresTool(),
                UniformIntProvider.create(3, 7)
        );
    }
}
