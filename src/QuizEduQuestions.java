
public class QuizEduQuestions extends Modules{
	public QuestionsEdu questionArray[];
	private Result results[];
	private int maxScore;
	private int score;
	
	public QuizEduQuestions(){
		questionArray = new QuestionsEdu[]{};
		maxScore = 0;
		score = 0;
	}
	
	public QuizEduQuestions(QuestionsEdu questionArray[], Result results[], int maxScore, int score){
		this.questionArray = questionArray;
		this.maxScore = maxScore;
		this.score = score;
	}
	
	public QuizEduQuestions(String moduleType,Result results[], QuestionsEdu questionArray[], int maxScore, int score){
		this.setModuleType(moduleType);
		this.setResult(results);
		this.questionArray = questionArray;
		this.maxScore = maxScore;
		this.score = score;
	}
	
	public QuestionsEdu[] getQuestionArray(){
		return questionArray;
	}
	
	public void setQuestionArray(QuestionsEdu questionArray[]){
		this.questionArray = questionArray;
	}
	
	public int getMaxScore(){
		return maxScore;
	}
	
	public void setMaxScore(int maxScore){
		this.maxScore = maxScore;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	
	public String showResult(){
		String tmp = "";
		
		for(int i=0 ; i<results.length;i+=1){
			tmp += "Attempt "+(i+1)+"\t:\t"+results[i].toString();
		}
		return tmp;
	}

	//TODO where is your toString() method you bitch
	
}
