package com.moosetra.craftra.item;

import com.moosetra.craftra.lib.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CarboniteItem extends Item {

	public CarboniteItem(int id) {
		super(id);
		
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("CarboniteItem");
	    
	}

}