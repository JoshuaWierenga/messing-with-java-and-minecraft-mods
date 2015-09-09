package com.joshua.testmod.init;

import com.joshua.testmod.item.ItemTest;
import com.joshua.testmod.item.ItemTest2;
import com.joshua.testmod.item.ItemsTestMod;
import com.joshua.testmod.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class ModItems
{
    public static final ItemsTestMod TestItem = new ItemTest();
    public static final ItemsTestMod TestItem2 = new ItemTest2();
    public static Item TestItemBucket = new ItemBucket(ModFluids.testFluidBlock);

    public static void init()
    {
        GameRegistry.registerItem(TestItem, "Testitem");
        GameRegistry.registerItem(TestItem2, "Testitem2");
        GameRegistry.registerItem(TestItemBucket, "TestItemBucket");

        FluidContainerRegistry.registerFluidContainer(ModFluids.testFluid, new ItemStack(TestItemBucket), new ItemStack(Items.bucket));

        LogHelper.info(TestItem.getUnlocalizedName());
        LogHelper.info(TestItem2.getUnlocalizedName());
        LogHelper.info(TestItemBucket.getUnlocalizedName());
    }
}