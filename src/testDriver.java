
public class testDriver {
	public static void main(String[] args){
		Modules modu[] = new Modules[2];
		modu[0] = new QuizEduQuestions();
		modu[0].setModuleType("Education");
		
		QuestionsEdu[] testQuestions = new QuestionsEdu[10];
		for (int i = 0; i < 10; i+=1) {
			testQuestions[i] = new QuestionsEdu();
		}
		
		testQuestions[0].setQuestionName("Fuck you JQ?");
		testQuestions[0].setQuestionOption(new String[] {"Yea please", "No Onegai"});
		testQuestions[0].setAnswer("Yes please");
		
		modu[1] = new QuizEduQuestions(testQuestions, 10, 0);
		
		QuestionsEdu q1 = new QuestionsEdu("Testing one two three", new String[] {"Testing", "Hello"}, "Hello");
		
	}
}
