package net.chris.combatupdatemod.datagen;

import net.chris.combatupdatemod.CombatUpdateMod;
import net.chris.combatupdatemod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CombatUpdateMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.XD.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.XD.get());
    }
}
