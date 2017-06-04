package com.treppaco.examplemod.proxy;

import com.treppaco.examplemod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by h34tsink on 5/30/2017.
 */
public class ClientProxy extends CommonProxy  {

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRender();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
