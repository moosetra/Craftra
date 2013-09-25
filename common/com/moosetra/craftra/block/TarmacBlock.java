package com.moosetra.craftra.block;

import com.moosetra.craftra.Craftra;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

public class TarmacBlock extends Block {

	public TarmacBlock(int id, Material material) {
		super(id, material);
		
		setHardness(1.5f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("TarmacBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
}
