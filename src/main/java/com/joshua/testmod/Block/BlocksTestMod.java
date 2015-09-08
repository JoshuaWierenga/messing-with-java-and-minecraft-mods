package com.joshua.testmod.block;

import com.joshua.testmod.creativetab.CreativeTabTestMod;
import com.joshua.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlocksTestMod extends Block
{
    public BlocksTestMod(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabTestMod.TestMod_TAB);
    }

    public BlocksTestMod()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabTestMod.TestMod_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnrwappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnrwappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnrwappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}