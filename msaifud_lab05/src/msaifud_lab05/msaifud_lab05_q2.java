
package msaifud_lab05;

import java.util.Scanner;

public class msaifud_lab05_q2 {
	public static double computePower(double base, double power) {

		if (power >= 1) {
			double x = base, y = 1;

			for (int i = 1; i < power; i++) {
				if (i == 1)
					y = base * 1;

				base = y * x;
				y = base;

			}

		} else if (power <= -1) {
			double x = base, y = 1;

			for (int i = 0; i > power; i--) {

				base = (y / x);
				y = base;

			}
		} else {
			base = 1;

		}
		return base;
	}

// The above method, checks where the power number lies, for instance, it checks if the 
	// number is positive, negative or zero and then computes according
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double u, k;
		System.out.print("Please enter a real number base: ");
		u = input.nextDouble();
		System.out.print("Please enter an integer exponent: ");
		k = input.nextDouble();
		System.out.print(computePower(u, k));
		// The above print statement, calls the method "computePower" and uses the
		// values u and k
		// that were input but the user
		input.close();
	}

}
