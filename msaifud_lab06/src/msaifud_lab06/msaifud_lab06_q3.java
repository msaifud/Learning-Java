
package msaifud_lab06;
import java.util.Scanner;
public class msaifud_lab06_q3 {

	public static void printHeader ( int labNum, int questionNum, String fName, String lName, String mission) {
		String lab1 = "lab " + labNum;
		String Question1 = "Question " + questionNum;
		String Studentname = "Name: " + fName + " " + lName;
		
		int [] length1 = {lab1.length(), Question1.length(), Studentname.length(), mission.length()};
		
		int maxlength = 0;
		for(int length : length1) {
			if (maxlength < length) {
				maxlength = length;
			}
		}
		
		 String headerborders = new String(new char[maxlength]).replace("\0" , "*");
		 
		 System.out.println(headerborders);
		 System.out.println(mission);
		 System.out.println(headerborders);
		 System.out.println(lab1);
		 System.out.println(Question1);
		 System.out.println(Studentname);
		 System.out.println(headerborders);
	}

public static void main(String[]args) {
printHeader(6 , 3, "Muhammad", "Saifuddin", "Simple card game using arrays");
Scanner input =new Scanner(System.in);
String cardvalues [] = new String[52];
String suits [] = {"H","C","D","S"};
int currentVal = 0, lastVal = 0;
char userInput;
String playagain = "";
	do {
	
	populateDeck(cardvalues, suits);
	
	String lastCard = drawCard(cardvalues);
	System.out.println("\nThe first card drawn was " + showCard(lastCard));

		
		String currentCard = drawCard(cardvalues);
	
		lastVal = (int) (lastCard.charAt(0));
		if (lastCard.charAt(1) != 'H' && lastCard.charAt(1) != 'C' && lastCard.charAt(1) != 'D'
				&& lastCard.charAt(1) != 'S') {
			lastVal = lastVal * 10 + ((int) (lastCard.charAt(1)));
		}
		currentVal = (int) (currentCard.charAt(0));
		if (currentCard.charAt(1) != 'H' && currentCard.charAt(1) != 'C' && currentCard.charAt(1) != 'D'
				&& currentCard.charAt(1) != 'S') {
			currentVal = currentVal * 10 + ((int) (currentCard.charAt(1)));
		}
		
		
		do {
			System.out.println("Will the next card be higher" + "?");
			userInput = input.next().charAt(0);
		} while (userInput != 'y' && userInput != 'n');

		
		switch (userInput) {
		case 'y':
			if (currentVal > lastVal) {
				System.out.println("The second card drawn was " + showCard(currentCard) + "\nYou were correct!");
				
			} 
			 else {
				System.out.println("The second card drawn was " + showCard(currentCard) + "." +"\nToo bad!");
			}
			break;
		case 'n':
			if (currentVal < lastVal) {
				System.out.println("The second card drawn was " + showCard(currentCard) + "\nYou were correct!");
			} 
			else {
				System.out.println("The second card drawn was " + showCard(currentCard) + "." +"\nToo bad!");
			}
			break;
		}
		System.out.println("\nWould you like to play again? (y/n)");
		playagain = input.next();
		}while(playagain.equalsIgnoreCase("y"));
	System.out.println("\nGood bye!");
	input.close();
}

public static void populateDeck(String[] deck, String[] suits) {

for (int j = 0; j < 13; j++) {
	deck[j] = ((j + 1) + suits[0]);
}

for (int k = 13; k < 26; k++) {
	deck[k] = ((k - 12) + suits[1]);
}

for (int l = 26; l < 39; l++) {
	deck[l] = ((l - 25) + suits[2]);
}

for (int m = 39; m < 52; m++) {
	deck[m] = ((m - 38) + suits[3]);
}

}


public static String showCard(String cardValue) {

if (cardValue.charAt(0) == '1' && (cardValue.charAt(1) == 'H' || cardValue.charAt(1) == 'C'
		|| cardValue.charAt(1) == 'D' || cardValue.charAt(1) == 'S')) {
	
	if (cardValue.charAt(1) == 'H') {
		cardValue = "AH";
	} else if (cardValue.charAt(1) == 'C') {
		cardValue = "AC";
	} else if (cardValue.charAt(1) == 'D') {
		cardValue = "AD";
	} else if (cardValue.charAt(1) == 'S') {
		cardValue = "AS";
	}
} else if (cardValue.charAt(1) == '1') { 

	if (cardValue.charAt(2) == 'H') {
		cardValue = "JH";
	} else if (cardValue.charAt(2) == 'C') {
		cardValue = "JC";
	} else if (cardValue.charAt(2) == 'D') {
		cardValue = "JD";
	} else if (cardValue.charAt(2) == 'S') {
		cardValue = "JS";
	}
} else if (cardValue.charAt(1) == '2') { 
	
	if (cardValue.charAt(2) == 'H') {
		cardValue = "QH";
	} else if (cardValue.charAt(2) == 'C') {
		cardValue = "QC";
	} else if (cardValue.charAt(2) == 'D') {
		cardValue = "QD";
	} else if (cardValue.charAt(2) == 'S') {
		cardValue = "QS";
	}
} else if (cardValue.charAt(1) == '3') { 
	
	if (cardValue.charAt(2) == 'H') {
		cardValue = "KH";
	} else if (cardValue.charAt(2) == 'C') {
		cardValue = "KC";
	} else if (cardValue.charAt(2) == 'D') {
		cardValue = "KD";
	} else if (cardValue.charAt(2) == 'S') {
		cardValue = "KS";
	}
}
return cardValue;
}


public static String drawCard(String[] deck) {

boolean validCard = false;
int cardAddress = 0;
String returnCard = "";


while (!validCard) {
	
	cardAddress = (int) (Math.random() * 52);
	
	if (deck[cardAddress] != "**") {
		
		validCard = true;
		
		returnCard = deck[cardAddress];
		deck[cardAddress] = "**";
	}
}
return returnCard;
}
}
		

	


