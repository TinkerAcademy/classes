package com.tinkeracademy.java;

import java.util.ArrayList;

import org.bukkit.Location;

/**
 * MyMysteryWoodHouseGenerator.java
 * 
 * Copyright Tinker Academy 2014
 * 
 */

/**
 * @author student
 *
 */
public class MyMysteryWoodHouseGenerator {

	private static ArrayList<MyMinecraftWoodHouse> woodHouses;

	public static MyMinecraftWoodHouse createNewHouse() {
		if (woodHouses == null) {
			woodHouses = new ArrayList<MyMinecraftWoodHouse>();
			woodHouses
					.add(new MyMinecraftRedWoodHouse("Red Wood House", 10, 10, null));
			woodHouses.add(new MyMinecraftBlueWoodHouse("Blue Wood House", 10,
					10, null));
			woodHouses.add(new MyMinecraftGreenWoodHouse("Green Wood House",
					10, 10, null));
		}
		MyMinecraftWoodHouse woodHouse = woodHouses.remove(0);
		return woodHouse;
	}
}

class MyMinecraftRedWoodHouse extends MyMinecraftWoodHouse {

	public MyMinecraftRedWoodHouse(String name, int width, int height, Location location) {
		super(name, width, height, location);
	}

	@Override
	public void build() {
		System.out.println("building a house (" + this.getClass().getName() + ")");
	}

}

class MyMinecraftBlueWoodHouse extends MyMinecraftWoodHouse {

	public MyMinecraftBlueWoodHouse(String name, int width, int height, Location location) {
		super(name, width, height, location);
	}

	@Override
	public void build() {
		System.out.println("building a house (" + this.getClass().getName() + ")");
	}

}

class MyMinecraftGreenWoodHouse extends MyMinecraftWoodHouse {

	public MyMinecraftGreenWoodHouse(String name, int width, int height, Location location) {
		super(name, width, height, location);
	}

	@Override
	public void build() {
		System.out.println("building a house (" + this.getClass().getName() + ")");
	}

}
