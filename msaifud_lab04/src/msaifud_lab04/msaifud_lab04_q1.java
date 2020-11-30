package msaifud_lab04;

import java.util.Scanner;

public class msaifud_lab04_q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nfact = 1, n; // Declaring Variables 
		System.out.print("Input an integer number to calculate" + " its factorial:");
		n = input.nextInt(); // user input
		while (n <= 0) {
			System.out.print("Invalid Entry! Please enter a positive integer:");
			n = input.nextInt();
		} // Validates input
		for (nfact = 1; n > 0; n--) {
			nfact = nfact * n;
		}
		/* Takes the n value multiples it by 1 and then decrements it, resulting in this
		 * For instance n = 3
		 * then 3 x 1 x 2 x 1
		*/
		System.out.print("The resulting factorial is: " + nfact);
		input.close();
	}

}
