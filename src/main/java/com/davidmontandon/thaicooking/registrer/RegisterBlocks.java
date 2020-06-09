package com.davidmontandon.thaicooking.registrer;

import com.davidmontandon.thaicooking.ThaiCooking;
import com.davidmontandon.thaicooking.objects.blocks.crops.ChiliesCrops;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterBlocks {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,  ThaiCooking.MOD_ID) ; 	

	public static final RegistryObject<Block> MUSPELHEIM_IKADAMIA_CROP = BLOCKS.register("chilies",
			() -> new  ChiliesCrops(Block.Properties.from(Blocks.WHEAT)));
	
}
