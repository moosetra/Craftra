package com.moosetra.craftra.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.moosetra.craftra.item.TarPileItem;
import com.moosetra.craftra.lib.Strings;
import com.moosetra.craftra.lib.ItemIds;
import com.moosetra.craftra.lib.BlockIds;
import com.moosetra.craftra.Craftra;

public class TarBlock extends Block {
	

	public TarBlock(int id, Material material) {
		super(id, material);
		
		this.setUnlocalizedName(Strings.TarBlock_NAME);
		setHardness(0.5f);
		setStepSound(Block.soundGravelFootstep);
		setUnlocalizedName("TarBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		
		
	}
	
	public int idDropped(int metadata, Random random, int fortune) {
		return 

	}		
}
