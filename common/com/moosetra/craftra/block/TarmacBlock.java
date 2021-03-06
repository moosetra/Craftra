package com.moosetra.craftra.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.moosetra.craftra.lib.Reference;


public class TarmacBlock extends Block {

	public TarmacBlock(int id, Material material) {
		super(id, material);
		
		setHardness(5f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("TarmacBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName(Reference.MOD_NAME.toLowerCase() + ":Tarmac");
		
	}
	
}
