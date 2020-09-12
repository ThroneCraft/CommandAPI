package dev.jorel.commandapi.arguments;

import org.bukkit.enchantments.Enchantment;

import dev.jorel.commandapi.CommandAPIHandler;

/**
 * An argument that represents the Bukkit Enchantment object
 */
public class EnchantmentArgument extends SafeOverrideableArgument<Enchantment> {
	
	/**
	 * An Enchantment argument. Represents an enchantment for items 
	 */
	public EnchantmentArgument() {
		super(CommandAPIHandler.getNMS()._ArgumentEnchantment(), fromKey(Enchantment::getKey));
	}

	@Override
	public Class<?> getPrimitiveType() {
		return Enchantment.class;
	}
	
	@Override
	public CommandAPIArgumentType getArgumentType() {
		return CommandAPIArgumentType.ENCHANTMENT;
	}
}