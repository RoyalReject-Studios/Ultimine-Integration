package com.rrstudio.mods.datagen;

import com.rrstudio.mods.UltimineIntegration;
import com.rrstudio.mods.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, UltimineIntegration.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(Registration.FTBULTIMINE_ENCHANTMENT.get(), "FTBUltimine");
    }
}
