package msaifud_lab03;

import java.util.Scanner;

public class msaifud_lab03_q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x1, x2, x3, x4; // Declared variables

		System.out.println("Please enter the first integer:");
		x1 = input.nextInt();
		while (((x1 < -1000) || (x1 > 1000)) || ((x1 % 17 == 0) || (x1 % 23 == 0))) {
			System.out.println("Incorrect input, please enter a value in" + " the range \nof -1000 to 1000 inclusive:");
			x1 = input.nextInt();

		}
		/*
		 * Above statements ask the user to input a value for the first variable then
		 * the system checks if its within range and if its divisible by 17 or 23, if
		 * the user fails to meet these parameters then the system will ask for a new
		 * input value, until the user satisfies the requirements. Once the user inputs
		 * a viable input the system will ask to input the next variable. The statements
		 * above are the same for the next variables, the variable input is the only
		 * thing that changes
		 */
		System.out.println("Please enter the second integer:");
		x2 = input.nextInt();
		while (((x2 < -1000) || (x2 > 1000)) || ((x2 % 17 == 0) || (x2 % 23 == 0))) {
			System.out.println("Incorrect input, please enter a value in" + " the range \nof -1000 to 1000 inclusive:");
			x2 = input.nextInt();
		}

		System.out.println("Please enter the third integer:");
		x3 = input.nextInt();
		while (((x3 < -1000) || (x3 > 1000)) || ((x3 % 17 == 0) || (x3 % 23 == 0))) {
			System.out.println("Incorrect input, please enter a value in" + " the range \nof -1000 to 1000 inclusive:");
			x3 = input.nextInt();
		}

		System.out.println("Please enter the fourth integer:");
		x4 = input.nextInt();
		while (((x4 < -1000) || (x4 > 1000)) || ((x4 % 17 == 0) || (x4 % 23 == 0))) {
			System.out.println("Incorrect input, please enter a value in" + " the range \nof -1000 to 1000 inclusive:");
			x4 = input.nextInt();

		}

		int maxNum = x1;
		if (maxNum < x2) {
			maxNum = x2;
		}
		if (maxNum < x3) {
			maxNum = x3;
		}
		if (maxNum < x4) {
			maxNum = x4;
		}
		// The above statement compares the four values and outputs the highest value

		System.out.println("The largest integer input is " + maxNum + ".");

		input.close();
	}

}
