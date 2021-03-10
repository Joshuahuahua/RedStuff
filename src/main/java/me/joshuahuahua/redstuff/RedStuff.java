package me.joshuahuahua.redstuff;

import me.joshuahuahua.redstuff.core.init.BlockInit;
import me.joshuahuahua.redstuff.core.init.ItemInit;
import me.joshuahuahua.redstuff.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("redstuff")
public class RedStuff {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "redstuff";
    public static final ItemGroup REDSTUFF_GROUP = new RedStuffGroup("RedStuff");

    public RedStuff() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    public static class RedStuffGroup extends ItemGroup {

        public RedStuffGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ItemInit.GLINGOT.get().getDefaultInstance();
            //return Items.ACACIA_BOAT.getDefaultInstance();
        }

        @Override
        public void fill(NonNullList<ItemStack> items) {
            items.add(Items.ACACIA_FENCE.getDefaultInstance());
            super.fill(items);
        }
    }
}
