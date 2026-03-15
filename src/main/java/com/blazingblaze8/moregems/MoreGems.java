package com.blazingblaze8.moregems;

import com.blazingblaze8.moregems.block.ModBlocks;
import com.blazingblaze8.moregems.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreGems implements ModInitializer {
	public static final String MOD_ID = "moregems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}