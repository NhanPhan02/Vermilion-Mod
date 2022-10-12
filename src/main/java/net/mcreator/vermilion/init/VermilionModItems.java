
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vermilion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.vermilion.item.CompressedRedstoneChunkItem;
import net.mcreator.vermilion.VermilionMod;

public class VermilionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VermilionMod.MODID);
	public static final RegistryObject<Item> COMPRESSED_REDSTONE_CHUNK = REGISTRY.register("compressed_redstone_chunk",
			() -> new CompressedRedstoneChunkItem());
}
