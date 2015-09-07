package com.joshua.testmod.init;



import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids
{
    public static Fluid FluidTest = new Fluid("FluidTest");

    public static void init()
    {
        FluidRegistry.registerFluid(FluidTest);
    }
}