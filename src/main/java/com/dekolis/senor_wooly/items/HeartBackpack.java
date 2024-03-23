package com.dekolis.senor_wooly.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class HeartBackpack extends Item {
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.senor_wooly.heart_backpack.tooltip").formatted(Formatting.RED));
    }


    public HeartBackpack(Settings settings) {
        super(settings
                .food(new FoodComponent.Builder()
                        .hunger(4)
                        .saturationModifier(1.2f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 80, 34), 1.0f)
                        .build())
        );
    }
}
