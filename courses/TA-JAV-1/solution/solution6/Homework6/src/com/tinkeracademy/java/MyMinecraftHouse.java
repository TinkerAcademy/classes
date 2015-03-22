package com.tinkeracademy.java;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

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
public abstract class MyMinecraftHouse implements IHouse {
	
	public MyMinecraftHouse(String name, int width, int height, Location location) { 
		this.name = name; 
		this.width = width;
		this.height = height;
		this.location = location;
	} 
	
	protected int width;
	
	protected int height;
	
	protected String name;
	
	protected Location location;
		
	/**
	 * Builds a House
	 */
	public abstract void build();

	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}


	public String getName() {
		return name;
	}
	
	public Location getLocation() {
		return location;
	}
	
	private void makeCube(Location loc, int width, int height, Material mat) { 
		Location blockLoc = new Location(loc.getWorld(), 0, 0, 0); 
		int i; 
		int j; 
		int k; 
		 
		for (i = 0; i < width; i++) { 
		   for (j = 0; j < width; j++) { 
		       for (k = 0; k < height; k++) { 
		           blockLoc.setX(loc.getX() + i); 
		           blockLoc.setY(loc.getY() + j); 
		           blockLoc.setZ(loc.getZ() + k); 
		           Block block = loc.getWorld().getBlockAt(blockLoc); 
		           block.setType(mat); 
		       } 
		   } 
		}  

	} 


}
