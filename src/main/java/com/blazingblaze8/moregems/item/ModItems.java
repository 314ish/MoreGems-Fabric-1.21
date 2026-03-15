package com.blazingblaze8.moregems.item;

import com.blazingblaze8.moregems.MoreGems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreGems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreGems.LOGGER.info("Registering mod items for " + MoreGems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SAPPHIRE);
        });
    }

}
