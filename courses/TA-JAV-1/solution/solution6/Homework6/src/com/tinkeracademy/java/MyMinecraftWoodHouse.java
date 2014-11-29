package com.tinkeracademy.java;

import org.bukkit.Location;
import org.bukkit.Material;


/**
 * MyMinecraftHouse.java
 * 
 * Copyright Tinker Academy 2014
 * 
 */

/**
 * @author student
 *
 */
public class MyMinecraftWoodHouse extends MyMinecraftHouse {
	
	public MyMinecraftWoodHouse(String name, int width, int height, Location location) { 
		super(name, width, height, location);
	} 
	
	public void build() {
		System.out.println("building a house made of " + Material.WOOD);
	}
	
}
