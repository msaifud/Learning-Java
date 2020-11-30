package msaifud;
import java.util.Scanner; 
public class msaifud_lab01_q3 {
	public static void main(String[] args) {
		System.out.println("****************** \nES1036B Lab 01 Q3 \nDate:\nName: Muhammad Saifuddin\n" 
				+ "Student number: 251024575\nProgram's mission: This program will break the current\n" 
				+ "year into subcomponents \n******************");
		int millenniums= 0 , centuries=0, decade=0;
		int currentyear=0; // Declaring variables 
		System.out.println("Please enter the current year:");
		Scanner inputScanner = new Scanner (System.in); // This statement allows user to input value
		currentyear = inputScanner.nextInt(); // Statement will ask user to input current year 
		millenniums= currentyear/ 1000; // Since the variable is int, therefore the decimal places are not taken
		currentyear= currentyear % 1000; // Using modulus gives us the remainder 
		centuries = currentyear/ 100;
		currentyear = currentyear % 100;
		decade = currentyear/10;
		currentyear= currentyear%10;
		System.out.println("The current year is composed of " + millenniums
				+ " millenniums, " + centuries + " centuries,\n"
				+decade + " decade (s), and " + currentyear + " single year(s)" );
		inputScanner.close(); 
		 
		
		
				

	}

}
