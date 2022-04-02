package com.rrstudio.mods.enchantments;

import net.minecraftforge.common.ForgeConfigSpec;

public class UltimineEnchantmentConfig {
    public static ForgeConfigSpec.BooleanValue ENABLE_ENCHANTMENT;

    public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.comment("Settings for Enchantment plugin").push("enchantment");
        ENABLE_ENCHANTMENT = COMMON_BUILDER.comment("Should FTBUltimine enchantment be enabled").define("enable_enchantment", true);
        COMMON_BUILDER.pop();
    }
}
