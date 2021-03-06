import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz_Main {
	
	public static final Scanner input = new Scanner(System.in);
	public static InitializeEduQuizes eduQuizes = new InitializeEduQuizes();
	public static InitializeFunQuizes funQuizes = new InitializeFunQuizes();
	public static int userScore = 0;
	public static int lastModule = 0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to House Mormont's Quiz Bank!");
		System.out.println("Take a look at the options and choose whichever!");
		menu();
	}
	
	public static void menu() {
		
		String userInput = "";

		System.out.println("");
		System.out.println("Options \t\t\t Input");
		System.out.println("=====================================");
		System.out.println("Education Quizes \t\t   1");
		System.out.println("Fun Quizes \t\t\t   2");
		System.out.println("Results \t\t\t   3");
		System.out.println("Show Answer \t\t\t   4");
		System.out.println("=====================================");
		System.out.println("Input \"-1\" to EXIT.\n");
		System.out.print("Input: ");
		userInput = input.next();
		System.out.println("\n");
		
		switch(userInput) {
			case "-1":
				System.out.println("Goodbye! See you again!");
				break;
			case "1":
				eduMenu();
				break;
			case "2":
				funMenu();
				break;
			case "3": 
				showResults();
				break;
			case "4":
				answerMenu();
				break;
			default:
				System.out.println("Invalid Input!");
				System.out.println("Please re-enter!");
				menu();
		}
		
	}
	
	
	public static void eduMenu() {
		
		String userInput = "";
		int changedInput = 0;
		
		System.out.println("Which educational quiz would you like to attempt?");
		System.out.println("============================================");
		System.out.println("Input \t\t\t Options");
		System.out.println("============================================");
		for (int n = 0; n < eduQuizes.getModu().length; n+=1) {
			System.out.println("  " +(n + 1) + " \t\t\t "
					+eduQuizes.getModu(n).getModuleName());
		}
		System.out.println("============================================");
		System.out.println("Input \"-1\" to return to MENU.\n");
		
		do {
			System.out.print("Input: ");
			userInput = input.next();
			
			// To prevent error if userInput char/string
			if (!userInput.matches("[a-zA-Z]+")) {
				changedInput = Integer.parseInt(userInput);
			}
			else {
				changedInput = -100;
			}// end of if else statement
			
			// Check if user input is legit
			if (changedInput == -1) { 
				System.out.println("Going back to menu...");
				menu(); // Back to menu if user enter sentinel value -1
			}
			// Check if user inputed number is within quizzes range
			else if (changedInput >= 1 && changedInput <= eduQuizes.getModu().length) {
				lastModule = changedInput - 1;
				printEduQuestions(eduQuizes.getModu(lastModule));
			}
			else {
				userInput = "Invalid";
				System.out.println("Your input is invalid, please try again.");
			}// end of if else statement
					
		} while(userInput == "Invalid"); // end of do while loop 

	}
	
	public static void funMenu() {
		
		String userInput = "";
		int changedInput = 0;
		
		System.out.println("Which fun quiz would you like to attempt?");
		System.out.println("============================================");
		System.out.println("Input \t\t\t Options");
		System.out.println("============================================");
		for (int n = 0; n < funQuizes.getModu().length; n+=1) {
			System.out.println(" "+(n + 1) +" \t\t  " 
					+funQuizes.getModu(n).getModuleName());
		}
		System.out.println("============================================");
		System.out.println("Input \"-1\" to return to MENU.\n");
		
		do {
			
			System.out.print("Input: ");
			userInput = input.next();
			
			// To prevent error if userInput char/string
			if (!userInput.matches("[a-zA-Z]+")) {
				changedInput = Integer.parseInt(userInput);
			}
			else {
				changedInput = -100;
			} // end of if else statement
			
			// Check if user input is legit
			if (userInput == "-1") {
				System.out.println("Going back to menu...");
				menu();  // Back to menu if user enter sentinel value -1
			}
			// Check if user inputed number is within quizzes range
			else if (changedInput > 0 && changedInput <= funQuizes.getModu().length) {
				lastModule = changedInput - 1;
				printFunQuestions(funQuizes.getModu(lastModule));
			}
			else {
				userInput = "Invalid";
				System.out.println("Your input is invalid, please try again.");
			} // end of if else statement
					
		} while(userInput == "Invalid"); // end of do while loop
		
	}
	
	public static void printEduQuestions(Modules modu) {
		
		int count = 0;
		int i = 0;
		boolean legitInput = false;
		String userInput;
		char[] changedInput = new char[40];
		char[] temp = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		
		System.out.println(modu.getModuleName());
		
		do {
			// Return all values to their default state
			legitInput = false; 
			i = 0;
			
			System.out.println("");
			System.out.println((count+1) + ". "  + ((QuizEduQuestions)modu).questionArray[count].getQuestionName());
			
			// Loop through the individual questions options array
			for (int n = 0; n < ((QuizEduQuestions)modu).questionArray[count].getQuestionOption().length; n+=1) {
				System.out.println(temp[n] + ". " + ((QuizEduQuestions)modu).questionArray[count].getQuestionOption(n));
			}
			
			// Ask for user input and take only the first character, and turn it to upper case
			System.out.print("\nYour Answer: ");
			userInput = input.next();
			userInput = userInput.toUpperCase(); // convert user input to upper case
			
			while(!legitInput){
				// Go through the array of valid inputs
				while(i < ((QuizEduQuestions)modu).questionArray[count].getQuestionOption().length){
					if(userInput.charAt(0) == temp[i]){
						legitInput = true;
						break; // break while loop
					}// end of if statement
					i+=1; 
				} // end of while loop
				
				// If input is not legit, prompt user the answer again
				if(!legitInput){
					System.out.println("Invalid input! Try again.");
					System.out.print("\nYour Answer: ");
					userInput = input.next();
					userInput = userInput.toUpperCase();
					i = 0; // resetting variable
				} // end of if statement
				
			} // end of while loop
			
			changedInput[count] = userInput.charAt(0); // store the 1st char of input in an array
			count +=1;
			
		} while (count < ((QuizEduQuestions)modu).questionArray.length); // end of do while loop
		
		checkEduResults(changedInput, modu);
	}
	
	public static void printFunQuestions(Modules modu) {
		
		int count = 0;
		int i = 0;
		boolean legitInput = false;
		String userInput;
		char[] changedInput = new char[((QuizFunQuestions)modu).getQuestionArray().length];
		char[] temp = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		
		System.out.println(modu.getModuleName());
		
		do {
			
			System.out.println("");
			System.out.println((count + 1) + ". " + ((QuizFunQuestions)modu).questionArray[count].getQuestionName());
			
			// Loop through the individual questions options array
			for (int n = 0; n < ((QuizFunQuestions)modu).questionArray[count].getQuestionOption().length; n+=1) {
				System.out.println(temp[n] + ". " + ((QuizFunQuestions)modu).questionArray[count].getQuestionOption(n));
			}
			
			// Ask for user input and take only the first character, and turn it to upper case
			System.out.print("\nYour Answer: ");
			userInput = input.next();
			userInput = userInput.toUpperCase();
			
			while(!legitInput){
				
				// Go through the array of valid inputs
				while(i < ((QuizFunQuestions)modu).questionArray[count].getQuestionOption().length){
					if(userInput.charAt(0) == temp[i]){
						legitInput = true;
						break; // break while loop
					}// end of if statement
					i+=1; 
				} // end of while loop
				
				// If input is not legit, prompt user the answer again
				if(!legitInput){
					System.out.println("Invalid input! Try again.");
					System.out.print("\nYour Answer: ");
					userInput = input.next();
					userInput = userInput.toUpperCase();
					i = 0; // resetting variable
				} // end of if statement
				
			} // end of while loop
			
			changedInput[count] = userInput.charAt(0); // store the 1st char of input in an array
			count +=1;
			
		} while (count < ((QuizFunQuestions)modu).questionArray.length);
		
		checkFunResults(changedInput, modu);
	}
	
	public static void checkEduResults(char[] results, Modules modu) {
		
		// To make percentage look nice and clean
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		
		int score = 0;
		double percentageScore = 0.0;
		String scoreString;
		Result result = new Result();
		
		// Check if answer is correct and raise the score by 1 if true
		for (int i = 0; i < ((QuizEduQuestions)modu).questionArray.length; i+=1) {
			if (results[i] == ((QuizEduQuestions)modu).questionArray[i].getAnswer().charAt(0)) {
				score +=1;
			}
		}
		
		// Format the percentage score and turn it into string
		percentageScore = ((double)(score) / ((QuizEduQuestions)modu).getMaxScore()) * 100;
		scoreString = df.format(percentageScore);
		
		// Save the result in education quizes
		result.setPercentageCorrect(scoreString);
		eduQuizes.getModu(lastModule).getResult().add(result);
		
		System.out.println("\nResults: " + score + " / " + ((QuizEduQuestions)modu).getMaxScore());
		System.out.println("You got " + scoreString + "% of all questions correct!");
		System.out.println("\n\nReturning to main menu...");
		menu();
		
	}
	
	public static void checkFunResults(char[] results, Modules modu) {
		
		int max = 0, maxchar = 0;
		int convertedNumbers[] = new int[results.length];
		int[] charactersPoint = ((QuizFunQuestions)modu).getCharacterPoint();
		Result result = new Result();
		
		// Get individual character keys to appraise
		for (int i = 0; i < results.length; i+=1) {
			char ch = results[i];
			int pos = (int)ch;
			pos -= 65;
			convertedNumbers[i] = ((QuizFunQuestions)modu).questionArray[i].getQuestionKey(pos);
		}
		
		// Increase character keys according to user inputs
		for (int i = 0; i < convertedNumbers.length; i+=1) {
			int n = convertedNumbers[i];
			charactersPoint[n] +=1;
		}
		
		// Check which character key has the highest value and assign it to max
		for (int i = 0; i < charactersPoint.length; i+=1) {
			if (charactersPoint[i] > max) {
				max = charactersPoint[i];
				maxchar = i;
			}
		}
		
		// Save the result in fun quizes
		result.setGivenCharacter(((QuizFunQuestions)modu).getCharacters(maxchar));
		result.setGivenCharacterDesc(((QuizFunQuestions)modu).getCharacterDesc(maxchar));
		funQuizes.getModu(lastModule).getResult().add(result);
		
		System.out.println("\nResult: " + ((QuizFunQuestions)modu).getCharacters(maxchar));
		System.out.println("Description: " + ((QuizFunQuestions)modu).getCharacterDesc(maxchar));
		System.out.println("\n\nReturning to main menu...");
		
		menu();
	}
	
	public static void showResults() {
		
		String temp = "";
		
		// Print out all eduQuizes results
		System.out.println("Educational Quizzes\n");
		for (int i = 0; i < eduQuizes.getModu().length; i+=1) {
			// Skip the quiz if there's no results
			if (eduQuizes.getModu(i).getResult().size() < 1) {
				continue;
			}
			
			System.out.println(eduQuizes.getModu(i).getModuleName());
			System.out.println("===================================");
			
			for (int n = 0; n < eduQuizes.getModu(i).getResult().size(); n+=1) {
				System.out.println(
						"Result: " + eduQuizes.getModu(i).getResult().get(n).getPercentageCorrect() + "%" +
						"\n");	
			}	
		}
		
		// Print out all funQuizes results;
		System.out.println("\n\nFun Quizzes\n");
		for (int i = 0; i < funQuizes.getModu().length; i+=1) {
			// Skip the quiz if there's no results
			if (funQuizes.getModu(i).getResult().size() < 1) {
				continue;
			}
			
			System.out.println(funQuizes.getModu(i).getModuleName());
			System.out.println("===================================");
			
			for (int n = 0; n < funQuizes.getModu(i).getResult().size(); n+=1) {
				System.out.println(
						"Result: " + funQuizes.getModu(i).getResult().get(n).getGivenCharacter() + 
						"\nDescription: \n" + funQuizes.getModu(i).getResult().get(n).getGivenCharacterDesc() + 
						"\n");	
			}	
		}
		
		System.out.print("Type anything to continue: ");
		temp = input.next();
		menu();
	}
	
	public static void answerMenu(){
		int count = 0, changedInput = 0;
		String userInput = "";
		
		System.out.println("Select the question to show answer");
		System.out.println("Edu Quizzes");
		System.out.println("============================================");
		System.out.println("Input \t\t\t Quiz");
		System.out.println("============================================");
		for(int i = 0; i < eduQuizes.getModu().length;i++){
			System.out.println("  "+(count+1) +" \t\t\t" +eduQuizes.getModu(i).getModuleName() );
			count+=1;
		}
		
		System.out.println("\nFun Quizzes");
		System.out.println("============================================");
		System.out.println("Input \t\t\t Quiz");
		System.out.println("============================================");
		for (int j = 0; j < funQuizes.getModu().length; j+=1) {
			System.out.println("  "+(count+1) +" \t\t\t" +funQuizes.getModu(j).getModuleName() );
			count+=1;
		}
		System.out.println("\nInput \"-1\" to return to menu.\n");
		
		do {
			System.out.print("Input: ");
			userInput = input.next();
			
			// To prevent error if userInput char/string
			if (!userInput.matches("[a-zA-Z]+")) {
				changedInput = Integer.parseInt(userInput);
			}
			else {
				changedInput = -100;
			} // end of if else statement
			
			// Check if user input is legit
			if (changedInput == -1) {
				System.out.println("Going back to menu...");
				menu();  // Back to menu if user enter sentinel value -1
			}
			// Check if user inputed number is within quizzes range
			else if (changedInput > 0 && changedInput <= eduQuizes.getModu().length) {
				lastModule = changedInput - 1;// decrease value of input by 1 to match the index of array
				printEduAnswer(lastModule);// pass the number of input to the print method
			}
			else if(changedInput > eduQuizes.getModu().length){
				lastModule = (changedInput - eduQuizes.getModu().length) - 1;// decrease value of input by length of eduQuizes+1 to match the index of array
				printFunKey(lastModule);// pass the number of input to the print method
			}
			else {
				userInput = "Invalid";
				System.out.println("Your input is invalid, please try again.");
			} // end of if else statement
					
		} while(userInput == "Invalid"); // end of do while loop
		
	}
	
	public static void printFunKey(int i ){
		/* call showAnswer method respectively to the funQuizes and value 
		   passed when calling printFunKey method to get the index of module */
		funQuizes.getModu(i).showAnswer(); 
		// back to answerMenu
		answerMenu();
	}
	
	public static void printEduAnswer(int i ) {
		/* call showAnswer method respectively to the eduQuizes and value
		   passed when calling printEduAnswer method to get the index of module */
		eduQuizes.getModu(i).showAnswer();
		// back to answerMenu
		answerMenu();
	}
	
}
