


/**
 * Homework5.java
 * 
 * Your First Java Program
 */

/**
 * The Homework5 class will be used to understand the structure of a Java program.
 * 
 * Copyright Tinker Academy 2014
 * 
 * @author student
 *
 */
public class Homework5 {

	/**
	 * This is the first method that will be executed by the Java Virtual Machine.
	 * 
	 * It accepts some input and then prints some text to the console.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Homework 5");
		MyMinecraftHouse myHouse = new MyMinecraftGlassHouse("Casa Rosa", 10, 10);
		myHouse.build();
	}

}
