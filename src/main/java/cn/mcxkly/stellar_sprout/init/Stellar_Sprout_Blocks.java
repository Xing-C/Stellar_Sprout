
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.mcxkly.stellar_sprout.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import cn.mcxkly.stellar_sprout.Blocks.StarrySkySpacePortalBlock;
import cn.mcxkly.stellar_sprout.Blocks.LaserRedBlock;
import cn.mcxkly.stellar_sprout.stellar_sprout;

public class Stellar_Sprout_Blocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, stellar_sprout.MODID);

	public static final RegistryObject<Block> LASER_RED = REGISTRY.register("laser_red", () -> new LaserRedBlock());
	public static final RegistryObject<Block> STARRY_SKY_SPACE_PORTAL = REGISTRY.register("starry_sky_space_portal", () -> new StarrySkySpacePortalBlock());



}
