package com.moosetra.craftra.block;

import com.moosetra.craftra.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class CarboniteBombBlock extends Block{

	public CarboniteBombBlock(int ID, Material material) {
		super(ID, material);
		setCreativeTab(CreativeTabs.tabRedstone);
		setHardness(2.0F);
		setStepSound(Block.soundMetalFootstep);
		setUnlocalizedName("CarboniteBomb");
		setTextureName(Reference.MOD_NAME.toLowerCase() + ":CarboniteBomb");
		
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
		topIcon = icon.registerIcon(Reference.MOD_NAME.toLowerCase() + ":CarboniteBombTop");
		sideIcon = icon.registerIcon(Reference.MOD_NAME.toLowerCase() + ":CarboniteBomb");
		bottomIcon = icon.registerIcon(Reference.MOD_NAME.toLowerCase() + ":CarboniteBombTop");
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


