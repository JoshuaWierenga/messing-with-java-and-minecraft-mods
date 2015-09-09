package com.joshua.testmod.init;

import com.joshua.testmod.block.BlockTest;
import com.joshua.testmod.block.BlockTest2;
import com.joshua.testmod.block.BlocksTestMod;
import com.joshua.testmod.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static BlocksTestMod TestBlock = new BlockTest();
    public static BlocksTestMod TestBlock2 = new BlockTest2();

    public static void init()
    {
        GameRegistry.registerBlock(TestBlock, "TestBlock");
        GameRegistry.registerBlock(TestBlock2, "TestBlock2");

        LogHelper.info("BlockTest registered as : " + TestBlock.getUnlocalizedName());
        LogHelper.info("BlockTest2 registered as : " + TestBlock2.getUnlocalizedName());
    }
}