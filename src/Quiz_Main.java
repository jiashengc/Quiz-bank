import java.util.*;

public class Quiz_Main {
	
	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int userInput = 0;
		
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
		
		//TODO InitializeEduQuizes eduQuizes = new InitializeEduQuizes();
		
		int userInput = 0;
		
		System.out.println("Which educational quiz would you like to attempt?");
		System.out.println("============================================");
		System.out.println("Options \t\t\t input");
		System.out.println("============================================");
		System.out.println("Kidz Math \t\t\t   1");
		System.out.println("Kidz Math \t\t\t   1");
		System.out.println("Kidz Math \t\t\t   1");
		System.out.println("Kidz Math \t\t\t   1");
		System.out.println("Kidz Math \t\t\t   1");
		System.out.println("============================================");
		System.out.println("Input \"-1\" to return to MENU.\n");
		System.out.print("Input: ");
		userInput = input.nextInt();
		System.out.println("\n");
		
		switch(userInput) {
			case -1:
				System.out.println("Going back to menu");
				menu();
				break;
			case 1: 
				QuizKidzMath();
				break;
			default:
				System.out.println("Invalid Input!");
				System.out.println("Please re-enter!");
				eduMenu();
		}
		
	}
	
	// ((ChildClass) s).childClassMethod()
	
	public static void testMe() {
		InitializeEduQuizes eduQuizes = new InitializeEduQuizes();
		
		System.out.println(eduQuizes.getQuestion(0));
	}
	
	public static void QuizKidzMath() {
		Modules modu[] = new Modules[2];
		QuestionsEdu[] questions = new QuestionsEdu[10];
		
		for(int i = 0; i < 10; i+=1){
			questions[i] = new QuestionsEdu();
		}
		
		questions[0].setQuestionName("What is 1 + 1?");
		questions[0].setQuestionOption(new String[] {"11", "111", "2", "Window"});
		questions[0].setAnswer("C");
		
		questions[1].setQuestionName("What is 2 x 2?");
		questions[1].setQuestionOption(new String[] {"4", "22", "Choo Choo Train", "44"});
		questions[1].setAnswer("A");
		
		questions[2].setQuestionName("What is log(1)?");
		questions[2].setQuestionOption(new String[] {"1", "0", "log(1)(1)1", "10"});
		questions[2].setAnswer("B");
		
		questions[3].setQuestionName("What is 10^2?");
		questions[3].setQuestionOption(new String[] {"100", "200", "20", "10"});
		questions[3].setAnswer("A");
		
		questions[4].setQuestionName("If Jun Quan was a 18 years old kid, what would be his height?");
		questions[4].setQuestionOption(new String[] {"100cm", "130cm", "160cm", "190cm"});
		questions[4].setAnswer("C");
		
		questions[5].setQuestionName("If Halim was 140cm tall, and Jun Quan is 69kg fat, what is the velocity of Adrian rushing to Shu En?");
		questions[5].setQuestionOption(new String[] {"0km/h", "150km/h", "200km/h", "300km/h"});
		questions[5].setAnswer("D");
		
		questions[6].setQuestionName("If your mmr is 5k, and Jon's mmr is 10k, how much would JQ's mmr be?");
		questions[6].setQuestionOption(new String[] {"0k scrub", "2k pinoy monkey", "10k MIRACLE", "ggwp"});
		questions[6].setAnswer("D");

		questions[7].setQuestionName("Assuming in a parallel universe, 1 + 1 = 0, 2 + 2 = 1, and 420 * 360 = 322, then what is 322 - 322 in our timeline?");
		questions[7].setQuestionOption(new String[] {"0", "360", "420 Blaze It!", "322"});
		questions[7].setAnswer("A");
		
		questions[8].setQuestionName("If you were to predict, what would be your height now?");
		questions[8].setQuestionOption(new String[] {"100cm", "100m", "200cm", "1km"});
		questions[8].setAnswer("D");
		
		questions[9].setQuestionName("If there were 10 chairs in the class and someone stole one from you, how many chairs would you have left?");
		questions[9].setQuestionOption(new String[] {"1", "0", "9", "10"});
		questions[9].setAnswer("B");
		
		modu[0] = new QuizEduQuestions("Education", "Kidz Math", questions, 10, 0);
		
		printQuestions(modu[0]);
		
	}
	
	public static void printQuestions(Modules modu) {
		
		int count = 0;
		String userInput;
		char[] changedInput = new char[10];
		char[] temp = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
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
			
		} while (count <= 9);
		
		checkResults(changedInput, modu);
		
	}
	
	public static void checkResults(char[] results, Modules modu) {
		
		int score = 0;
		for (int i = 0; i < 10; i+=1) {
			if (results[i] == ((QuizEduQuestions)modu).questionArray[i].getAnswer().charAt(0)) {
				score +=1;
			}
		}
		
		System.out.println("\nResults: " + score + " / " + ((QuizEduQuestions)modu).getMaxScore() + "\n");
		System.out.println("Returning to main menu...");
		menu();
		
	}
	
}
