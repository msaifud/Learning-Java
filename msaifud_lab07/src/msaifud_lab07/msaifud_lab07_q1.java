
package msaifud_lab07;
import java.util.Scanner;
public class msaifud_lab07_q1 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int loopnum;
	System.out.println("Welcome! How many strings would you like to sort?");
	loopnum = input.nextInt();
	String myArray [] = new String [loopnum];
	for (int i = 1; i<=loopnum; i++) {
		System.out.println("Please enter string " +i + ":");
		myArray[i-1]=input.next();
	}
		sortLength(myArray);
		System.out.println("Your sorted array is:");
		for (int i = 0; i<myArray.length;i++) {
			System.out.print("\n"+myArray[i]);
		}
		System.out.print("\n\nGoodbye!");
	}
	public static void sortLength(String [] args) {
		for(int i = args.length-1; i>0; i--){
			for(int j = 0; j<i; j++){
			if(args[j].length()>args[j+1].length()){
			//swapping the array elements
			String temp = args[j+1];
			args[j+1] = args[j];
			args[j] = temp;
			}
			}	
	}

}
}