package com.joshua.testmod.init;


import com.joshua.testmod.block.BlockFluidTest;
import com.joshua.testmod.fluid.FluidTest;
import com.joshua.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids
{
    public static Fluid testFluid = new Fluid("FluidTest");
    public static Block testFluidBlock = new BlockFluidTest(Material.rock);

    public static void init()
    {
        FluidRegistry.registerFluid(testFluid);
        testFluidBlock = new FluidTest(testFluid, Material.water).setBlockName("testFluid");
        GameRegistry.registerBlock(testFluidBlock, Reference.MOD_ID + "_" + testFluidBlock.getUnlocalizedName().substring(5));
        testFluid.setUnlocalizedName(testFluidBlock.getUnlocalizedName());
    }
}