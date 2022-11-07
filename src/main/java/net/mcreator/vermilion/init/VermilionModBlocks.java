
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vermilion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.vermilion.block.CarmineCarnationBlock;
import net.mcreator.vermilion.VermilionMod;

public class VermilionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VermilionMod.MODID);
	public static final RegistryObject<Block> CARMINE_CARNATION = REGISTRY.register("carmine_carnation", () -> new CarmineCarnationBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CarmineCarnationBlock.registerRenderLayer();
		}
	}
}
