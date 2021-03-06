package com.moosetra.craftra.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.moosetra.craftra.Craftra;
import com.moosetra.craftra.lib.Reference;


public class TarBlock extends Block {
	

	public TarBlock(int id, Material material) {
		super(id, material);
		
		setHardness(1.0f);
		setStepSound(Block.soundGravelFootstep);
		setUnlocalizedName("TarBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName(Reference.MOD_NAME.toLowerCase() + ":TarBlock");
		
	}	
		public int idDropped(int par1, Random random, int zero) {
	        return Craftra.TarPileItem.itemID;
	}
	
}	
 		

