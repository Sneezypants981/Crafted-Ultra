
package net.mcreator.craftedultra.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.craftedultra.CraftedUltraModElements;

@CraftedUltraModElements.ModElement.Tag
public class HolystoneItem extends CraftedUltraModElements.ModElement {
	@ObjectHolder("crafted_ultra:holystone")
	public static final Item block = null;
	public HolystoneItem(CraftedUltraModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CraftedUltraModElements.sounds.get(new ResourceLocation("crafted_ultra:holystone")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("holystone");
		}
	}
}
