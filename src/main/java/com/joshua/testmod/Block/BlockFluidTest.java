package com.joshua.testmod.block;

import com.joshua.testmod.creativetab.CreativeTabTestMod;
import com.joshua.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockFluidTest extends Block
{

    public BlockFluidTest(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabTestMod.TestMod_TAB);
    }
}
