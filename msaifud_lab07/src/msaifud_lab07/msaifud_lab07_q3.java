
package msaifud_lab07;
import java.util.Scanner;
public class msaifud_lab07_q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;//employee number
		System.out.println("Please enter the number of employees in the database:");
		x = input.nextInt();
		Employee [] database = new Employee[x];
		enterData(database);
		printReport(database);
	}
	
	public static void enterData ( Employee [] database ) {
		String firstName,lastName;
		int ID,salary;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < database.length; i++) {
			System.out.println("\nEmployee " + (i+1));
			System.out.println("Please enter the first name:");
			firstName = input.next();
			System.out.println("Please enter the last name:");
			lastName = input.next();
			System.out.println("Please enter the ID:");
			ID = input.nextInt();
			
			while (true) {
			System.out.println("Please enter the salary:");
			salary = input.nextInt();
			
			if (salary > 0)
				break;
			
			System.out.println("The salary should be greater than 0");
			}
			database[i] = new Employee (firstName,lastName,ID,salary);
		}
	}
	public static void printReport ( Employee [] database ) {
		System.out.println("Report for all employees:");
		 for (Employee employee : database) {
	            employee.printInfo();
	        }
		 
	}
	
	public static class Employee {
		String m_firstName;
		String m_lastName;
		int m_ID;
		int m_salary;
		
		public Employee(String firstName, String lastName, int ID, int salary) {
			m_firstName = firstName;
			m_lastName = lastName;
			m_ID = ID;
			m_salary = salary;
		}
		
		private void printInfo() {
            System.out.println( m_firstName + " " + m_lastName + ", " + "ID: " + m_ID + ", " + "Salary: " + m_salary);
  
	}
}
}
