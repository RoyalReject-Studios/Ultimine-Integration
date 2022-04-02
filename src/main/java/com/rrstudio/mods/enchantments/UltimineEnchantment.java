package com.rrstudio.mods.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.DigDurabilityEnchantment;

public class UltimineEnchantment extends DigDurabilityEnchantment {
    public UltimineEnchantment() {
        super(Rarity.VERY_RARE, EquipmentSlot.MAINHAND);
    }

    @Override
    public boolean canEnchant(ItemStack pStack) {
        return pStack.getItem() instanceof DiggerItem;
    }

    @Override
    public int getMinCost(int pEnchantmentLevel) {
        return 30;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isDiscoverable() {
        return UltimineEnchantmentConfig.ENABLE_ENCHANTMENT.get();
    }
}
