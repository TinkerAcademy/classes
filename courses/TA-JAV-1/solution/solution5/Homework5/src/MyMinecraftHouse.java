

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
public abstract class MyMinecraftHouse {
	
	public MyMinecraftHouse(String name, int width, int height) { 
		this.name = name; 
		this.width = width;
		this.height = height;
	} 
	
	protected int width;
	
	protected int height;
	
	protected String name;
	
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

}
