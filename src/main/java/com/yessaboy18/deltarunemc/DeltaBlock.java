package com.yessaboy18.deltarunemc;

import com.yessaboy18.deltarunemc.combat.CombatEvents;
import com.yessaboy18.deltarunemc.effect.ModEffects;
import com.yessaboy18.deltarunemc.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;
import com.yessaboy18.deltarunemc.item.ModItems;
import com.yessaboy18.deltarunemc.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeltaBlock implements ModInitializer {
	public static final String MOD_ID = "deltablock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CombatEvents.registerCombatEvents();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModEffects.registerEffects();
		LOGGER.info("...WHEN THE DARKNESS IS GONNA SPREAD AGAIN");
	}
}