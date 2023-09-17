package net.monstertrex.goldendelicacies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.monstertrex.goldendelicacies.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(
                ModBlocks.APPLE_CRATE,
                ModBlocks.BEETROOT_CRATE,
                ModBlocks.CARROT_CRATE,
                ModBlocks.CHORUS_FRUIT_CRATE,
                ModBlocks.GLOW_BERRY_CRATE,
                ModBlocks.POTATO_CRATE,
                ModBlocks.SWEET_BERRY_CRATE
        );

    }
}
