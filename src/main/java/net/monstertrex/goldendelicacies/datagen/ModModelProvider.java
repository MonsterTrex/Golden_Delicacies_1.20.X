package net.monstertrex.goldendelicacies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.monstertrex.goldendelicacies.block.ModBlocks;
import net.monstertrex.goldendelicacies.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSingleton(ModBlocks.APPLE_CRATE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.BEETROOT_CRATE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.CARROT_CRATE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHORUS_FRUIT_CRATE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.GLOW_BERRY_CRATE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.POTATO_CRATE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.SWEET_BERRY_CRATE, TexturedModel.CUBE_BOTTOM_TOP);

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GOLDEN_BAKED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BEETROOT_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_CHORUS_FRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_COOKED_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_COOKED_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_COOKED_COD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_COOKED_MUTTON, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_COOKED_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_COOKED_RABBIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_COOKED_SALMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_GLOW_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PUMPKIN_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SWEET_BERRIES, Models.GENERATED);
    }
}
