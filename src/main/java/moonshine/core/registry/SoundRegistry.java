
package moonshine.core.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import moonshine.core.moonshine;

/**
 * Author: ClumsyAlien, codebase and design based off Mr.Pineapple's original addon
 */

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, moonshine.ID);
    // Register the name of the sound via the Object name for each block in our sounds.json
    public static final RegistryObject<SoundEvent> FIRE_30 = register("item.fire_30-30");
    public static final RegistryObject<SoundEvent> raiphala = register("item.raiphala");

    private static RegistryObject<SoundEvent> register(String key) {
        return SOUND_REGISTRY.register(key, () -> new SoundEvent(new ResourceLocation(moonshine.ID, key)));
    }
}
