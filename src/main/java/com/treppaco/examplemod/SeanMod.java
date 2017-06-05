package com.treppaco.examplemod;

import com.treppaco.examplemod.item.ModItems;
import com.treppaco.examplemod.proxy.CommonProxy;
import com.treppaco.examplemod.tab.CreativeTabTut;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SeanMod.MODID, name = SeanMod.NAME, version = SeanMod.VERSION)
public class SeanMod {
    static final String NAME     = "Sean's Example Mod";
    public static final String MODID    = "examplemod";
    static final String VERSION  = "1.0";

    @SidedProxy(clientSide = "com.treppaco.examplemod.proxy.ClientProxy", serverSide = "com.treppaco.examplemod.proxy.CommonProxy")
    private static CommonProxy proxy;

    //TODO-sean work on models next

    //Another test change
    // one more test change

    @Mod.Instance
    public static SeanMod instance;

    public static CreativeTabTut tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabTutorial = new CreativeTabTut(CreativeTabs.getNextID(), "tab_tutorial");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());

        proxy.init(event);

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {

        proxy.postInit(event);

    }



}