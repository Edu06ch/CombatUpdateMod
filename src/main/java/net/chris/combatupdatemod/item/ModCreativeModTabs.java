package net.chris.combatupdatemod.item;

import net.chris.combatupdatemod.CombatUpdateMod;
import net.chris.combatupdatemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CombatUpdateMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WEAPONS_TAB = CREATIVE_MODE_TABS.register("weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND_SWORD))
                    .title(Component.translatable("creativetab.weapons_tab"))
                    .displayItems(((pParameters, pOutput) -> {

                        //pOutput.accept(ModBlocks.XD.get());

                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
