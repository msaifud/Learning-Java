package msaifud;
public class msaifud_lab00_q2 {
	
	public static void main (String[] args) {
		// Assign values to different variables  
		double x1 = 1, y1 = 2, x2 = 4, y2 = 7,
				side1 = 0, side2 = 0, distance = 0;// In the previous statement, the variables are declared as double and each variable is assigned an initial value  
		
		side1 = x2 - x1;// This states that side1 is equal to the difference of x2 - x1
		side2 = y2 - y1;// This states that side2 is equal to the difference of y2 - y1
		// This will then compute a value
		distance = Math.sqrt(side1*side1 + Math.pow(side2, 2.0));
		// This will output a result to the console 
		System.out.println("The distance between points( " +
				Double.toString(x1) + "," + Double.toString(y1) +
				") and (" + Double.toString(x2) + "," +
				Double.toString(y2) + ") is " +
				Double.toString(distance));
		/* COnvert the value of the variables from double back into string
		 * Then to use it and state the calculated distance between the two coordinates
		 */
	}
}
