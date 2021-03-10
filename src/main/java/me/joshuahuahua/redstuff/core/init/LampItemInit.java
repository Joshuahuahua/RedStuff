package me.joshuahuahua.redstuff.core.init;

import me.joshuahuahua.redstuff.RedStuff;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class LampItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            RedStuff.MOD_ID);

    // LAMPS

    public static final RegistryObject<BlockItem> WHITE_LAMP = ITEMS.register("white_lamp",
            () -> new BlockItem(LampBlockInit.WHITE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> ORANGE_LAMP = ITEMS.register("orange_lamp",
            () -> new BlockItem(LampBlockInit.ORANGE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> MAGENTA_LAMP = ITEMS.register("magenta_lamp",
            () -> new BlockItem(LampBlockInit.MAGENTA_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> LIGHT_BLUE_LAMP = ITEMS.register("light_blue_lamp",
            () -> new BlockItem(LampBlockInit.LIGHT_BLUE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> YELLOW_LAMP = ITEMS.register("yellow_lamp",
            () -> new BlockItem(LampBlockInit.YELLOW_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> LIME_LAMP = ITEMS.register("lime_lamp",
            () -> new BlockItem(LampBlockInit.LIME_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> PINK_LAMP = ITEMS.register("pink_lamp",
            () -> new BlockItem(LampBlockInit.PINK_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> GRAY_LAMP = ITEMS.register("gray_lamp",
            () -> new BlockItem(LampBlockInit.GRAY_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> LIGHT_GRAY_LAMP = ITEMS.register("light_gray_lamp",
            () -> new BlockItem(LampBlockInit.LIGHT_GRAY_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> CYAN_LAMP = ITEMS.register("cyan_lamp",
            () -> new BlockItem(LampBlockInit.CYAN_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> PURPLE_LAMP = ITEMS.register("purple_lamp",
            () -> new BlockItem(LampBlockInit.PURPLE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> BLUE_LAMP = ITEMS.register("blue_lamp",
            () -> new BlockItem(LampBlockInit.BLUE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> BROWN_LAMP = ITEMS.register("brown_lamp",
            () -> new BlockItem(LampBlockInit.BROWN_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> GREEN_LAMP = ITEMS.register("green_lamp",
            () -> new BlockItem(LampBlockInit.GREEN_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> RED_LAMP = ITEMS.register("red_lamp",
            () -> new BlockItem(LampBlockInit.RED_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> BLACK_LAMP = ITEMS.register("black_lamp",
            () -> new BlockItem(LampBlockInit.BLACK_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    // INVERTED LAMPS

    public static final RegistryObject<BlockItem> INVERTED_WHITE_LAMP = ITEMS.register("inverted_white_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_WHITE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_ORANGE_LAMP = ITEMS.register("inverted_orange_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_ORANGE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_MAGENTA_LAMP = ITEMS.register("inverted_magenta_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_MAGENTA_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_LIGHT_BLUE_LAMP = ITEMS.register("inverted_light_blue_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_LIGHT_BLUE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_YELLOW_LAMP = ITEMS.register("inverted_yellow_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_YELLOW_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_LIME_LAMP = ITEMS.register("inverted_lime_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_LIME_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_PINK_LAMP = ITEMS.register("inverted_pink_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_PINK_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_GRAY_LAMP = ITEMS.register("inverted_gray_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_GRAY_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_LIGHT_GRAY_LAMP = ITEMS.register("inverted_light_gray_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_LIGHT_GRAY_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_CYAN_LAMP = ITEMS.register("inverted_cyan_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_CYAN_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_PURPLE_LAMP = ITEMS.register("inverted_purple_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_PURPLE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_BLUE_LAMP = ITEMS.register("inverted_blue_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_BLUE_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_BROWN_LAMP = ITEMS.register("inverted_brown_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_BROWN_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_GREEN_LAMP = ITEMS.register("inverted_green_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_GREEN_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_RED_LAMP = ITEMS.register("inverted_red_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_RED_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));

    public static final RegistryObject<BlockItem> INVERTED_BLACK_LAMP = ITEMS.register("inverted_black_lamp",
            () -> new BlockItem(LampBlockInit.INVERTED_BLACK_LAMP.get(), new Item.Properties().group(RedStuff.REDSTUFF_GROUP)));



}