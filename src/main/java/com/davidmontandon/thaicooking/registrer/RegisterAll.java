package com.davidmontandon.thaicooking.registrer;

import net.minecraftforge.eventbus.api.IEventBus;

public class RegisterAll {

	public static void doRegister(IEventBus modEventBus ) {
		RegisterItems.ITEMS.register(modEventBus);
		RegisterBlocks.BLOCKS.register(modEventBus);
	}
	
	
}
