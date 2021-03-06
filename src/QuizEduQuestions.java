
public class QuizEduQuestions extends Modules{
	public QuestionsEdu questionArray[];
	private Modules modu[] = new Modules[6];
	private int maxScore;
	private int score;
	
	// Produce all constructor, overloaded constructor, and all setter and getters.
	public QuizEduQuestions(){
		QuestionsEdu questionArray[] = new QuestionsEdu[10];
		for (int i = 0; i < 10; i+=1) {
			questionArray[i] = new QuestionsEdu();
		}
		maxScore = 100;
		score = 0;
	}
	
	public QuizEduQuestions(QuestionsEdu questionArray[], int maxScore, int score){
		for (int i = 0; i < questionArray.length; i+=1) {
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
		for (int i = 0; i < questionArray.length; i+=1) {
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
		
		for(int i=0 ; i < super.getResult().size(); i+=1){
			tmp += "Attempt "+(i+1)+"\t:\t"+ super.getResult().get(i).toString();
		}
		return tmp;
	}
	
	public void showAnswer(){
		System.out.println("Answer for " +getModuleName());// get name of the module requested
		System.out.println("=====================================");
		for(int i = 0; i < questionArray.length; i++){
			// Get the answer for each question for the respective module
			System.out.println((i+1) + ". " + questionArray[i].getAnswer());
		}
		System.out.println();
	}
	
	public String toString(){
		String tmpName = "";
		
		for(int i=0; i < questionArray.length; i+=1){
			tmpName += questionArray[i] +"\t";
		}
		
		return super.toString() + "\n" + tmpName;
	}
	
}
