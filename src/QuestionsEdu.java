
public class QuestionsEdu extends Questions {
	private String answer;
	
	// Produce all constructor, overloaded constructor, and all setter and getters.
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
	
	@Override
	public String toString(){
		return super.toString() + getAnswer();
	}
	
	
}
