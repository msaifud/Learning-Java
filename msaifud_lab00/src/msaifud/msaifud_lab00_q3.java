package msaifud;

import java.util.Scanner; 

public class msaifud_lab00_q3 {
	
	public static void main (String[] args) {
		// Assign values to variables 
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0, perimeter = 0, hypotenuse = 0, 
				side1 = 0, side2 = 0;// Declare all the variables as double and assigning an initial value to them
		// Declare Scanner input, so that user will be able to assign their own values to x1, x2, y1, and y2
		Scanner inputScanner = new Scanner (System.in);
		System.out.println("Enter an integer for x1");
		x1 = inputScanner.nextInt();
		System.out.println("Enter an integer for y1");
		y1 = inputScanner.nextInt();
		System.out.println("Enter an integer for x2");
		x2 = inputScanner.nextInt();
		System.out.println("Enter an integer for y2");
		y2 = inputScanner.nextInt(); 
		side1 = x2 - x1;// this statement states that side1 will be equal to the difference of x2 - x1
		side2 = y2 - y1;// this statement states that side2 will be equal to the difference of y2 - y1
		// This will compute a value 
		hypotenuse = Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2,  2.0));
		perimeter = side1 + side2 + hypotenuse; 
		// This statement will output a value for the hypotenuse; then using this to find the perimeter  
		System.out.println("The perimeter of the right angle triangle with sides" + Double.toString(side1) + ","
				+ Double.toString(side2) + "and hypotenuse" + Double.toString(hypotenuse) + "is" + Double.toString(perimeter));
		/* The above statement will convert the values of side1, side2, hypotenuse and perimeter from double to string; then it will present
		 * the the value of the hypotenuse and perimeter of the right angle triangle
		 */
		inputScanner.close(); 			
	}
}
