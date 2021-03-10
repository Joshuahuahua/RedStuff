package me.joshuahuahua.redstuff.core.init;

import me.joshuahuahua.redstuff.RedStuff;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

 /* Harvest Levels
    -1: all levels
    0: wood
    1: stone + gold
    2: iron
    3: diamond
    4: netherite
    5+: modded picks
*/


public class LampBlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            RedStuff.MOD_ID);

    // --------------------------------------- Lamp ---------------------------------------

    public static final RegistryObject<Block> WHITE_LAMP = BLOCKS.register("white_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> ORANGE_LAMP = BLOCKS.register("orange_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> MAGENTA_LAMP = BLOCKS.register("magenta_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> LIGHT_BLUE_LAMP = BLOCKS.register("light_blue_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> YELLOW_LAMP = BLOCKS.register("yellow_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> LIME_LAMP = BLOCKS.register("lime_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> PINK_LAMP = BLOCKS.register("pink_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> GRAY_LAMP = BLOCKS.register("gray_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> LIGHT_GRAY_LAMP = BLOCKS.register("light_gray_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> CYAN_LAMP = BLOCKS.register("cyan_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> PURPLE_LAMP = BLOCKS.register("purple_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> BLUE_LAMP = BLOCKS.register("blue_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> BROWN_LAMP = BLOCKS.register("brown_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> GREEN_LAMP = BLOCKS.register("green_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> RED_LAMP = BLOCKS.register("red_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> BLACK_LAMP = BLOCKS.register("black_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)));

    // ----------------------------------- Inverted Lamp -----------------------------------

    public static final RegistryObject<Block> INVERTED_WHITE_LAMP = BLOCKS.register("inverted_white_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_ORANGE_LAMP = BLOCKS.register("inverted_orange_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_MAGENTA_LAMP = BLOCKS.register("inverted_magenta_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_LIGHT_BLUE_LAMP = BLOCKS.register("inverted_light_blue_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_YELLOW_LAMP = BLOCKS.register("inverted_yellow_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_LIME_LAMP = BLOCKS.register("inverted_lime_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_PINK_LAMP = BLOCKS.register("inverted_pink_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_GRAY_LAMP = BLOCKS.register("inverted_gray_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_LIGHT_GRAY_LAMP = BLOCKS.register("inverted_light_gray_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_CYAN_LAMP = BLOCKS.register("inverted_cyan_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_PURPLE_LAMP = BLOCKS.register("inverted_purple_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_BLUE_LAMP = BLOCKS.register("inverted_blue_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_BROWN_LAMP = BLOCKS.register("inverted_brown_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_GREEN_LAMP = BLOCKS.register("inverted_green_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_RED_LAMP = BLOCKS.register("inverted_red_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

    public static final RegistryObject<Block> INVERTED_BLACK_LAMP = BLOCKS.register("inverted_black_lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((LIT)->15)));

}