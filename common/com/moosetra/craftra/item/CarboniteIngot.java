package com.moosetra.craftra.item;

import com.moosetra.craftra.lib.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CarboniteIngot extends Item {

	public CarboniteIngot(int id) {
		super(id);
		
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("CarboniteIngot");
		setTextureName(Reference.MOD_NAME.toLowerCase() + ":CarboniteIngot");
	}

}