package com.gabriel2329.jumblejunk.item;

import com.gabriel2329.jumblejunk.JumbleJunk;
import com.gabriel2329.jumblejunk.item.custom.MatchstickItem;
import com.gabriel2329.jumblejunk.item.custom.ModFoodComponents;
import com.gabriel2329.jumblejunk.item.custom.SignalMeterItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SIGNALMETER = registerItem("signalmeter", 
    new SignalMeterItem(new FabricItemSettings().maxDamage(1024)));

    public static final Item MATCHSTICK = registerItem("matchstick", 
    new MatchstickItem(new FabricItemSettings().maxCount(64)));

    public static final Item FRIED_EGG = registerItem("fried_egg", new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(JumbleJunk.MOD_ID, name), item);
    }

    //TO DO: add matchstick to tools tab
    public static void addItemsToRedstoneTab(FabricItemGroupEntries entries){
        entries.add(SIGNALMETER);
    }

    public static void addItemsToFoodTab(FabricItemGroupEntries entries){
        entries.add(FRIED_EGG);
    }

    public static void addItemsToToolsTab(FabricItemGroupEntries entries){
        entries.add(MATCHSTICK);
    }

    public static void registerModItems(){
        JumbleJunk.LOGGER.info("Registering items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToRedstoneTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTab);
    }
}
