package net.monstertrex.goldendelicacies.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.monstertrex.goldendelicacies.GoldenDelicaciesMod;
public class ModBlocks {

    public static final Block APPLE_CRATE = registerBlock("apple_crate", new Block(FabricBlockSettings
            .copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate", new Block(FabricBlockSettings
            .copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    public static final Block CARROT_CRATE = registerBlock("carrot_crate", new Block(FabricBlockSettings
            .copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    public static final Block CHORUS_FRUIT_CRATE = registerBlock("chorus_fruit_crate", new Block(FabricBlockSettings
            .copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    public static final Block GLOW_BERRY_CRATE = registerBlock("glow_berry_crate", new Block(FabricBlockSettings
            .copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    public static final Block POTATO_CRATE = registerBlock("potato_crate", new Block(FabricBlockSettings
            .copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    public static final Block SWEET_BERRY_CRATE = registerBlock("sweet_berry_crate", new Block(FabricBlockSettings
            .copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GoldenDelicaciesMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(GoldenDelicaciesMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        GoldenDelicaciesMod.LOGGER.info("Registering ModBlocks for " + GoldenDelicaciesMod.MOD_ID);
    }
}
