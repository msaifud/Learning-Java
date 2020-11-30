package msaifud_lab03;

import java.util.Scanner;

public class msaifud_lab03_q3 {
	public static void main(String[] args) {
		int loopnum, counter = 0, x1 = 1, mean = 0;
		int max = 0, min = 0, num = 0, even = 0, odd = 0; // Declaring variables
		Scanner input = new Scanner(System.in);
		System.out.println("----------------------\nStudent Name: Muhammad\nLab #3\n"
				+ "Date:\nQuestion #3\n----------------------");
		System.out.print("Enter an integer number for the " + "number of loop iterations:");
		loopnum = input.nextInt();
		while (1 > loopnum) {
			System.out.println("Please enter an integer that is greater than 0");
			loopnum = input.nextInt();
		}
		// Above statements ask user for the number of iterations it should run through
		for (counter = 0; counter < loopnum; counter++) { // Loop continues until the loopnum is reached
			System.out.print("Enter integer" + x1 + ":");
			num = input.nextInt();
			mean = mean + num;
			if (x1 == 1) {
				max = num;
				min = num;
			}

			if (num > max)
				max = num;

			if (num < min)
				min = num;

			if (num % 2 == 0)
				even++;
			else
				odd++;
			// Above statements finds the max, min and mean of the integer number.
			System.out.println("The mean of " + x1 + " input(s) is: " + (double) mean / x1);
			System.out.println("Max value: " + max);
			System.out.println("Min value: " + min);
			System.out.println("Even count: " + even);
			System.out.println("Odd count: " + odd);
			x1++;
		}

		input.close();
	}

}
