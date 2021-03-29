package me.joshuahuahua.redstuff.blocks;

import me.joshuahuahua.redstuff.RedStuff;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Random;

public class LampBlock extends Block {

    static Logger logger = LogManager.getLogger(RedStuff.MOD_ID);


    public LampBlock() {
        super(Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(0.3f, 3f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(-1)
                .sound(SoundType.GLASS)
                .setLightLevel(LampBlock::getLightValue)
                .notSolid());
    }

    // Called just after the player places a block. Checks redstone strength inputs on placement
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        BlockState newBlockState = getLampIntensity(worldIn, pos, state);
        worldIn.setBlockState(pos, newBlockState, 3);
    }

    //A neighbour has updated their state.  Check if redstone strength inputs have changed
    @Override
    @SuppressWarnings("deprecation")
    public void neighborChanged(BlockState currentState, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        BlockState newBlockState = getLampIntensity(worldIn, pos, currentState);
        if (newBlockState != currentState) {
            worldIn.setBlockState(pos, newBlockState, 3);
        }
    }

    public static int getLightValue(BlockState state) {
        return state.get(INTENSITY);
    }

    private static final IntegerProperty INTENSITY = IntegerProperty.create("intensity", 0, 15);

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(INTENSITY);
    }

    private BlockState getLampIntensity(World world, BlockPos pos, BlockState state) {
        int power = world.getRedstonePowerFromNeighbors(pos);
        return state.with(INTENSITY, power);
    }
}