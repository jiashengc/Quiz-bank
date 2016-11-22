
public class InitializeFunQuizes {

	private Modules modu[] = new Modules[1];
	private QuestionsFun[] questions;
	
	// Produce constructor and all setter and getters.
	public InitializeFunQuizes() {
		
		// Initialize all the fun quizzes
		hyperdimensionCharacter();
		kingdomHeartsCharacter();
		
	}
	
	public void hyperdimensionCharacter() {
		
		QuestionsFun[] questions = new QuestionsFun[9];
		String[] characters = new String[4];
		String[] characterDesc = new String[4];
		int[] charactersPoint = {0, 0, 0, 0};
		
		for (int i = 0; i < questions.length; i+=1) {
			questions[i] = new QuestionsFun(4);
		}
		
		// Define available characters
		characters[0] = "Blanc";
		characters[1] = "Noire";
		characters[2] = "Neptune";
		characters[3] = "Vert";
		
		// Define character's description
		characterDesc[0] = "You are Blanc, CPU White Heart of Lowee. You're a quite and introveted girl lmao.";
		characterDesc[1] = "You are Noire, CPU Black Heart of Lastation. You're a tryhard and a Tsun Tsun lmao.";
		characterDesc[2] = "You are Neptune, CPU Purple Heart of Planeptune. You're the protagonist and always thinks shes best lmao.";
		characterDesc[3] = "You are Vert, CPU Green Heart of LeanBox. You are mature but you're also the biggest weeabo lmao.";
			
		questions[0].setQuestionName("What is your favourite color?");
		questions[0].setQuestionOption(new String[] {"White", "Black", "Purple", "Green"});
		questions[0].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[1].setQuestionName("Which console company do you perfer to work under?");
		questions[1].setQuestionOption(new String[] {"SEGA", "Nitendo", "Playstation", "Microsoft"});
		questions[1].setQuestionKey(new int[] {2, 0, 1, 3});
		
		questions[2].setQuestionName("What do you during your spare time?");
		questions[2].setQuestionOption(new String[] {"Read books", "Be as tryhard as possible", "Play video games", "Procrastinate and sleep"});
		questions[2].setQuestionKey(new int[] {0, 1, 3, 2});
		
		questions[3].setQuestionName("When confronted, what would you do?");
		questions[3].setQuestionOption(new String[] {
				"Act all suprised and Tsun Tsun", 
				"Pretend you're all high and mighty when you're not",
				"Laugh at your attacker because you're the best!",
				"Keep calm then go berserk later"
		});
		questions[3].setQuestionKey(new int[] {1, 3, 2, 0});
		
		questions[4].setQuestionName("What is your ideal weapon?");
		questions[4].setQuestionOption(new String[] {"Sword", "Rapier", "War Hammer", "Spear"});
		questions[4].setQuestionKey(new int[] {2, 1, 0, 3});
		
		questions[5].setQuestionName("What kind of younger sibling(s) do you want?");
		questions[5].setQuestionOption(new String[] {
				"Someone who looks up to you and wants to be you",
				"Someone more mature than you",
				"Someone who hates everyone but you",
				"None"
		});
		questions[5].setQuestionKey(new int[] {1, 2, 0, 3});
		
		questions[6].setQuestionName("What is your personality?");
		questions[6].setQuestionOption(new String[] {
				"Proud and arrogant",
				"Cheerful and bubbly",
				"Reserved and violent tempered",
				"Calm and composed"
		});
		questions[6].setQuestionKey(new int[] {1, 2, 0, 3});
		
		questions[7].setQuestionName("What kind of figure do you want?");
		questions[7].setQuestionOption(new String[] {"Really little loli girl", "Just a loli girl", "Medium assets", "Huge assets"});
		questions[7].setQuestionKey(new int[] {0, 2, 1, 3});
		
		questions[8].setQuestionName("Do you want to be the protagonist of video game(s)");
		questions[8].setQuestionOption(new String[] {
				"YES! I want to be the protagonist in all of them",
				"I want to be, but I never get to be",
				"Just being in one or a few is enough",
				"No, because no one likes me any way"
		});
		questions[8].setQuestionKey(new int[] {2, 1, 0, 3});
		
		this.modu[0] = new QuizFunQuestions("Fun", "Hyperdimension Character", questions, characters, characterDesc, charactersPoint);
	}
	
	public void kingdomHeartsCharacter() {
		QuestionsFun[] questions = new QuestionsFun[9];
		String[] characters = new String[4];
		String[] characterDesc = new String[4];
		int[] charactersPoint = {0,0,0,0};
		
		for(int i =  0 ; i < questions.length ; i+=1 ){
			questions[i] = new QuestionsFun(4);
		}
		
		//Define all characters
		characters[0] = "Sora";
		characters[1] = "";
	}
	
	public Modules[] getModu() {
		return modu;
	}
	
	public Modules getModu(int i) {
		return modu[i];
	}
	
	public void setModu(Modules[] modu) {
		this.modu = modu;
	}
	
}
