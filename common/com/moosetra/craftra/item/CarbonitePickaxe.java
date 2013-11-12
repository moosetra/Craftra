package com.moosetra.craftra.item;

import com.moosetra.craftra.lib.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class CarbonitePickaxe extends ItemSword{
	
	public CarbonitePickaxe(int ID, EnumToolMaterial par2EnumToolMaterial) {
		super(ID, par2EnumToolMaterial);

		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("CarbonitePickaxe");
		setTextureName(Reference.MOD_NAME.toLowerCase() + ":CarbonitePickaxe");
		

	}
}