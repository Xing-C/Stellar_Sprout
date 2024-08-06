
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package cn.mcxkly.stellar_sprout.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import cn.mcxkly.stellar_sprout.World.inventory.MultiBlockMenu;
import cn.mcxkly.stellar_sprout.stellar_sprout;

public class Stellar_Sprout_Menus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, stellar_sprout.MODID);
	public static final RegistryObject<MenuType<MultiBlockMenu>> MULTI_BLOCK = REGISTRY.register("multi_block", () -> IForgeMenuType.create(MultiBlockMenu::new));
}
