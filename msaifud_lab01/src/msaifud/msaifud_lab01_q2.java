package msaifud;
import java.util.Scanner;
public class msaifud_lab01_q2 {
	public static void main(String[] args) {
		System.out.println("****************** \nES1036B Lab 01 Q1 \nDate:\nName: Muhammad Saifuddin\n" 
				+ "Student number: 251024575\nProgram's mission: Compute the volume of a cone\n******************");
		double x1 = 0, x2 = 0, x3 = 0, x4 = 0; //The variable starting with 'x' represents the grade
		double r1 = 0, r2 = 0, r3 = 0, r4 = 0; //The variable starting with 'r' represents the weight of the grade
		double FinalGrade = 0; //Declaring the variable FinalGrade 
		Scanner inputScanner = new Scanner (System.in);//This is here so that the user will be able to type their input
		System.out.println("Input the first grade");
		x1 = inputScanner.nextDouble(); 
		System.out.println("Input the weight of the first grade");
		r1 = inputScanner.nextDouble(); 
		System.out.println("Input the second grade");
		x2 = inputScanner.nextDouble();
		System.out.println("Input the weight of the second grade");
		r2 = inputScanner.nextDouble();
		System.out.println("Input the third grade");
		x3 = inputScanner.nextDouble();
		System.out.println("Input the weight of the third grade");
		r3 = inputScanner.nextDouble();
		System.out.println("Input the fourth grade");
		x4 = inputScanner.nextDouble();
		System.out.println("Input the weight of the fourth grade");
		r4 = inputScanner.nextDouble();
		//All the statements above allow the user to input their values for certain variables
		FinalGrade = (x1*r1)+(x2*r2)+(x3*r3)+(x4*r4); //Equation to calculate the final grade
		System.out.println("The course grade is " + Double.toString(FinalGrade));
		//The last statement turns the code from double to string and displays it into the console
		inputScanner.close();
	}

}
