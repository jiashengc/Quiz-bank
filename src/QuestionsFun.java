
public class QuestionsFun extends Questions {
	private int questionKey[];

	// Produce all constructor, overloaded constructor, and all setter and getters.
	public QuestionsFun() {
		questionKey = new int[4];
	}
	
	public QuestionsFun(int i) {
		questionKey = new int[i];
	}
	
	public QuestionsFun(int questionKey[]) {
		for (int i = 0; i < questionKey.length; i+=1) {
			this.questionKey[i] = questionKey[i];
		}
	}
	
	public QuestionsFun(String questionName, String[] questionOption, int[] questionKey) {
		this.setQuestionName(questionName);
		this.setQuestionOption(questionOption);
		for (int i = 0; i < questionKey.length; i+=1) {
			this.questionKey[i] = questionKey[i];
		}
	}
	
	public int[] getQuestionKey() {
		return questionKey;
	}
	
	public int getQuestionKey(int i) {
		return questionKey[i];
	}
	
	public void setQuestionKey(int questionKey[]) {
		this.questionKey = questionKey;
	}
	
	@Override
	public String toString() {
		String temp = "";
		for (int i = 0; i < getQuestionKey().length; i+=1) {
			temp += getQuestionKey(i);
		}
		return super.toString() + temp;
	}
	
}
