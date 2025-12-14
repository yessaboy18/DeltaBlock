package com.yessaboy18.deltarunemc;

import net.fabricmc.api.ModInitializer;
import com.yessaboy18.deltarunemc.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeltaBlock implements ModInitializer {
	public static final String MOD_ID = "deltablock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("AND THE DARKNESS WAS SPREAD AGAIN...");
	}
}