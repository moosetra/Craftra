package com.moosetra.craftra.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TarBlock extends Block {

	public TarBlock(int id, Material material) {
		super(id, material);
		
		setHardness(0.5f);
		setStepSound(Block.soundGravelFootstep);
		setUnlocalizedName("TarBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	public int idDropped(int metadata, Random random, int fortune) {
		return Item.gunpowder.itemID;
	}

}
