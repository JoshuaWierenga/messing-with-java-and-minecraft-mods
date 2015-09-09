package com.joshua.testmod.init;

import com.joshua.testmod.block.BlockFluidTest;
import com.joshua.testmod.block.BlockFluidTest2;
import com.joshua.testmod.fluid.FluidTest;
import com.joshua.testmod.fluid.FluidTest2;
import com.joshua.testmod.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids
{
    public static Fluid testFluid = new Fluid("testFluid");
    public static Block testFluidBlock = new BlockFluidTest(Material.rock);
    public static Fluid testFluid2 = new Fluid("testFluid2");
    public static Block testFluidBlock2 = new BlockFluidTest2(Material.rock);

    public static void init()
    {
        FluidRegistry.registerFluid(testFluid);
        FluidRegistry.registerFluid(testFluid2);

        testFluidBlock = new FluidTest(testFluid, Material.water);
        testFluidBlock2 = new FluidTest2(testFluid2, Material.lava);

        GameRegistry.registerBlock(testFluidBlock, "TestFluid");
        GameRegistry.registerBlock(testFluidBlock2, "TestFluid2");

        LogHelper.info("FluidTest registered as : " + testFluidBlock.getUnlocalizedName());
        LogHelper.info("FluidTest2 registered as : " + testFluidBlock2.getUnlocalizedName());
        LogHelper.info("BlockFluidTest registered as : " +  testFluidBlock.getUnlocalizedName());
        LogHelper.info("BlockFluidTest2 registered as : " +  testFluidBlock2.getUnlocalizedName());
    }
}