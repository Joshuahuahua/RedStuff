package me.joshuahuahua.redstuff.core.event;

import me.joshuahuahua.redstuff.RedStuff;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RedStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {

    @SubscribeEvent
    public static void penis(final BlockEvent.BreakEvent event) {
        // TODO
    }
    /*
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        int meta = world.getBlockMetadata(x, y, z);
        ForgeDirection k = BlockTools.getOrientationHoriz(meta);
        int power = world.isBlockProvidingPowerTo(x + k.offsetX, y + k.offsetY, z + k.offsetZ, k.getOpposite().ordinal());
        meta = BlockTools.setRedstoneSignalIn(meta, power > 0);
        world.setBlockMetadataWithNotify(x, y, z, meta, 2);
    }

     */
}



