package net.alan.lirioben10mod;

import net.alan.lirioben10mod.block.ModBlocks;
import net.alan.lirioben10mod.item.ModItemGroups;
import net.alan.lirioben10mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LiriosBen10Mod implements ModInitializer {
	public static final String MOD_ID = "lirioben10mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}