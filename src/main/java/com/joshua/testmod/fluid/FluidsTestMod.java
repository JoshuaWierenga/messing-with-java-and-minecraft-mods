package com.joshua.testmod.fluid;

import com.joshua.testmod.creativetab.CreativeTabTestMod;
import com.joshua.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class FluidsTestMod extends BlockFluidClassic
{

    public FluidsTestMod(Fluid fluid, Material material)
    {
        super(fluid, material);
        this.setCreativeTab(CreativeTabTestMod.TestMod_TAB);
    }

    public FluidsTestMod(Fluid fluid)
    {
        super(fluid, Material.water);
        this.setCreativeTab(CreativeTabTestMod.TestMod_TAB);
    }

    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
        if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false;
        return super.canDisplace(world, x, y, z);
    }

    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
        if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false;
        return super.displaceIfPossible(world, x, y, z);
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