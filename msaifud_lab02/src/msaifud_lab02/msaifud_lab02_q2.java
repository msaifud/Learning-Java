package msaifud_lab02;

import java.util.Scanner;

public class msaifud_lab02_q2 {
	public static void main(String[] args) {
		double x1 = 0;// Declaring variables 
		int x2 = 0;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter a taxable income value:");
		x1 = inputScanner.nextInt(); // This asks use to input value for x1
		System.out.println("Please choose the most appropriate status:\n" + "1. Single \n"
				+ "2. Married Filing Jointly or Qualifying Widow(er)\n" + "3. Married Filing Separetely\n"
				+ "4. Head of Household\n" + "Enter a choice");
		x2 = inputScanner.nextInt(); // This asks user to input a value for x2
		/* The series of if/else if statements determine if the 
		 * user is under one of the previously asked ranges ( being either single, married
		 * filing jointly etc). Once the correct choice is found from x2 = 1-4, another block
		 * of if statements is started to check the range of the value to then apply tax rate
		 * and calculate their tax in dollars
		 */
		if (x2 == 1) {

			if ((x1 >= 0) && (x1 <= 8350)) {
				x1 = x1 * 0.1;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 8351) && (x1 <= 33950)) {
				x1 = x1 * 0.15;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 33951) && (x1 <= 82250)) {
				x1 = x1 * 0.25;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 82251) && (x1 <= 171550)) {
				x1 = x1 * 0.28;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 171551) && (x1 <= 372950)) {
				x1 = x1 * 0.33;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if (x1 <= 372951) {
				x1 = x1 * 0.35;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			}
		}

		if (x2 == 2) {

			if ((x1 >= 0) && (x1 <= 16700)) {
				x1 = x1 * 0.1;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 16701) && (x1 <= 67900)) {
				x1 = x1 * 0.15;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 67901) && (x1 <= 137050)) {
				x1 = x1 * 0.25;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 137051) && (x1 <= 208850)) {
				x1 = x1 * 0.28;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 208851) && (x1 <= 372950)) {
				x1 = x1 * 0.33;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if (x1 <= 372951) {
				x1 = x1 * 0.35;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			}
		}
		if (x2 == 3) {

			if ((x1 >= 0) && (x1 <= 8350)) {
				x1 = x1 * 0.1;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 8351) && (x1 <= 33950)) {
				x1 = x1 * 0.15;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 33951) && (x1 <= 68525)) {
				x1 = x1 * 0.25;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 68526) && (x1 <= 104425)) {
				x1 = x1 * 0.28;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 104426) && (x1 <= 186475)) {
				x1 = x1 * 0.33;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if (x1 <= 186476) {
				x1 = x1 * 0.35;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			}
		}

		if (x2 == 4) {

			if ((x1 >= 0) && (x1 <= 11950)) {
				x1 = x1 * 0.1;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 11951) && (x1 <= 45500)) {
				x1 = x1 * 0.15;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 45501) && (x1 <= 117450)) {
				x1 = x1 * 0.25;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 117451) && (x1 <= 190200)) {
				x1 = x1 * 0.28;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if ((x1 >= 190201) && (x1 <= 372950)) {
				x1 = x1 * 0.33;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			} else if (x1 <= 372951) {
				x1 = x1 * 0.35;
				System.out.println("Your tax is " + (int) x1 + " dollars.");
			}
		}

		inputScanner.close();
	}

}
