package com.moosetra.craftra.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

import com.moosetra.craftra.Craftra;
import com.moosetra.craftra.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class RedMapleWoodBlock extends Block {
	

	public RedMapleWoodBlock(int id, Material material) {
		super(id, material);
		
		setHardness(2.0f);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName("RedMapleWoodBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName(Reference.MOD_NAME.toLowerCase() + ":RedMapleWood");
		
	}	
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon(Reference.MOD_NAME.toLowerCase() + ":RedMapleWoodTop");
		sideIcon = icon.registerIcon(Reference.MOD_NAME.toLowerCase() + ":RedMapleWood");
		bottomIcon = icon.registerIcon(Reference.MOD_NAME.toLowerCase() + ":RedMapleWoodTop");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
		if(side == 0) {
			return bottomIcon;
		}else if(side == 1) {
			return topIcon;
		}else {
			return sideIcon;
		}
	}
	
}