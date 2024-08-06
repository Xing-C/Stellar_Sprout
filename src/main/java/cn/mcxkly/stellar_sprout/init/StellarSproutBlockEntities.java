
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.mcxkly.stellar_sprout.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import cn.mcxkly.stellar_sprout.Blocks.entity.LaserRedBlockEntity;
import cn.mcxkly.stellar_sprout.stellar_sprout;

public class StellarSproutBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, stellar_sprout.MODID);
	public static final RegistryObject<BlockEntityType<?>> LASER_RED = register("laser_red", Stellar_Sprout_Blocks.LASER_RED, LaserRedBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
