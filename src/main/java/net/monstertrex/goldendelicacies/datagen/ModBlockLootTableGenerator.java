package net.monstertrex.goldendelicacies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.monstertrex.goldendelicacies.block.ModBlocks;
import net.monstertrex.goldendelicacies.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.APPLE_CRATE);
        addDrop(ModBlocks.BEETROOT_CRATE);
        addDrop(ModBlocks.CARROT_CRATE);
        addDrop(ModBlocks.CHORUS_FRUIT_CRATE);
        addDrop(ModBlocks.GLOW_BERRY_CRATE);
        addDrop(ModBlocks.POTATO_CRATE);
        addDrop(ModBlocks.SWEET_BERRY_CRATE);
    }
}
