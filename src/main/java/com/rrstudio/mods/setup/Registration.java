package com.rrstudio.mods.setup;

import com.rrstudio.mods.enchantments.UltimineEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.rrstudio.mods.UltimineIntegration.MOD_ID;

public class Registration {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ENCHANTMENTS.register(bus);
    }

    public static final RegistryObject<UltimineEnchantment> FTBULTIMINE_ENCHANTMENT = ENCHANTMENTS.register("ftbultimine", UltimineEnchantment::new);
}
