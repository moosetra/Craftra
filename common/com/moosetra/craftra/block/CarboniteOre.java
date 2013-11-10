package com.moosetra.craftra.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.moosetra.craftra.lib.Reference;

public class CarboniteOre extends BlockOre {

	public CarboniteOre(int par1) {
		super(par1);
		
		setHardness(2.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("CarboniteOre");
		setCreativeTab(CreativeTabs.tabBlock);
				
	}
	
		
}