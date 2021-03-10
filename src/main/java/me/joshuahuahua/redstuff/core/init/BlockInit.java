package me.joshuahuahua.redstuff.core.init;

import me.joshuahuahua.redstuff.RedStuff;
import net.minecraft.block.*;
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


public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            RedStuff.MOD_ID);

    // Copper
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore",
            () -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block",
            () -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));
    // Misc

    public static final RegistryObject<Block> LAMP = BLOCKS.register("lamp",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS)
                    .hardnessAndResistance(0.3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .setLightLevel((POG)->15)));
                    //.setLightLevel(15);

}