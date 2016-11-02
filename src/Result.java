
public class Result {
	private float percentageCorrect;
	
	public float getPercentageCorrect(){
		return percentageCorrect;
	}
	
	public void setPercentageCorrect(float percentageCorrect){
		this.percentageCorrect = percentageCorrect;
	}
	
	public String toString(){
		return ""+percentageCorrect;
	}
}