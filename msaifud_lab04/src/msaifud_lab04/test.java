package msaifud_lab04;
import java.util.Scanner;
public class test {
	
		
			
	
	
		public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		int x;
		System.out.println("Enter 10 numbers: ");
		int myArray [ ] = new int [ 10 ] ;
		for (int i=1; i<=10;i++){
		    System.out.print("Enter integer "+i+":");
		x = input.nextInt();
		myArray [ i-1 ] = x;
		}
		int newArray [ ] = new int [10];
		myArray[0]=newArray[9];
		myArray[1]=newArray[8];
		myArray[2]=newArray[7];
		myArray[3]=newArray[6];
		myArray[4]=newArray[5];
		myArray[5]=newArray[4];
		myArray[6]=newArray[3];
		myArray[7]=newArray[2];
		myArray[8]=newArray[1];
		myArray[9]=newArray[0];

		System.out.println(newArray[8]);
		}

	        
	    }
	
	

