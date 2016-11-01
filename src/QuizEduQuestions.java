
public class QuizEduQuestions extends Modules{
	private String questionName[];
	private int questionArray[][];
	private int answer[];
	private boolean played;
	
	public QuizEduQuestions(){
		questionName = new String[]{};
		questionArray = new int[][]{{}};
		answer = new int[]{};
		played = false;
	}
	
	public QuizEduQuestions(String questionName[], int questionArray[][],int answer[], boolean played){
		this.questionName = questionName;
		this.questionArray = questionArray;
		this.answer = answer;
		this.played = played;
	}
	
	public String[] getQuestionName() {
		return questionName;
	}
	
	public void setQuestionName(String questionName[]) {
		this.questionName = questionName;
	}
	
	public int[][] getQuestionArray() {
		return questionArray;
	}
	
	public void setQuestionArray(int questionArray[][]) {
		this.questionArray = questionArray;
	}
	
	public int[] getAnswer() {
		return answer;
	}
	
	public void setAnswer(int answer[]) {
		this.answer = answer;
	}
	
	public boolean isPlayed() {
		return played;
	}

	public void setPlayed(boolean played) {
		this.played = played;
	}
	
	public String toString(){
		String tmpName = "";
		
		for(int i = 0; i < 100 ; i++){
			if (questionName[i] == null){
				break;
			}
			else{
				tmpName += questionName[i] + "\t";
			}
		}
		return super.toString()+"\nQuestion Name\t:\t"+tmpName;
	}
}
