import java.util.*;

public class Quiz_Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		
		System.out.println("Welcome to House Mormont's Quiz Bank!");
		System.out.println("Take a look at the options and choose whichever!");
		
		menu(input);
		
		
	}
	
	public static void menu(Scanner input) {
		
		int userInput = 0;

		System.out.println("");
		System.out.println("Options \t Input");
		System.out.println("========================");
		System.out.println("Quizes \t\t 1");
		System.out.println("Results \t 2");
		System.out.println("========================");
		System.out.println("Input -1 to EXIT.\n");
		System.out.print("Input: ");
		userInput = input.nextInt();
		System.out.println("");
		
		switch(userInput) {
			case -1:
				System.out.println("Goodbye! See you again!");
				break;
			case 1:
				System.out.println("Quizes");
				break;
			case 2: 
				System.out.println("Results");
				break;
			default:
				System.out.println("Invalid Input!");
				System.out.println("Please re-enter!");
				menu(input);
		}
		
	}
}
