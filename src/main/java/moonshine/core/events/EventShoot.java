package moonshine.core.events;

import com.tac.guns.event.GunFireEvent;
import moonshine.core.registry.MBPGunItem;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import moonshine.core.moonshine;

@Mod.EventBusSubscriber(modid = moonshine.ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventShoot
{
    @SubscribeEvent
    public void onShootTick(GunFireEvent.Pre event)
    {
        Minecraft mc = Minecraft.getInstance();
        if (event.getPlayer() == null)
            return;
        if (!(event.getPlayer().getHeldItemMainhand().getItem() instanceof MBPGunItem))
            return;
        if(mc.world.isRaining()) {
            event.setCanceled(true);
            event.getPlayer().sendStatusMessage(new TranslationTextComponent("info." + moonshine.ID + ".gun_waterlock"), true);
        }
        if(mc.player.isInWater()) {
            event.setCanceled(true);
            event.getPlayer().sendStatusMessage(new TranslationTextComponent("info." + moonshine.ID + ".gun_waterlock"), true);
        }
    }
}
