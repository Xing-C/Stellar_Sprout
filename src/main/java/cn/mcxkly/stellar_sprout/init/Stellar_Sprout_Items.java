
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.mcxkly.stellar_sprout.init;

import cn.mcxkly.stellar_sprout.Items.StarrySkySpaceItem;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import cn.mcxkly.stellar_sprout.Items.StarEnergyDustItem;
import cn.mcxkly.stellar_sprout.stellar_sprout;

public class Stellar_Sprout_Items {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, stellar_sprout.MODID);

	public static final RegistryObject<Item> LASER_RED = block(Stellar_Sprout_Blocks.LASER_RED);
	public static final RegistryObject<Item> STAR_ENERGY_DUST = REGISTRY.register("star_energy_dust", () -> new StarEnergyDustItem());
	public static final RegistryObject<Item> STARRY_SKY_SPACE = REGISTRY.register("starry_sky_space", () -> new StarrySkySpaceItem());

	// 注册它们
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
