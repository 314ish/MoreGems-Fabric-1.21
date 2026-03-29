package com.blazingblaze8.moregems.item;

import com.blazingblaze8.moregems.MoreGems;
import com.blazingblaze8.moregems.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item HOBBITS_TO_ISENGAURD_MUSIC_DISC = registerItem("hobbits_to_isengaurd_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.HOBBITS_TO_ISENGAURD_KEY).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreGems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreGems.LOGGER.info("Registering mod items for " + MoreGems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SAPPHIRE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(HOBBITS_TO_ISENGAURD_MUSIC_DISC);
        });
    }

}
