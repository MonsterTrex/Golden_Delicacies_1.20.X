package net.monstertrex.goldendelicacies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.monstertrex.goldendelicacies.block.ModBlocks;
import net.monstertrex.goldendelicacies.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.APPLE, RecipeCategory.DECORATIONS, ModBlocks.APPLE_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.BEETROOT, RecipeCategory.DECORATIONS, ModBlocks.BEETROOT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.CARROT, RecipeCategory.DECORATIONS, ModBlocks.CARROT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.CHORUS_FRUIT, RecipeCategory.DECORATIONS, ModBlocks.CHORUS_FRUIT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.GLOW_BERRIES, RecipeCategory.DECORATIONS, ModBlocks.GLOW_BERRY_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.POTATO, RecipeCategory.DECORATIONS, ModBlocks.POTATO_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.SWEET_BERRIES, RecipeCategory.DECORATIONS, ModBlocks.SWEET_BERRY_CRATE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_BAKED_POTATO)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_NUGGET)
                .input('F', Items.BAKED_POTATO)
                .criterion(hasItem(Items.BAKED_POTATO), conditionsFromItem(Items.BAKED_POTATO))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_BAKED_POTATO)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_BEETROOT)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_NUGGET)
                .input('F', Items.BEETROOT)
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_BEETROOT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_BREAD)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_NUGGET).input('F', Items.BREAD)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_BREAD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_COOKED_BEEF)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT).input('F', Items.COOKED_BEEF)
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_COOKED_BEEF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_COOKED_CHICKEN)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT).input('F', Items.COOKED_CHICKEN)
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_COOKED_CHICKEN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_COOKED_COD)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT).input('F', Items.COOKED_COD)
                .criterion(hasItem(Items.COOKED_COD), conditionsFromItem(Items.COOKED_COD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_COOKED_COD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_COOKED_MUTTON)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT).input('F', Items.COOKED_MUTTON)
                .criterion(hasItem(Items.COOKED_MUTTON), conditionsFromItem(Items.COOKED_MUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_COOKED_MUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_COOKED_PORKCHOP)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT).input('F', Items.COOKED_PORKCHOP)
                .criterion(hasItem(Items.COOKED_PORKCHOP), conditionsFromItem(Items.COOKED_PORKCHOP))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_COOKED_PORKCHOP)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_COOKED_RABBIT)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT).input('F', Items.COOKED_RABBIT)
                .criterion(hasItem(Items.COOKED_RABBIT), conditionsFromItem(Items.COOKED_RABBIT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_COOKED_RABBIT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_COOKED_SALMON)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT).input('F', Items.COOKED_SALMON)
                .criterion(hasItem(Items.COOKED_SALMON), conditionsFromItem(Items.COOKED_SALMON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_COOKED_SALMON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_GLOW_BERRIES)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_NUGGET).input('F', Items.GLOW_BERRIES)
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(Items.GLOW_BERRIES))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_GLOW_BERRIES)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_PUMPKIN_PIE)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_NUGGET).input('F', Items.PUMPKIN_PIE)
                .criterion(hasItem(Items.PUMPKIN_PIE), conditionsFromItem(Items.PUMPKIN_PIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_PUMPKIN_PIE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_SWEET_BERRIES)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .input('G', Items.GOLD_NUGGET).input('F', Items.SWEET_BERRIES)
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_SWEET_BERRIES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_BEETROOT_SOUP, 1)
                .input(ModItems.GOLDEN_BEETROOT, 6)
                .input(Items.BOWL, 1)
                .criterion(hasItem(ModItems.GOLDEN_BEETROOT), conditionsFromItem(ModItems.GOLDEN_BEETROOT))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_BEETROOT_SOUP)));

    }
}




