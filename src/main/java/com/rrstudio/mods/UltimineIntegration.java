package com.rrstudio.mods;

import com.rrstudio.mods.plugin.EnchantmentFTBUltiminePlugin;
import com.rrstudio.mods.setup.Config;
import com.rrstudio.mods.setup.Registration;
import dev.ftb.mods.ftbultimine.integration.FTBUltiminePlugin;
import net.minecraftforge.fml.common.Mod;

@Mod(UltimineIntegration.MOD_ID)
public class UltimineIntegration {
    public static final String MOD_ID = "ultimineintegration";

    public UltimineIntegration() {
        FTBUltiminePlugin.register(new EnchantmentFTBUltiminePlugin());

        Registration.init();
        Config.register();
    }
}
