package com.moosetra.craftra.item;

import com.moosetra.craftra.lib.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class CarboniteSword extends ItemSword{
	
	public CarboniteSword(int ID, EnumToolMaterial par2EnumToolMaterial) {
		super(ID, par2EnumToolMaterial);

		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("CarboniteSword");
		setTextureName(Reference.MOD_NAME.toLowerCase() + ":CarboniteSword");
		

	}
}