
package net.mcreator.pact.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.pact.item.KnifeItem;
import net.mcreator.pact.DohtitansModElements;

@DohtitansModElements.ModElement.Tag
public class DOHTitansItemGroup extends DohtitansModElements.ModElement {
	public DOHTitansItemGroup(DohtitansModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdoh_titans") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KnifeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
