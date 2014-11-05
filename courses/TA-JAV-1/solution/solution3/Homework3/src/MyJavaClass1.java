/**
 * MyJavaClass1.java
 * 
 * Example program showing the use of the 
 * 	keyword static in method signatures
 * 	keyword void in method signatures
 */

/**
 * @author student
 *
 */
public class MyJavaClass1 {

	/**
	 * This is an example of a static method
	 * 
	 * The method can be invoked using the code
	 * 
	 * MyJavaClass1.staticMethod1()
	 */
	public static void staticMethod1() {
		System.out.println("MyJavaClass1.staticMethod1 invoked successfully.");
	}
	
	/**
	 * Checks if a integer is even or odd 
	 * 
	 * @param num integer to check
	 * @return true if integer is true, else return false
	 */
	public boolean isEven(int num) {
		int rem = 0;
		rem = num % 2;
		if (num % 2 == 0)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Calculates the factorial of a positive integer.
	 * 
	 * A factorial of a positive integer multiplied by itself and all previous integers up to and including 1 
	 * 
	 * The factorial of 0 is 1.
	 * 
	 * @param num integer for which to calculate the factorial
	 * 
	 * @return the factorial of the integer
	 */
	public int factorial(int num) {
		int result = 1;
		int i = 1;
		for (i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}
	
	//TODO (1) 
	public int addNumbers(int num) {
		int result = 0;
		int i = 0;
		for (i = 0; i < num; ++i) {
			result = result + (i + 1);
		}
		return result;
	}
}
