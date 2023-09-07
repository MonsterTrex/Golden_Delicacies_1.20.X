package net.monstertrex.goldendelicacies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.monstertrex.goldendelicacies.GoldenDelicaciesMod;
import net.monstertrex.goldendelicacies.block.ModBlocks;

public class ModItems {

    public static final Item GOLDEN_BAKED_POTATO = registerItem("golden_baked_potato",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BAKED_POTATO)));

    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BEETROOT)));

    public static final Item GOLDEN_BEETROOT_SOUP = registerItem("golden_beetroot_soup",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BEETROOT_SOUP)));

    public static final Item GOLDEN_BREAD = registerItem("golden_bread",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BREAD)));

    public static final Item GOLDEN_CHORUS_FRUIT = registerItem("golden_chorus_fruit",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_CHORUS_FRUIT)));

    public static final Item GOLDEN_COOKED_BEEF = registerItem("golden_cooked_beef",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_COOKED_BEEF)));

    public static final Item GOLDEN_COOKED_CHICKEN = registerItem("golden_cooked_chicken",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_COOKED_CHICKEN)));

    public static final Item GOLDEN_COOKED_COD = registerItem("golden_cooked_cod",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_COOKED_COD)));

    public static final Item GOLDEN_COOKED_MUTTON = registerItem("golden_cooked_mutton",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_COOKED_MUTTON)));

    public static final Item GOLDEN_COOKED_PORKCHOP = registerItem("golden_cooked_porkchop",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_COOKED_PORKCHOP)));

    public static final Item GOLDEN_COOKED_RABBIT = registerItem("golden_cooked_rabbit",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_COOKED_RABBIT)));

    public static final Item GOLDEN_COOKED_SALMON = registerItem("golden_cooked_salmon",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_COOKED_SALMON)));

    public static final Item GOLDEN_GLOW_BERRIES = registerItem("golden_glow_berries",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_GLOW_BERRIES)));

    public static final Item GOLDEN_PUMPKIN_PIE = registerItem("golden_pumpkin_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_PUMPKIN_PIE)));

    public static final Item GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_SWEET_BERRIES)));

    public static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(ModItems.GOLDEN_BAKED_POTATO);
        entries.add(ModItems.GOLDEN_BEETROOT);
        entries.add(ModItems.GOLDEN_BEETROOT_SOUP);
        entries.add(ModItems.GOLDEN_BREAD);
        entries.add(ModItems.GOLDEN_COOKED_BEEF);
        entries.add(ModItems.GOLDEN_COOKED_CHICKEN);
        entries.add(ModItems.GOLDEN_COOKED_COD);
        entries.add(ModItems.GOLDEN_COOKED_MUTTON);
        entries.add(ModItems.GOLDEN_COOKED_PORKCHOP);
        entries.add(ModItems.GOLDEN_COOKED_RABBIT);
        entries.add(ModItems.GOLDEN_COOKED_SALMON);
        entries.add(ModItems.GOLDEN_GLOW_BERRIES);
        entries.add(ModItems.GOLDEN_PUMPKIN_PIE);
        entries.add(ModItems.GOLDEN_SWEET_BERRIES);

        entries.add(ModBlocks.APPLE_CRATE);
        entries.add(ModBlocks.BEETROOT_CRATE);
        entries.add(ModBlocks.CARROT_CRATE);
        entries.add(ModBlocks.CHORUS_FRUIT_CRATE);
        entries.add(ModBlocks.GLOW_BERRY_CRATE);
        entries.add(ModBlocks.POTATO_CRATE);
        entries.add(ModBlocks.SWEET_BERRY_CRATE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GoldenDelicaciesMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        GoldenDelicaciesMod.LOGGER.info("Registering Mod Items for " + GoldenDelicaciesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }

}
