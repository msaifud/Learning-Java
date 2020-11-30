package msaifud; 
import java.util.Scanner;
public class msaifud_lab01_q1 {
	public static void main(String[] args) {
		System.out.println("****************** \nES1036B Lab 01 Q1 \nDate:\nName: Muhammad\n" 
				+ "Student number\nProgram's mission: This program calculates a \n"
				+ "weigthed average of four grades\n******************");
		// Step 1. Input the value of the radius of the cone
		// Step 2. Input the value of the height of the cone
		double radius = 0, height = 0, volume = 0; // Declared the variables that are going to be used 
		Scanner inputScanner = new Scanner (System.in);
		//The above statement allows the user to input a value
		System.out.println("Enter an integer for radius");
		radius = inputScanner.nextDouble(); 
		System.out.println("Enter an integer for height");
		height = inputScanner.nextDouble(); 
		/*Both statements referring to radius and height 
		 * are here for the user to know when to input a 
		 * value for the variable
		 */
		
		double PI = Math.PI;
		volume = ((PI * radius * radius * height)/3);
		// This is the formula for the volume of a cone
		System.out.println("The volume of the cone with radius "  + Double.toString(radius) +
		" and height " + Double.toString(height) + " has a volume of " + Double.toString(volume)); 
		/* The last statement is out putting a variety of things, and
		 * converting the varibles from double to string and displaying 
		 * them onto the console 
		 */
		inputScanner.close();
	}

}


