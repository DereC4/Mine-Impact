
package net.minecraftimpact.enchantment;

import net.minecraftimpact.MinecraftImpactModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

@MinecraftImpactModElements.ModElement.Tag
public class AnemoEnchantEnchantment extends MinecraftImpactModElements.ModElement {
	@ObjectHolder("minecraft_impact:anemo_enchant")
	public static final Enchantment enchantment = null;
	public AnemoEnchantEnchantment(MinecraftImpactModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("anemo_enchant"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
