
public class QuizFunQuestions extends Modules {
	public QuestionsFun questionArray[];
	private Modules modu[] = new Modules[1];
	private String characters[];
	private String characterDesc[];
	private int charactersPoint[];
	
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
	
	public static void showAnswer(Modules modu) {
		int count = 0;
		System.out.println("If u want to be");
		System.out.println("\nBlanc (1 = A, 2 = B, 3 = C, 4 = D)");
		System.out.println("=====================================");
		
		for(int i = 0 ; i < ((QuizFunQuestions)modu).questionArray.length; i++){
			System.out.print(count+1 +".  ");
			System.out.println((((QuizFunQuestions)modu).questionArray[i].getQuestionKey(0)) + 1);
			count++;
		}
		
		System.out.println("\nNoire (1 = A, 2 = B, 3 = C, 4 = D)");
		System.out.println("=====================================");
		count = 0;
		for(int i = 0 ; i < ((QuizFunQuestions)modu).questionArray.length; i++){
			System.out.print(count+1 +".  ");
			System.out.println((((QuizFunQuestions)modu).questionArray[i].getQuestionKey(1)) + 1);
			count++;
		}
			
			System.out.println("\nNeptune (1 = A, 2 = B, 3 = C, 4 = D)");
			System.out.println("=====================================");
			count = 0;
		for(int i = 0 ; i < ((QuizFunQuestions)modu).questionArray.length; i++){
			System.out.print(count+1 +".  ");
			System.out.println((((QuizFunQuestions)modu).questionArray[i].getQuestionKey(2)) + 1);
			count++;
		}

			System.out.println("\nVert (1 = A, 2 = B, 3 = C, 4 = D)");
			System.out.println("=====================================");
			count = 0;
		for(int i = 0 ; i < ((QuizFunQuestions)modu).questionArray.length; i++){
			System.out.print(count+1 +".  ");
			System.out.println((((QuizFunQuestions)modu).questionArray[i].getQuestionKey(3)) + 1);
			count++;
		}
		count = 0;
}
	
	public void showAnswer(){
		for(int i = 0; i < modu.length; i++){
			System.out.println(i+1+" . "+questionArray[i].getQuestionKey());
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
	
}
