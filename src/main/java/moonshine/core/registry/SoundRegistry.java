
package moonshine.core.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import moonshine.core.Moonshine;

/**
 * Author: ClumsyAlien, codebase and design based off Mr.Pineapple's original addon
 */

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,Moonshine.ID);
    // Register the name of the sound via the Object name for each block in our sounds.json
    public static final RegistryObject<SoundEvent> FIRE_30 = register("item.fire_30-30");
    public static final RegistryObject<SoundEvent> raiphala_fire = register("item.raiphala_fire");
    public static final RegistryObject<SoundEvent> type1_mk3_fire = register("item.type1_mk3_fire");
    public static final RegistryObject<SoundEvent> gew91_fire = register("item.gew91_fire");
    public static final RegistryObject<SoundEvent> trapdoor_loading = register("trapdoor_loading");
    public static final RegistryObject<SoundEvent> revolver_gate_load_a = register("revolver_gate_load_a");
    public static final RegistryObject<SoundEvent> single_action_fire_a = register("single_action_fire_a");

    private static RegistryObject<SoundEvent> register(String key) {
        return SOUND_REGISTRY.register(key, () -> new SoundEvent(new ResourceLocation(Moonshine.ID, key)));
    }
}
