
public abstract class Questions {
	private String questionName;
	private String questionOption[];
	
	// Produce all constructor, overloaded constructor, and all setter and getters.
	public Questions(){
		questionName = "";
		questionOption = new String[]{};
	}
	
	public Questions(String questionName, String questionOption[]){
		this.questionName = questionName;
		this.questionOption = questionOption;
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
	
	public String toString(){
		return "\nQuestion name\t:\t"+questionName;
	}
	
	
}
