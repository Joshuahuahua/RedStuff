package me.joshuahuahua.redstuff.blocks;

import me.joshuahuahua.redstuff.RedStuff;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;

public class LampBlock extends Block {

    Logger logger = LogManager.getLogger(RedStuff.MOD_ID);

    public LampBlock() {
        super(AbstractBlock.Properties.create(Material.GLASS)
                .hardnessAndResistance(0.3f, 3f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(-1)
                .sound(SoundType.GLASS)
                .setLightLevel((LIT)-> 0).notSolid());
    }

    @Override
    @SuppressWarnings("deprecation")
    public void neighborChanged(BlockState currentState, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        int power = worldIn.getRedstonePowerFromNeighbors(pos);
        logger.debug(String.valueOf(power));
        if (power > 0) {
            //
        }
        else {
            //
        }
    }

    /*
    private static final IntegerProperty light = IntegerProperty.create("light_value", 0, 15);

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(light);
    }

    private BlockState lightOn(BlockState state) {
        BlockState newBlockState = state.with(light, 15);
        return newBlockState;
    }

    private BlockState lightOff(BlockState state) {
        BlockState newBlockState = state.with(light, 0);
        return newBlockState;
    }



    private static int getLightValue(BlockState blockState) {

        int lightValue = blockState.get(light);

        return lightValue;
    }*/

}
