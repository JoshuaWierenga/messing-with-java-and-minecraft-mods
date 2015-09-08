package com.joshua.testmod.fluid;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class FluidTest2 extends FluidsTestMod
{

    public FluidTest2(Fluid fluid, Material material)
    {
        super(fluid, material);
        this.setBlockName("testFluid2");
    }
}