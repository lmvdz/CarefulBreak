package me.morningsage.carefuldrops;

import me.morningsage.carefuldrops.command.CarefulDropsCommand;
import me.morningsage.carefuldrops.config.CarefulDropsConfig;
import me.morningsage.carefuldrops.config.ConfigFileHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.registry.CommandRegistry;
import net.minecraft.command.arguments.ArgumentTypes;
import net.minecraft.command.arguments.serialize.ConstantArgumentSerializer;

public class CarefulBlocks implements ModInitializer {
	public static ConfigFileHandler CONFIGHANDLER;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Load/Save the config file
		CONFIGHANDLER = new ConfigFileHandler(CarefulDropsConfig.class, "carefuldrops");

		// Allows for deserializing the commands
		ArgumentTypes.register("carefuldrops:config", CarefulDropsCommand.ConfigFieldArgumentType.class, new ConstantArgumentSerializer<>(CarefulDropsCommand.ConfigFieldArgumentType::configField));

		// Command is valid for both dedicated and integrated
		CommandRegistry.INSTANCE.register(true, CarefulDropsCommand::register);
		CommandRegistry.INSTANCE.register(false, CarefulDropsCommand::register);
	}
}