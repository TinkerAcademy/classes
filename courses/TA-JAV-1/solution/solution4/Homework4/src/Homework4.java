/**
 * StarterPack4.java
 * 
 * Copyright Tinker Academy 2014
 */

/**
 * Homework4 based on Handout4 of TA-JAV-1 Programming in Java
 * 
 * Copyright Tinker Academy 2014
 * 
 * @author student
 *
 */
public class Homework4 {

	/**
	 * This is the first method that will be executed by the Java Virtual Machine.
	 * 
	 * It accepts some input and then prints some text to the console.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Homework 4");
		
		MyMinecraftPlayerInfo myPlayerInfo = new MyMinecraftPlayerInfo("Player1", (float) 10.0, 4, true);
		int foodLevel = myPlayerInfo.getFoodLevel();
		System.out.println(foodLevel);
		myPlayerInfo.addFoodLevel(6);
		foodLevel = myPlayerInfo.getFoodLevel();
		System.out.println(foodLevel);
	}

}
