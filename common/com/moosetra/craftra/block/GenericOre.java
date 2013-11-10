package com.moosetra.craftra.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.moosetra.craftra.lib.Reference;

public class GenericOre extends Block {

	public GenericOre(int id, Material material) {
		super(id, material);
		
		setHardness(1.5f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("GenericOre");
		setCreativeTab(CreativeTabs.tabBlock);
				
	}
	
}