
public class QuizEduResult extends QuizEduQuestions{
	private int resultScore;
	private static int resultScoreMax;
	private int count;
	
	public QuizEduResult(){
		resultScore = 0;
		resultScoreMax = 100;
		count = 0;
	}
	
	public QuizEduResult(int resultScore, int resultScoreMax, int count){
		this.resultScore = resultScore;
		this.resultScoreMax = resultScoreMax;
		this.count = count;
	}
	
	public int getResultScore() {
		return resultScore;
	}
	
	public void setResultScore(int resultScore) {
		this.resultScore = resultScore;
	}

	public static int getResultScoreMax() {
		return resultScoreMax;
	}

	public static void setResultScoreMax(int resultScoreMax) {
		QuizEduResult.resultScoreMax = resultScoreMax;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public String toString(){
		return super.toString()+"\nScore\t:\t" +resultScore +"/100";
	}
}
