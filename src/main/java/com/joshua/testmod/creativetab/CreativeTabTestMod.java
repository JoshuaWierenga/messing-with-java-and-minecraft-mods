package com.joshua.testmod.creativetab;

import com.joshua.testmod.init.ModItems;
import com.joshua.testmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTestMod
{
    public static final CreativeTabs TestMod_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.TestItem;
        }
    };

}