package com.gabriel2329.jumblejunk;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gabriel2329.jumblejunk.command.ModCommands;
import com.gabriel2329.jumblejunk.item.ModItems;

public class JumbleJunk implements ModInitializer {
	public static final String MOD_ID = "jumblejunk";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModCommands.registerCommands();
	}
}