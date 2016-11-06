
public class Result {
	private String percentageCorrect;
	private String givenCharacter = "";
	private String givenCharacterDesc = "";
	
	public Result() {
		percentageCorrect = "0.0%";
		givenCharacter = "none";
		givenCharacterDesc = "none";
	}
	
	public Result(String percentageCorrect) {
		this.percentageCorrect = percentageCorrect;
	}
	
	public Result(String givenCharacter, String givenCharacterDesc) {
		this.givenCharacter = givenCharacter;
		this.givenCharacterDesc = givenCharacterDesc;
	}
	
	public String getPercentageCorrect(){
		return percentageCorrect;
	}
	
	public void setPercentageCorrect(String percentageCorrect){
		this.percentageCorrect = percentageCorrect;
	}
	
	public String getGivenCharacter() {
		return givenCharacter;
	}
	
	public void setGivenCharacter(String givenCharacter) {
		this.givenCharacter = givenCharacter;
	}
	
	public String getGivenCharacterDesc() {
		return givenCharacterDesc;
	}
	
	public void setGivenCharacterDesc(String givenCharacterDesc) {
		this.givenCharacterDesc = givenCharacterDesc;
	}
	
	public String toString(){
		return ""+percentageCorrect;
	}
}