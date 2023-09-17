package net.monstertrex.goldendelicacies.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.monstertrex.goldendelicacies.GoldenDelicaciesMod;
import net.monstertrex.goldendelicacies.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup STITCHED_LEATHER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GoldenDelicaciesMod.MOD_ID, "golden_delicacies_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.golden_delicacies_group"))
                    .icon(() -> new ItemStack(ModItems.GOLDEN_COOKED_PORKCHOP)).entries((displayContext, entries) -> {

                        entries.add(ModItems.GOLDEN_BAKED_POTATO);
                        entries.add(ModItems.GOLDEN_BEETROOT);
                        entries.add(ModItems.GOLDEN_BEETROOT_SOUP);
                        entries.add(ModItems.GOLDEN_BREAD);
                        entries.add(ModItems.GOLDEN_CHORUS_FRUIT);
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

                    }).build());
    public static void registerItemGroups(){}
}
