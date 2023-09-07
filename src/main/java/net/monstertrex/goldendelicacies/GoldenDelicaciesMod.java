package net.monstertrex.goldendelicacies;

import net.fabricmc.api.ModInitializer;

import net.monstertrex.goldendelicacies.block.ModBlocks;
import net.monstertrex.goldendelicacies.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoldenDelicaciesMod implements ModInitializer {
	public static final String MOD_ID = "goldendelicacies";
    public static final Logger LOGGER = LoggerFactory.getLogger("goldendelicacies");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}