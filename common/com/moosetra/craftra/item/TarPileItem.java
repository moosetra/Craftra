package com.moosetra.craftra.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.moosetra.craftra.lib.Strings;
import com.moosetra.craftra.Craftra;

public class TarPileItem extends Item {

	public TarPileItem(int id) {
		super(id);
		
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.TarPileItem_NAME);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("TarPileItem");
		
	}

}
