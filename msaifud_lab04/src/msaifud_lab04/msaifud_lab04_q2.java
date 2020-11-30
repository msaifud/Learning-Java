package msaifud_lab04;
import java.util.Scanner;
public class msaifud_lab04_q2 {

	public static void main(String[] args) {
		
			//initialize variables
			int size;
			Scanner input = new Scanner (System.in);
			System.out.println("Please enter a size:");
		    size =input.nextInt();
		    int x;
		    boolean d = true;
		    //Do-while loop to repeat the program automatically
		    do { 
		    System.out.println("Please enter the number of iterations (enter 0 to exit):");
		    x = input.nextInt();
		    	
		    for(int m = 1; m <= size ;m++){
		    	
		    	
		    	for(int j = size; j > m; j--) { // adding spacing for parallelogram
		    		System.out.print(" ");
		    	}
		    	for(int b = 1; b <= x; b++) { // print iterations beside each other
		    		System.out.print("   ");
		        for(int c = 1; c <= size; c++){
		        	// Lines 28-42 display the parallelogram to the console
		        	if( (m==1) ||     //top row
		        		(m==size) ||  //bottom row
		        		(c==1) ||     //left column
		        		(c==size)) {  //right column
		        		   System.out.print("# "); 
		        		} 
		        	
		        			else {
		        		        System.out.print("  ");
		        		}
		        }
		        }
		        System.out.println("\n");
		       
		}   // If 0 is entered exit the program
		    if (x == 0)
			break;
		    } while (d == true);
		    System.out.print("Goodbye!");
		    input.close();

	}

}

