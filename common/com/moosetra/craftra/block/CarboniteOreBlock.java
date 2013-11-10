package com.moosetra.craftra.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.moosetra.craftra.Craftra;
import com.moosetra.craftra.lib.Reference;

public class CarboniteOreBlock extends Block {

	public CarboniteOreBlock(int ID, Material material) {
		super(ID, material);
		
		setHardness(2.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("CarboniteOre");
		setCreativeTab(CreativeTabs.tabBlock);
		
	}		
	
		
}