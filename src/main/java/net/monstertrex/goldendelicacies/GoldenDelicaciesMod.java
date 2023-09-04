package net.monstertrex.goldendelicacies;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoldenDelicaciesMod implements ModInitializer {
	public static final String MOD_ID = "goldendelicacies";
    public static final Logger LOGGER = LoggerFactory.getLogger("goldendelicacies");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}