package msaifud_lab05;

import java.util.Scanner;

public class msaifud_lab05_q1 {

	public static void printHeader(int labNum, int questionNum, String fName, String lName, String mission) {
		String lab1 = "lab " + labNum;
		String Question1 = "Question " + questionNum;
		String Studentname = "Name: " + fName + " " + lName;

		int[] length1 = { lab1.length(), Question1.length(), Studentname.length(), mission.length() };

		int maxlength = 0;
		for (int length : length1) {
			if (maxlength < length) {
				maxlength = length;
			}
		}

		String headerborders = new String(new char[maxlength]).replace("\0", "*");

		System.out.println(headerborders);
		System.out.println(mission);
		System.out.println(headerborders);
		System.out.println(lab1);
		System.out.println(Question1);
		System.out.println(Studentname);
		System.out.println(headerborders);
	}

	// Above method prints the header
	public static int getPositiveInteger() {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("Input an integer number to calcualte its factorial: ");
		x = input.nextInt();
		while (x < 0) {
			System.out.print("Invalid Entry! Please enter a positive interger: ");
			x = input.nextInt();
		}
		input.close();
		return x;

	} // Above method, gets the integer from the user and identifies if it's within
		// the parameters

	public static double computeFactorial(int value) {
		int nfact = 1;
		for (nfact = 1; value > 0; value--) {
			nfact = nfact * value;
		}
		return nfact;
	}// Above method takes the integer value from the previous method and computes
		// the factorial

	public static void main(String[] args) {
		printHeader(5, 1, "Muhammad", "Saifuddin", "Computing a " + "Factorial using methods");
		System.out.print("The resulting factorial is: " + computeFactorial(getPositiveInteger()));
// The above print statement has a method within a method, this is so that the value re
// retrived from the the frist method directly goes to the next method
	}

}
