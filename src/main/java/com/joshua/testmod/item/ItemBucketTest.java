package com.joshua.testmod.item;

import com.joshua.testmod.creativetab.CreativeTabTestMod;
import com.joshua.testmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

public class ItemBucketTest extends ItemBucket
{
    public ItemBucketTest(Block block)
    {
        super(block);
        this.setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ":testItemBucket");
        this.setCreativeTab(CreativeTabTestMod.TestMod_TAB);
        this.setContainerItem(Items.bucket);
    }
}