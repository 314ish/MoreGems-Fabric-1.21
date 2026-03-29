package com.blazingblaze8.moregems.sound;

import com.blazingblaze8.moregems.MoreGems;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent HOBBITS_TO_ISENGAURD = registerSoundEvent("hobbits_to_isengaurd");
    public static final RegistryKey<JukeboxSong> HOBBITS_TO_ISENGAURD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreGems.MOD_ID, "hobbits_to_isengaurd"));


    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MoreGems.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }


    public static void registerSounds() {
        MoreGems.LOGGER.info("Registering Mod Sounds for " + MoreGems.MOD_ID);
    }
}
// TODO: look if the ogg file is spelt wrong and fix it.