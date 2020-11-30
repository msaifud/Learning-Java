package msaifud_lab06;

import java.util.Scanner;

public class msaifud_lab06_q2 {

	public static int rollDice() {
		int randomIntvalue = 0;
		randomIntvalue = (int) ((Math.random() * 6) + 1);
		return randomIntvalue;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many dice would" + " you like to roll?");
		int rollNum = 0;
		int eachNumber[] = new int[6];
		double standardDev = 0.0, totalValue = 0.0;
		// the array below makes each number 0 from 1-6 get
		// an initial starting point to input values
		for (int i = 0; i < 6; i++) {
			eachNumber[i] = 0;
		}
		rollNum = input.nextInt();
		int result[] = new int[rollNum];
		// Above array makes the user's input the size of
		// the new array
		for (int i = 0; i < rollNum; i++) {
			result[i] = rollDice();
			// the above line of code finds a random value from
			// 1-6 and using the method rollDice()
			// and assigns it to the array result
			if (result[i] == 1) {
				eachNumber[0]++;
			} else if (result[i] == 2) {
				eachNumber[1]++;
			} else if (result[i] == 3) {
				eachNumber[2]++;

			} else if (result[i] == 4) {
				eachNumber[3]++;
			} else if (result[i] == 5) {
				eachNumber[4]++;
			} else if (result[i] == 6) {
				eachNumber[5]++;
			}
			// The above lines of code (the if/else if)
			// determine if the random value generated is either 1-6
			// then the value of the that particular number is
			// incremented from 0 to 1
			totalValue += result[i];
			
			

		}
		totalValue = totalValue/rollNum;
		
		standardDev = (((eachNumber[0]*(1-totalValue)*(1-totalValue))+(eachNumber[1]*(2-totalValue)*(2-totalValue))+ (eachNumber[2]*(3-totalValue)*(3-totalValue))+
				(eachNumber[3]*(4-totalValue)*(4-totalValue))+(eachNumber[4]*(5-totalValue)*(5-totalValue))+((eachNumber[5]*(6-totalValue)*(6-totalValue)))))/rollNum;
		standardDev = (int)Math.sqrt(standardDev);
		System.out.println("\nHere are the statistics:");
		System.out.println("1's: " + eachNumber[0]);
		System.out.println("2's: " + eachNumber[1]);
		System.out.println("3's: " + eachNumber[2]);
		System.out.println("4's: " + eachNumber[3]);
		System.out.println("5's: " + eachNumber[4]);
		System.out.println("6's: " + eachNumber[5]);
		System.out.println("Mean: " + (int) totalValue );
		System.out.println("StdDev: "+(int)standardDev);
		input.close();
	}

}
