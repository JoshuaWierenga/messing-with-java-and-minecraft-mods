package com.joshua.testmod.init;

import com.joshua.testmod.item.ItemTest;
import com.joshua.testmod.item.ItemTest2;
import com.joshua.testmod.item.ItemsTestMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemsTestMod TestItem = new ItemTest();
    public static final ItemsTestMod TestItem2 = new ItemTest2();

    public static void init()
    {
        GameRegistry.registerItem(TestItem, "Testitem");
        GameRegistry.registerItem(TestItem2, "Testitem2");
    }
}