package com.joshua.testmod.init;

import com.joshua.testmod.block.BlockFluidTest;
import com.joshua.testmod.block.BlockFluidTest2;
import com.joshua.testmod.fluid.FluidTest;
import com.joshua.testmod.fluid.FluidTest2;
import com.joshua.testmod.reference.Reference;
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
        testFluidBlock2 = new FluidTest2(testFluid2, Material.water);

        GameRegistry.registerBlock(testFluidBlock, Reference.MOD_ID + "_" + testFluidBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(testFluidBlock2, Reference.MOD_ID + "_" + testFluidBlock2.getUnlocalizedName().substring(5));

        testFluid.setUnlocalizedName(testFluidBlock.getUnlocalizedName());
        testFluid2.setUnlocalizedName(testFluidBlock2.getUnlocalizedName());
    }
}