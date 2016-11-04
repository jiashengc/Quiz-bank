
public class QuizEduQuestions extends Modules{
	public QuestionsEdu questionArray[];
	private int maxScore;
	private int score;
	
	public QuizEduQuestions(){
		QuestionsEdu questionArray[] = new QuestionsEdu[10];
		for (int i = 0; i < 10; i+=1) {
			questionArray[i] = new QuestionsEdu();
		}
		maxScore = 100;
		score = 0;
	}
	
	public QuizEduQuestions(QuestionsEdu questionArray[], int maxScore, int score){
		for (int i = 0; i < 10; i+=1) {
			this.questionArray[i] = questionArray[i];
		}
		this.maxScore = maxScore;
		this.score = score;
	}
	
	public QuizEduQuestions(String moduleType, String moduleName, QuestionsEdu questionArray[], int maxScore, int score){
		this.setModuleType(moduleType);
		this.setModuleName(moduleName);
		this.questionArray = questionArray;
		this.maxScore = maxScore;
		this.score = score;
	}
	
	public QuestionsEdu[] getQuestionArray(){
		return questionArray;
	}
	
	public void setQuestionArray(QuestionsEdu[] questionArray){
		for (int i = 0; i < 10; i+=1) {
			this.questionArray[i] = questionArray[i];
		}
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
	
	public String toString(){
		String tmpName = "";
		
		for(int i=0; i < questionArray.length; i+=1){
			tmpName += questionArray[i] +"\t";
		}
		
		return super.toString() + "\n" + tmpName;
	}
	
}
