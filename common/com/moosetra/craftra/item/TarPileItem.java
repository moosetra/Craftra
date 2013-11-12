package com.moosetra.craftra.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.moosetra.craftra.lib.Reference;

public class TarPileItem extends Item {

	public TarPileItem(int id) {
		super(id);
		
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("TarPileItem");
	    setTextureName(Reference.MOD_NAME.toLowerCase() + ":TarPile");
		
	}

}
