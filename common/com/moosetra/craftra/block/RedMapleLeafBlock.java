package com.moosetra.craftra.block;

import com.moosetra.craftra.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RedMapleLeafBlock extends Block {
	
	public RedMapleLeafBlock(int id, Material material) {
		super(id, material);
		
		setHardness(0.5f);
		setStepSound(Block.soundGrassFootstep);
		setUnlocalizedName("RedMapleLeafBlock");
		setCreativeTab(CreativeTabs.tabDecorations);
		setTextureName(Reference.MOD_NAME.toLowerCase() + ":RedMapleLeaf");
		
		
	}

}
