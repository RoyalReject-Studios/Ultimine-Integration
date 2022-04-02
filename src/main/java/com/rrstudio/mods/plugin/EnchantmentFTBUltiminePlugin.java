package com.rrstudio.mods.plugin;

import com.rrstudio.mods.enchantments.UltimineEnchantmentConfig;
import dev.ftb.mods.ftbultimine.integration.FTBUltiminePlugin;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

import java.util.Map;

public class EnchantmentFTBUltiminePlugin implements FTBUltiminePlugin {

    public EnchantmentFTBUltiminePlugin() {
    }

    @Override
    public boolean canUltimine(Player player) {
        return hasEnchantment(player);
    }

    private boolean hasEnchantment(Player player) {
        ItemStack mainHand = player.getMainHandItem();
        Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(mainHand);
        for (Map.Entry<Enchantment, Integer> enchantment : enchantments.entrySet()) {
            if (enchantment.getKey().getRegistryName().equals(new ResourceLocation("ultimineintegration:ftbultimine"))) {
                return true;
            }
        }
        return !UltimineEnchantmentConfig.ENABLE_ENCHANTMENT.get();
    }
}
