package com.joshua.testmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class Recipes
{
    public  static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.TestItem), "sss", " s ", " s ", 's', new ItemStack(Items.gold_nugget));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.TestBlock), "iii", "iii", "iii", 'i', new ItemStack(ModItems.TestItem));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TestItem, 9), new ItemStack(ModBlocks.TestBlock));
        GameRegistry.addRecipe(new ItemStack(ModItems.TestItem2), "bbb", "bdb", "bbb", 'b', new ItemStack(Blocks.diamond_block), 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.TestBlock2), "iii", "iii", "iii", 'i', new ItemStack(ModItems.TestItem2));
        GameRegistry.addSmelting(new ItemStack(ModItems.TestItem), new ItemStack(ModItems.TestItem2), 0.1F);
    }
}