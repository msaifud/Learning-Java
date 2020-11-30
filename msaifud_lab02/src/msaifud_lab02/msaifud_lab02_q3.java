package msaifud_lab02;

import java.util.Scanner;

public class msaifud_lab02_q3 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		double x1 = 0, x2 = 0, x4 = 0; // Declaring varibales 
		int x3 = 0;
		System.out.println("Please enter the first number:");
		x1 = inputScanner.nextDouble(); // input value for x1
		System.out.println("Please enter the second number:");
		x2 = inputScanner.nextDouble();// input value for x2
		System.out.println("Which operation would you like to perform?\n"
				+ "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\n"
				+ "6. Five Year Loan: Monthly Payment");
		x3 = inputScanner.nextInt();// input value for x3

		switch (x3) { // This switch statements checks the range for x3
		case 1: /* if x3 equals 1, then the following operations will be done.
		This method explained above, is done for the rest of the cases, the computer checks if
		the value of x3 equals the case value, if it does, it performs the operations under the
		case. Break is then used to stop the system from conducting more operations. If the value of
		x3 does not fall under any of the case values, the system defaults.
		*/
			x4 = (x1 + x2);
			System.out.println("The result is " + x4 + "\nGoodbye!");
			break;
		case 2:
			x4 = (x1 - x2);
			System.out.println("The result is " + x4 + "\nGoodbye!");
			break;
		case 3:
			x4 = (x1 * x2);
			System.out.println("The result is " + x4 + "\nGoodbye!");
			break;
		case 4:
			x4 = (x1 / x2);
			System.out.println("The result is " + x4 + "\nGoodbye!");
			break;
		case 5:
			x4 = (x1 % x2);
			System.out.println("The result is " + x4 + "\nGoodbye!");
			break;
		case 6:
			x4 = (x1 * x2) / (1 - (1 / Math.pow(1 + x2, 60)));
			x4 = Math.round(x4 * 10) / 10.0;
			System.out.println("The result is " + x4 + " dollars\nGoodbye!");
			break;
		default:
			System.out.println("Invalid choice, please re-run the program to try again\nGoodbye!");
			break;
		}
		inputScanner.close();

	}

}
