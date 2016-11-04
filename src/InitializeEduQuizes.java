
public class InitializeEduQuizes {
	
	public Modules modu[] = new Modules[2];
	public QuestionsEdu[] questions;
	
	public InitializeEduQuizes() {

		// Kidz Math
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
		modu[1] = new QuizEduQuestions("Education", "Test Math", questions, 10, 0);
	}
	
	public Modules[] getModule() {
		return modu;
	}
	
	public Modules getModule(int i) {
		return modu[i];
	}
	
}
