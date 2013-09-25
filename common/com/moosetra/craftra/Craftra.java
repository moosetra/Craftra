package com.moosetra.craftra;

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
                        
    }
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
      
    	
    }
   

}
