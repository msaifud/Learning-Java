package msaifud;

import java.util.Scanner; 

public class msaifud_lab00_q1 {
	public static void main(String[] args) {
		//Declare integer variables 
		int integer1 = 0; // first number to be input by user
		int integer2 = 0; //second number to be input by user
		int result;    // variable in which sum will be stored 
		
		//Declare a different type variable 
		Scanner inputScanner = new Scanner(System.in); 
		//Ask your TA about this line 
		
		System.out.println("Enter an integer :"); 
		// prompt; "\n" represents a new line
		// read an integer using the inputScanner varible 
		integer1 = inputScanner.nextInt (); 
		
		System.out.println("Enter a second integer"); 
		integer2 = inputScanner.nextInt(); 
		
		//Compute a value
		result = integer1 / integer2 * integer1 + integer2;
		
		//Output the result to the console 
		System.out.println("The result is: " + Integer.toString(result)); 
		
		inputScanner.close();
	}
}

