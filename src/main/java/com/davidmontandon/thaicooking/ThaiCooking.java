package com.davidmontandon.thaicooking;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.davidmontandon.thaicooking.registrer.RegisterAll;

@Mod("thaicooking")
@Mod.EventBusSubscriber(modid = ThaiCooking.MOD_ID, bus = Bus.MOD)
public class ThaiCooking
{
    public static ThaiCooking instance ; 
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "thaicooking" ; 
    
    public ThaiCooking() {    	
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus() ; 
    	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegisterAll.doRegister(modEventBus);
        
        instance = this ; 
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

}
