import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Quiz_Main {
	
	public static final Scanner input = new Scanner(System.in);
	public static InitializeEduQuizes eduQuizes = new InitializeEduQuizes();
	public int userScore = 0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to House Mormont's Quiz Bank!");
		System.out.println("Take a look at the options and choose whichever!");
		menu();
	}
	
	public static void menu() {
		
		int userInput = 0;

		System.out.println("");
		System.out.println("Options \t\t\t Input");
		System.out.println("=====================================");
		System.out.println("Education Quizes \t\t   1");
		System.out.println("Fun Quizes \t\t\t   2");
		System.out.println("Results \t\t\t   3");
		System.out.println("=====================================");
		System.out.println("Input \"-1\" to EXIT.\n");
		System.out.print("Input: ");
		userInput = input.nextInt();
		System.out.println("\n");
		
		switch(userInput) {
			case -1:
				System.out.println("Goodbye! See you again!");
				break;
			case 1:
				eduMenu();
				break;
			case 2:
				System.out.println("Fun Quizes");
				break;
			case 3: 
				System.out.println("Results");
				break;
			case 100:
				testMe();
				break;
			default:
				System.out.println("Invalid Input!");
				System.out.println("Please re-enter!");
				menu();
		}
		
	}
	
	public static void eduMenu() {
		
		int userInput = 0;
		
		System.out.println("Which educational quiz would you like to attempt?");
		System.out.println("============================================");
		System.out.println("Options \t\t\t input");
		System.out.println("============================================");
		for (int n = 0; n < eduQuizes.getModu().length; n+=1) {
			System.out.println(eduQuizes.getModu(n).getModuleName() +
					" \t\t\t  " + (n + 1));
		}
		System.out.println("============================================");
		System.out.println("Input \"-1\" to return to MENU.\n");
		System.out.print("Input: ");
		userInput = input.nextInt();
		System.out.println("\n");
		
		switch(userInput) {
			case -1:
				System.out.println("Going back to menu...");
				menu();
				break;
			case 1: 
				printQuestions(eduQuizes.getModu(0));
				break;
			case 2:
				printQuestions(eduQuizes.getModu(1));
				break;
			default:
				System.out.println("Invalid Input!");
				System.out.println("Please re-enter!");
				eduMenu();
		}
		
	}
	
	public static void testMe() {
		System.out.println(eduQuizes.getModu(0).getModuleName());
	}
	
	public static void printQuestions(Modules modu) {
		
		int count = 0;
		String userInput;
		char[] changedInput = new char[40];
		char[] temp = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		
		System.out.println(modu.getModuleName());
		
		do {
			
			System.out.println("");
			System.out.println(((QuizEduQuestions)modu).questionArray[count].getQuestionName());
			
			// Loop through the individual questions options array
			for (int n = 0; n < ((QuizEduQuestions)modu).questionArray[count].getQuestionOption().length; n+=1) {
				System.out.println(temp[n] + ". " + ((QuizEduQuestions)modu).questionArray[count].getQuestionOption(n));
			}
			
			// Ask for user input and take only the first character, and turn it to upper case
			System.out.print("\nYour Answer: ");
			userInput = input.next();
			userInput = userInput.toUpperCase();
			changedInput[count] = userInput.charAt(0);
			
			count +=1;
			
		} while (count < ((QuizEduQuestions)modu).questionArray.length);
		
		checkResults(changedInput, modu);
	}
	
	public static void checkResults(char[] results, Modules modu) {
		
		// To make percentage look nice and clean
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		
		int score = 0;
		double percentageScore = 0.0;
		String scoreString;
		
		for (int i = 0; i < ((QuizEduQuestions)modu).questionArray.length; i+=1) {
			if (results[i] == ((QuizEduQuestions)modu).questionArray[i].getAnswer().charAt(0)) {
				score +=1;
			}
		}
		
		// Format the percentage score and turn it into string
		percentageScore = ((double)(score) / ((QuizEduQuestions)modu).getMaxScore()) * 100;
		scoreString = df.format(percentageScore);
		
		System.out.println("\nResults: " + score + " / " + ((QuizEduQuestions)modu).getMaxScore());
		System.out.println("You got " + scoreString + "% of all questions correct!");
		System.out.println("\n\nReturning to main menu...");
		menu();
		
	}
	
}
