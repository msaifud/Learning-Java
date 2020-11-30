package msaifud_lab03;

import java.util.Scanner;

public class msaifud_lab03_q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1, x2; // Declaring variables that are going to be input by the super
		int x3 = 1; /*
					 * This variable has one as an initial value for the certain actions to be
					 * completed further in the code
					 */

		System.out.println("Please enter an integer between 1 and" + " 9999 inclusive:");
		x1 = input.nextInt();
		while ((x1 < 1) || (x1 > 9999)) {
			System.out.println("Invalid input, please enter an integer" + " between 1 and 9999 inclusive:");
			x1 = input.nextInt();
		}
		/*
		 * Above statement checks that the value input by the user is within range if
		 * not an invalid output will occur which will prompt the user to enter a new
		 * value
		 */

		System.out.println("Plese input and additional divisor between" + " 1 and 150 inclusive:");
		x2 = input.nextInt();
		while ((x2 < 1) || (x2 > 150)) {
			System.out.println("Invalid input, please enter an integer" + " between 1 and 150 inclusive:");
			x2 = input.nextInt();
		}
		/*
		 * This statement above does a similar operation to the previous statements, it
		 * is just checking the range of the variable
		 */

		System.out.print("The palindrones are:\n");
		while (x3 <= x1) { /*
							 * This allows the program to run through all the number up until the initial
							 * number that was input by the user essentially running through all the numbers
							 * from 1 -x1(user input))
							 */

			if (x3 % x2 == 0) { /*
								 * This statement checks if the number is divisible but the divisor if it is
								 * then the system does further checks
								 * 
								 */
				String testCase = Integer.toString(x3);
				int low = 0;
				int high = testCase.length() - 1;
				boolean isPalindrome = true;
				while ((low < high)) {
					if (testCase.charAt(low) != testCase.charAt(high)) {
						isPalindrome = false;
						break;
					}
					low++;
					high--;
				}
				// Above statements checks if the number is a palindrome
				if (isPalindrome) {
					System.out.print(testCase + " ");
				}
			}
			x3++;
		}
		input.close();
	}

}
