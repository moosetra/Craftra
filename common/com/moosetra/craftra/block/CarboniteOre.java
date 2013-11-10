package com.moosetra.craftra.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.moosetra.craftra.lib.Reference;

public class CarboniteOre extends Block {

	public CarboniteOre(int id, Material material) {
		super(id, material);
		
		setHardness(1.5f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("GenericOre");
		setCreativeTab(CreativeTabs.tabBlock);
				
	}
	
	public int idDropped(int metadata, Random random,int fortune) {
		return Block.CarboniteOre.itemID;
	}
	
}