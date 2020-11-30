
package msaifud_lab04;

import java.util.Scanner;

public class test2 {
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
	
	public static int fetchDifficultySet(Scanner input) {
		int difficulty = 0;
		System.out.println("Please choose a difficulty level: \n1) Easy: Integers ranging 0 to 10\n"
				+ "2) Medium: Integers ranging 0 to 100\n3) Hard: Integers ranging -100 to 100");
		System.out.println("Please input a choice (1-3):");
		difficulty = input.nextInt();
		while ((difficulty < 1) || (difficulty > 3)) {
			System.out.println("Invalid difficulty choice!\nPlease input a choice (1-3):");
			difficulty = input.nextInt();
		}
		return difficulty;
	}
	
	public static int fetchDifficulty() {
		Scanner input = new Scanner (System.in);
		int problemType = 0;
		System.out.println("Please select the type(s) of problems:\n1. Addition\n2. Subtraction\n3. Multiplication\n"
				+ "4. Random\n5. Change difficulty\n6. Exit");
		problemType = input.nextInt();
		while ((problemType < 1) || (problemType > 6)) {
			System.out.println("Invalid problem type!\nPlease input a choice (1-6):");
			problemType = input.nextInt();
		}
		return problemType;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int difficulty = 0, problemType = 0, correctAns = 0;
		boolean gameLoop = true;
		long avgTime = 0;

		printHeader(5 , 1 , "Muhammad", "Saifuddin", "Practicing simple "
				+ "math problems") ;
		difficulty = fetchDifficultySet(input);
		
		while (gameLoop) {
			switch (fetchDifficulty()) {
			case 1:
				for (int i = 1; i <= 10; i++) {
					int firstInt = random(difficulty);
					int secondInt = random(difficulty);
					int guess = 0;
					System.out.println("Question " + i + "\nWhat is the result of: " + firstInt + " + " + secondInt);
					long timeStart = System.currentTimeMillis();
					guess = input.nextInt();
					long timeEnd = System.currentTimeMillis();
					avgTime = avgTime + (timeEnd - timeStart);
					if (guess == (firstInt + secondInt)) {
						System.out.println("Correct!");
						correctAns++;
					} else {
						System.out.println("Incorrect! The correct answer was " + (firstInt + secondInt));
					}
				}
				System.out
						.println("You scored " + correctAns + "/10 questions correct and the average question time was "
								+ (avgTime / 10000.0) + " seconds.");
				System.out.println();
				problemType = 7;
				break;
			case 2:
				for (int i = 1; i <= 10; i++) {
					int firstInt = random(difficulty);
					int secondInt = random(difficulty);
					int guess = 0;
					System.out.println("Question " + i + "\nWhat is the result of: " + firstInt + " - " + secondInt);
					long timeStart = System.currentTimeMillis();
					guess = input.nextInt();
					long timeEnd = System.currentTimeMillis();
					avgTime = avgTime + (timeEnd - timeStart);
					if (guess == (firstInt - secondInt)) {
						System.out.println("Correct!");
						correctAns++;
					} else {
						System.out.println("Incorrect! The correct answer was " + (firstInt - secondInt));
					}
				}
				System.out
						.println("You scored " + correctAns + "/10 questions correct and the average question time was "
								+ (avgTime / 10000.0) + " seconds.");
				System.out.println();
				problemType = 7;
				break;
			case 3:
				for (int i = 1; i <= 10; i++) {
					int firstInt = random(difficulty);
					int secondInt = random(difficulty);
					int guess = 0;
					System.out.println("Question " + i + "\nWhat is the result of: " + firstInt + " * " + secondInt);
					long timeStart = System.currentTimeMillis();
					guess = input.nextInt();
					long timeEnd = System.currentTimeMillis();
					avgTime = avgTime + (timeEnd - timeStart);
					if (guess == (firstInt * secondInt)) {
						System.out.println("Correct!");
						correctAns++;
					} else {
						System.out.println("Incorrect! The correct answer was " + (firstInt * secondInt));
					}
				}
				System.out
						.println("You scored " + correctAns + "/10 questions correct and the average question time was "
								+ (avgTime / 10000.0) + " seconds.");
				System.out.println();
				problemType = 7;
				break;
			case 4:
				for (int i = 1; i <= 10; i++) {
					int firstInt = random(difficulty);
					int secondInt = random(difficulty);
					int guess = 0;
					int type = (int) (Math.random() * 3);
					if (type == 0) {
						System.out
								.println("Question " + i + "\nWhat is the result of: " + firstInt + " + " + secondInt);
						long timeStart = System.currentTimeMillis();
						guess = input.nextInt();
						long timeEnd = System.currentTimeMillis();
						avgTime = avgTime + (timeEnd - timeStart);
						if (guess == (firstInt + secondInt)) {
							System.out.println("Correct!");
							correctAns++;
						} else {
							System.out.println("Incorrect! The correct answer was " + (firstInt + secondInt));
						}
					}
					if (type == 1) {
						System.out
								.println("Question " + i + "\nWhat is the result of: " + firstInt + " - " + secondInt);
						long timeStart = System.currentTimeMillis();
						guess = input.nextInt();
						long timeEnd = System.currentTimeMillis();
						avgTime = avgTime + (timeEnd - timeStart);
						if (guess == (firstInt - secondInt)) {
							System.out.println("Correct!");
							correctAns++;
						} else {
							System.out.println("Incorrect! The correct answer was " + (firstInt - secondInt));
						}
					}
					if (type == 2) {
						System.out
								.println("Question " + i + "\nWhat is the result of: " + firstInt + " * " + secondInt);
						long timeStart = System.currentTimeMillis();
						guess = input.nextInt();
						long timeEnd = System.currentTimeMillis();
						avgTime = avgTime + (timeEnd - timeStart);
						if (guess == (firstInt * secondInt)) {
							System.out.println("Correct!");
							correctAns++;
						} else {
							System.out.println("Incorrect! The correct answer was " + (firstInt * secondInt));
						}
					}
				}
				System.out
						.println("You scored " + correctAns + "/10 questions correct and the average question time was "
								+ (avgTime / 10000.0) + " seconds.");
				System.out.println();
				problemType = 7;
				break;
			case 5:
				difficulty = fetchDifficultySet(input);
				problemType = 7;
				break;
			case 6:
				System.out.println("Good Bye!");
				gameLoop = false;
				break;
			case 7:
				System.out.println(
						"Please select the type(s) of problems:\n1. Addition\n2. Subtraction\n3. Multiplication\n"
								+ "4. Random\n5. Change difficulty\n6. Exit");
				problemType = input.nextInt();
				while ((problemType < 1) || (problemType > 6)) {
					System.out.println("Invalid problem type!\nPlease input a choice (1-6):");
					problemType = input.nextInt();
				}
				correctAns = 0;
				avgTime = 0;
				break;
			}
		}
		input.close();
	}
	public static int random(int difficulty) {
		int outputNum = 0;
		if (difficulty == 1) {
			outputNum = (int) (Math.random() * 11);
		} else if (difficulty == 2) {
			outputNum = (int) (Math.random() * 101);
		} else {
			outputNum = (int) ((Math.random() * 201) - 100);
		}
		return outputNum;
	}

}
