package com.tinkeracademy.java;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * StarterPack4.java
 * 
 * Your First Java Program
 */

/**
 * The StarterPack4 class will be used to understand the structure of a Java program.
 * 
 * Copyright Tinker Academy 2014
 * 
 * @author student
 *
 */
public class Homework6 extends JavaPlugin {

	/**
	 * This is the first method that will be executed by the Java Virtual Machine.
	 * 
	 * It accepts some input and then prints some text to the console.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Homework 6");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (label.equalsIgnoreCase("buildwoodhouse")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				Location location = player.getLocation();
				MyMinecraftHouse house = new MyMinecraftWoodHouse("Casa Rosa", 10, 10, location);
				house.build();
				return true;
			}
		}
		return false;
	}

	
	
	

}
