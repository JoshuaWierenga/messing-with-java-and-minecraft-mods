package com.joshua.testmod;

import com.joshua.testmod.handlers.BucketHandler;
import com.joshua.testmod.handlers.ConfigurationHandler;
import com.joshua.testmod.init.ModBlocks;
import com.joshua.testmod.init.ModFluids;
import com.joshua.testmod.init.ModItems;
import com.joshua.testmod.init.Recipes;
import com.joshua.testmod.proxy.IProxy;
import com.joshua.testmod.reference.Reference;
import com.joshua.testmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TestMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static TestMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();
        ModFluids.init();

        BucketHandler.INSTANCE.buckets.put(ModFluids.testFluidBlock, ModItems.TestItemBucket);
        MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");

        /*for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
            LogHelper.info(OreDictionary.getOres(oreName));
        }*/
    }
}