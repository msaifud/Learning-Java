package msaifud_lab02;

import java.util.Scanner;

public class msaifud_lab02_q1 {
	public static void main(String[] args) {
		System.out.println("****************** \nES1036B Lab 02 Q1 \nDate:\nName: Muhammad\n"
				+ "Student number: 251024575\nProgram's mission: Will take the user input and two divisors \n"
				+ "and outputs if the input is divisible by any of the\n" + "input diviors\n******************");
		int x1 = 0, x2 = 0, x3 = 0; // Declaring variables
		Scanner inputScanner = new Scanner(System.in); // allows user to input values
		System.out.println("Please enter an integer value");
		x1 = inputScanner.nextInt();
		System.out.println("Please eneter the first divisor");
		x2 = inputScanner.nextInt();
		System.out.println("Please enter the second divisor");
		x3 = inputScanner.nextInt();
		// Above statements ask user to input values for x1, x2 and x3
		if ((x1 % x2 == 0) && (x1 % x3 == 0)) {
			System.out.println("The number is divisible by both divisors.\n" + "Goodbye!");
		} else if (x1 % x2 == 0) {
			System.out.println("The number is divisible by the first divisor only.\n" + "Goodbye!");
		} else if (x1 % x3 == 0) {
			System.out.println("The number is divisible by the second divisor only.\n" + "Goodbye!");
		} else {
			System.out.println("The number is not divisible by both divisors");
		}
		// Series of if/ else if statements to allow the code to decide which operation
		// to compute
		inputScanner.close();

	}

}
