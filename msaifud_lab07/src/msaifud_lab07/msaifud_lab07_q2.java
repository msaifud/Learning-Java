package msaifud_lab07;
import java.util.Scanner;
public class msaifud_lab07_q2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double [][] a = new double [3][3];
		double [][] b = new double [3][3];
		double [][] result = new double [3][3];
		System.out.println("Welcome! Please populate the first 3x3 matrix:");
populateMatrix(a);
printMatrix(a);
System.out.println("Please populate the second 3x3 matrix:");
populateMatrix(b);
printMatrix (b);


	while (true) {
System.out.println("******************************\n"
		+ "** Please choose an option: **\n"
		+ "******************************\n"
		+ "a. Add\nb. Subtract\nc. Multiply\nd. Exit");
String choice = input.next();

switch (choice) {
case "a":
	addMatrices(a,b,result);
	printMatrix(result);
	break;
	
case "b":
	subtractMatrices(a,b,result);
	printMatrix(result);
	break;
	
case "c":
	multiplyMatrices(a,b,result);
	printMatrix(result);
	break;
	
default:
	System.out.println("Goodbye!");
	return;

}
}
}
	
	public static void populateMatrix (double [][] a) {
		Scanner input = new Scanner (System.in);
	double num = 0;
	for (int i = 0; i<3;i++) {
		for (int j = 0; j<3;j++) {
			System.out.print("Enter a real number for the element "+ "("
					+ (i+1)+ ","+ (j+1)+")"+": ");
			num = input.nextDouble();
			a [i][j]=num;
				
		}
	}
	}
	public static void printMatrix (double [][]a) {
		for (int i = 0; i<3; i++) {
			for (int j =0; j<3; j++) {
				System.out.print(a[i][j] + "    ");
			}
			System.out.println();
			
		}
	
		
	}
	public static void addMatrices (double [][]a, double [][]b, double [][] result) {
		for (int i = 0; i<3; i++) {
			for (int j =0; j<3; j++) {
				result[i][j]= (a[i][j])+(b[i][j]);
				
			}
			
		}
	}
	
	public static void subtractMatrices(double [][] a, double [][]b, double [][] result) {
	for (int i = 0; i<3; i++) {
		for (int j =0; j<3; j++) {
			result[i][j]= (a[i][j])-(b[i][j]);
			
		}
		
	}
	}
	public static void multiplyMatrices(double [][] a, double [][]b, double [][] result) {
		for (int i = 0; i<3; i++) {
			for (int j =0; j<3; j++) {
				for (int k = 0; k<3; k++) {
					result [i][j]= (a[i][j])*(b[i][j]);
				}
				
			}
			
		}
	}

}
