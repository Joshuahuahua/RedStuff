package me.joshuahuahua.redstuff.init;

import me.joshuahuahua.redstuff.RedStuff;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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


public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            RedStuff.MOD_ID);

    // Copper
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5f, 6f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.METAL)));
}