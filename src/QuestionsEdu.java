
public class QuestionsEdu {
	private String questionName;
	private String questionOption[];
	private String answer;
	
	public QuestionsEdu(){
		questionName = "";
		questionOption = new String[]{};
		answer = "";
	}
	
	public QuestionsEdu(String questionName, String questionOption[], String answer){
		this.questionName = questionName;
		this.questionOption = questionOption;
		this.answer = answer;
	}
	
	public String getQuestionName(){
		return questionName;
	}
	
	public void setQuestionName(String questionName){
		this.questionName = questionName;
	}
	
	public String[] getQuestionOption(){
		return questionOption;
	}
	
	public String getQuestionOption(int n) {
		return questionOption[n];
	}
	
	public void setQuestionOption(String questionOption[]){
		this.questionOption = questionOption;
	}
	
	public String getAnswer(){
		return answer;
	}
	
	public void setAnswer(String answer){
		this.answer = answer;
	}
	
	public String toString(){
		return "\nQuestion name\t:\t"+questionName;
	}
	
	
}
