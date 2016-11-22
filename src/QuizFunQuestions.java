
public class QuizFunQuestions extends Modules {
	public QuestionsFun questionArray[];
	private Modules modu[] = new Modules[1];
	private String characters[];
	private String characterDesc[];
	private int charactersPoint[];
	
	// Produce all constructor, overloaded constructor, and all setter and getters.
	public QuizFunQuestions() {
		QuestionsFun questionArray[] = new QuestionsFun[10];
		String characters[] = new String[4];
		String charactersDesc[] = new String[4];
		int charactersPoint[] = {0, 0, 0, 0};
		for (int i = 0; i < 10; i+=1) {
			questionArray[i] = new QuestionsFun();
		}
		for (int i = 0; i < 4; i+=1) {
			characters[i] = "";
			charactersDesc[i] = "";
		}
	}
	
	public QuizFunQuestions(String moduleType, String moduleName, QuestionsFun questionArray[], String characters[], String characterDesc[], int charactersPoint[]) {
		this.setModuleType(moduleType);
		this.setModuleName(moduleName);
		this.questionArray = questionArray;
		this.characters = characters;
		this.characterDesc = characterDesc;
		this.charactersPoint = charactersPoint;
	}

	public QuestionsFun[] getQuestionArray() {
		return questionArray;
	}
	
	public QuestionsFun getQuestionArray(int i) {
		return questionArray[i];
	}
	
	public void setQuestionArray(QuestionsFun[] questionArray) {
		for (int i = 0; i < questionArray.length; i+=1) {
			this.questionArray[i] = questionArray[i];
		}
	}
	
	public String[] getCharacters() {
		return characters;
	}
	
	public String getCharacters(int i) {
		return characters[i];
	}

	public void setCharacters(String characters[]) {
		for (int i = 0; i < characters.length; i+=1) {
			this.characters[i] = characters[i];
		}
	}

	public String[] getCharacterDesc() {
		return characterDesc;
	}

	public String getCharacterDesc (int i) {
		return characterDesc[i];
	}
	
	public void setCharacterDesc(String characterDesc[]) {
		for (int i = 0; i < characterDesc.length; i+=1) {
			this.characterDesc[i] = characterDesc[i];
		}
	}

	public int[] getCharacterPoint() {
		return charactersPoint;
	}
	
	public int getCharacterPoint(int i) {
		return charactersPoint[i];
	}

	public void setCharacterPoint(int charactersPoint[]) {
		this.charactersPoint = charactersPoint;
	}	
	
	public void showAnswer(){
			
		System.out.println(getCharacters(0));// Get the character name from array index 0
		System.out.println("=====================================");
		for(int i = 0; i < questionArray.length; i++){
			// get the 1st index  of question key for each question
			System.out.println(i+1+" . "+questionArray[i].getQuestionKey(0));
		}
			
		System.out.println("\n"+getCharacters(1));// Get the character name from array index 1
		System.out.println("=====================================");
		for(int i = 0; i < questionArray.length; i++){
			// get the 2nd index  of question key for each question
			System.out.println(i+1+" . "+questionArray[i].getQuestionKey(1));
		}
			
		System.out.println("\n"+getCharacters(2));// Get the character name from array index 2
		System.out.println("=====================================");
		for(int i = 0; i < questionArray.length; i++){
			// get the 3rd index  of question key for each question
			System.out.println(i+1+" . "+questionArray[i].getQuestionKey(2));
		}
			
		System.out.println("\n"+getCharacters(3));// Get the character name from array index 3
		System.out.println("=====================================");
		for(int i = 0; i < questionArray.length; i++){
			// get the 4th index  of question key for each question
			System.out.println(i+1+" . "+questionArray[i].getQuestionKey(3));
		}
		System.out.println();
	}
}
