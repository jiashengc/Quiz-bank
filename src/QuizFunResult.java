
public class QuizFunResult {
	private String resultCharacter;
	private int count;
	
	public QuizFunResult(){
		resultCharacter = "";
		count = 0;
	}
	
	public QuizFunResult(String resultCharacter, int count){
		this.resultCharacter = "";
		this.count = count;
	}
	
	public String getResultCharacter() {
		return resultCharacter;
	}
	
	public void setResultCharater(String resultCharacter) {
		this.resultCharacter = resultCharacter;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public String toString(){
		return super.toString()+"\nResult\t:\t" +resultCharacter;
	}
}
