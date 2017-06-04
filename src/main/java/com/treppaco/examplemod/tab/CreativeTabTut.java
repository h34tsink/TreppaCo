package com.treppaco.examplemod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by h34tsink on 5/30/2017.
 */
public class CreativeTabTut extends CreativeTabs {

    public CreativeTabTut(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.EMERALD;
    }
}
