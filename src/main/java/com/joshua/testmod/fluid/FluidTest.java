package com.joshua.testmod.fluid;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class FluidTest extends FluidsTestMod
{

    public FluidTest(Fluid fluid, Material material)
    {
        super(fluid, material);
        this.setBlockName("testFluid");
    }
}