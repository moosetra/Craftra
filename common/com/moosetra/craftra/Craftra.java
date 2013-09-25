package com.moosetra.craftra;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
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
 

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Craftra {
	
	
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
                        
           ItemStack dirtStack = new ItemStack(Block.dirt);
           ItemStack diamondStack = new ItemStack(Item.diamond, 64);
           ItemStack blackWoolStack = new ItemStack(Block.cloth, 10, 15);
           ItemStack stoneStack = new ItemStack(1, 32, 0);
           ItemStack gravelStack = new ItemStack(Block.gravel);
           
           GameRegistry.addShapelessRecipe(diamondStack, dirtStack);
           GameRegistry.addShapelessRecipe(stoneStack, diamondStack, dirtStack);
           
           GameRegistry.addRecipe(diamondStack, "xy", "yx", 
        		   'x', dirtStack, 'y', stoneStack);
           GameRegistry.addRecipe(gravelStack , "xyx", "y y", "xyx", 
        		   'x', dirtStack, 'y', diamondStack);
             
    }
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
      
    	
    }
   

}
