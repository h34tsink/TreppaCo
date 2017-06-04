package com.treppaco.examplemod.item;

import com.treppaco.examplemod.SeanMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by h34tsink on 5/30/2017.
 */
public class ModItems {

    public static Item tutorialItem;

    public static void preInit() {

        tutorialItem = new ItemTutorialItem(EnumHelper.addToolMaterial("SOAD", 3, 5000,10,25,30), "tutorial_item");

        registerITems();
    }

    public static void registerITems() {
        GameRegistry.register(tutorialItem, new ResourceLocation(SeanMod.MODID, "tutorial_item"));

    }

    public static void registerRender() {

        registerRender(tutorialItem);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(SeanMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
