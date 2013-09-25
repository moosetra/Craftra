package com.moosetra.craftra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.moosetra.craftra.block.TarmacBlock;
import com.moosetra.craftra.lib.Reference;
import com.moosetra.craftra.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Craftra {
	
	public final static Block TarmacBlock = new TarmacBlock(500, Material.rock).setHardness(1.5f).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("TarmacBlock").setCreativeTab(CreativeTabs.tabBlock); 
	
    	@Instance("craftra")
    	public static Craftra instance;
    
   
    	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    	public static CommonProxy proxy;
   
    
    	@EventHandler
    	public void preInit(FMLPreInitializationEvent event) {
            	
    	}
    	@EventHandler
    	public void load(FMLInitializationEvent event) {
    			proxy.registerRenderers();
                        
    			GameRegistry.registerBlock(TarmacBlock, "TarmacBlock");
    			LanguageRegistry.addName(TarmacBlock, "Tarmac");
    			
          //ItemStack stackname = new ItemStack(block./item., amount, metadata), 
          //FurnaceRecipies.smelting().addSmelting(blockID, metadata, outputitemstack, xp); 
          //GameRegistry.addSmelting(input, output, xp);
          //GameRegistry.addShapelessRecipe(Result, Required item, Diff Required Item);
          //GameRegistry.addRecipe(gravelStack , Top"xyx", Mid"y y", Bottom"xyx", 
          //		   'x', Define Variable, 'y', Define Variable);
             
    	}
   
    	@EventHandler
    	public void postInit(FMLPostInitializationEvent event) {
      
    	
      }
   

}
