
public class QuestionsEdu extends Questions {
	private String answer;
	
	public QuestionsEdu(){
		answer = "";
	}
	
	public QuestionsEdu(String questionName, String questionOption[], String answer){
		this.setQuestionName(questionName);
		this.setQuestionOption(questionOption);
		this.answer = answer;
	}
	
	public String getAnswer(){
		return answer;
	}
	
	public void setAnswer(String answer){
		this.answer = answer;
	}
	
	public String toString(){
		return "\nQuestion name\t:\t"+ answer;
	}
	
	
}
