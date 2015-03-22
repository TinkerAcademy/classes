/* Program to Compute PI (for ever ...)  */

public class ComputePI {

	public static void main(String[] args) {
		
		// print the text "Hello World" to the console
		System.out.println("Computing PI for ever...mwahahaha");
    		double value = 0;
		int i = 1;
		while (true) {
			if (i % 2 == 0){
				value = value - 4.0 * 1/(2 * i - 1); 		
			} else {
				value = value + 4.0 * 1/(2 * i - 1); 		
			}
			i = i + 1;
			System.out.println(value);
		}
		
	}

}
