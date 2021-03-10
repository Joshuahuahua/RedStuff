package me.joshuahuahua.redstuff.core.init;

import me.joshuahuahua.redstuff.RedStuff;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            RedStuff.MOD_ID);

    // Copper
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new Item(new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));
    // Misc
    public static final RegistryObject<Item> GLINGOT = ITEMS.register("glingot",
            () -> new Item(new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    // BLock Items
    // Copper
    public static final RegistryObject<BlockItem> COPPER_BLOCK = ITEMS.register("copper_block",
            () -> new BlockItem(BlockInit.COPPER_BLOCK.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> COPPER_ORE = ITEMS.register("copper_ore",
            () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));
    // Misc
    public static final RegistryObject<BlockItem> LAMP = ITEMS.register("lamp",
            () -> new BlockItem(BlockInit.LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));
}