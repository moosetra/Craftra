package com.moosetra.craftra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import com.moosetra.craftra.block.TarBlock;
import com.moosetra.craftra.block.TarmacBlock;
import com.moosetra.craftra.item.LighterItem;
import com.moosetra.craftra.item.TarPileItem;
import com.moosetra.craftra.lib.Reference;
import com.moosetra.craftra.proxy.CommonProxy;
import com.moosetra.craftra.block.CarboniteOre;
import com.moosetra.craftra.item.CarboniteItem;

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
  
	// Blocks
	public final static Block TarmacBlock = new TarmacBlock(500, Material.rock); 
	public final static Block CarboniteOreBlock = new CarboniteOre(501);
	
	// Items
	public final static Item TarPileItem = new TarPileItem(5000);
	public final static Item LighterItem = new LighterItem(5001);
	public final static Item CarboniteItem = new CarboniteItem(5002);
	
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
             // Item Stacks  
                ItemStack gravelStack = new ItemStack(Block.gravel);
                ItemStack tarpileStack = new ItemStack(TarPileItem);
                ItemStack tarmacStack = new ItemStack(TarmacBlock);
                ItemStack lighterStack = new ItemStack(LighterItem); 
                ItemStack flintandsteelStack = new ItemStack(Item.flintAndSteel);
                ItemStack ironingotStack = new ItemStack(Item.ingotIron);
                ItemStack carboniteStack = new ItemStack(CarboniteItem);
                ItemStack carboniteoreStack = new ItemStack(CarboniteOreBlock);
                
              // Block Lang & Harvest Levels
    			GameRegistry.registerBlock(TarmacBlock, "TarmacBlock");
    			LanguageRegistry.addName(TarmacBlock, "Tarmac");
    			MinecraftForge.setBlockHarvestLevel(TarmacBlock, "Pickaxe", 2);
    			
    			GameRegistry.registerBlock(TarBlock, "TarBlock");
    			LanguageRegistry.addName(TarBlock, "Tar");
    			MinecraftForge.setBlockHarvestLevel(TarBlock, "Shovel", 0);
    			
    		  // Item Lang
    			GameRegistry.registerItem(TarPileItem, "TarPileItem");
    			LanguageRegistry.addName(TarPileItem, "Tar Pile");
    			
    			GameRegistry.registerItem(LighterItem, "LighterItem");
    			LanguageRegistry.addName(LighterItem, "Lighter");
    			
    		  // Recipes
    		    GameRegistry.addRecipe(tarmacStack, "yxy", "xyx", "yxy",
    					'x', tarpileStack,'y', gravelStack);
    			
    			GameRegistry.addRecipe(lighterStack, "xxx", "xyx", "xxx",
    					'x', ironingotStack, 'y', flintandsteelStack); 
    			
    		  //FurnaceRecipies.smelting().addSmelting(carboniteoreStack, 0, carboniteStack, 0.2F);
    			
    			
             
    	}
   
    	@EventHandler
    	public void postInit(FMLPostInitializationEvent event) {
      
    	
      }
   

}
