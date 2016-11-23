
public class InitializeFunQuizes {

	private Modules modu[] = new Modules[3];
	private QuestionsFun[] questions;
	
	// Produce constructor and all setter and getters.
	public InitializeFunQuizes() {
		
		// Initialize all the fun quizzes
		hyperdimensionCharacter();
		kingdomHeartsCharacter();
		Dota2Character();
		
	}
	
	public void hyperdimensionCharacter() {
		
		QuestionsFun[] questions = new QuestionsFun[9];
		String[] characters = new String[4];
		String[] characterDesc = new String[4];
		int[] charactersPoint = {0, 0, 0, 0};
		
		for (int i = 0; i < questions.length; i++) {
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
		characters[1] = "Riku";
		characters[2] = "Aqua";
		characters[3] = "Ventus";
		
		// Define character's description
		characterDesc[0] = "You are Sora, sincere about what you says and does, also possesses a strong sense of justice and an unrelenting heart.";
		characterDesc[1] = "You are Riku, although sometimes wander around light and darkness but you always ready to sacrifice himself to protect your friend.";
		characterDesc[2] = "You are Aqua, believe in unbreakable connections, brave when facing obstacles and high determination.";
		characterDesc[3] = "You are Ventus, always been happy and positive around people that is better than you but you yourself carries high potential.";
		
		questions[0].setQuestionName("What is most important to you?");
		questions[0].setQuestionOption(new String[] {
				"Being number one.", 
				"Friendship.", 
				"Prize possessions.",
				"Hapiness"});
		questions[0].setQuestionKey(new int[] {0, 2, 1,3});
		
		questions[1].setQuestionName("What do you want outta life?");
		questions[1].setQuestionOption(new String[] {
				"To see rare sights.", 
				"To be with friends and family.",
				"To broaden my horizons.", 
				"To be strong."});
		questions[1].setQuestionKey(new int[] {0, 3, 2, 1});
		
		questions[2].setQuestionName("What are you afraid of?");
		questions[2].setQuestionOption(new String[] {
				"Getting old.", 
				"Being different.",
				"Become a villian",
				"Being indecisive."});
		questions[2].setQuestionKey(new int[] {2, 3, 1, 0});
		
		questions[3].setQuestionName("What will you choose?");
		questions[3].setQuestionOption(new String[] {
				"Sheild.", 
				"Staff.", 
				"Sword.",
				"Nature"});
		questions[3].setQuestionKey(new int[] {1, 2, 0, 3});
		
		questions[4].setQuestionName("What are you doing if u are stuck inside dark realm?");
		questions[4].setQuestionOption(new String[] {
				"Searching for light.", 
				"Succumb to darkness.", 
				"Explore inside there.",
				"Waiting for rescue."});
		questions[4].setQuestionKey(new int[] {2, 1, 3, 0});
		
		questions[5].setQuestionName("What will you do if to recover your friend that lost memory?");
		questions[5].setQuestionOption(new String[] {
				"Just be with him//her to build new memory.", 
				"Wander around darkness to find a way to cure him/her.", 
				"Willing to give up the most valuable possession to save him/her.",
				"Accept darkness in yourself to be strong enough to help."});
		questions[5].setQuestionKey(new int[] {3, 2, 0, 1});
		
		questions[6].setQuestionName("Choose one of the power you would like to have.");
		questions[6].setQuestionOption(new String[] {
				"Light.",
				"Wind.",
				"Magic.", 
				"Darkness."});
		questions[6].setQuestionKey(new int[] {0, 3, 2, 1});
		
		questions[7].setQuestionName("What would you do if u have a chance to travel to different world from our dimension?");
		questions[7].setQuestionOption(new String[] {
				"Make new friends and help them through the journey.", 
				"Be nice and kind to people that you meet there.", 
				"Venture around and take adventure in the new world.",
				"Find the core problem to be solve in that world to move on."});
		questions[7].setQuestionKey(new int[] {0, 2, 3, 1});
		
		questions[8].setQuestionName("If your friend is seperated with you with conflict, what would you do?");
		questions[8].setQuestionOption(new String[] {
				"Simply have to just find them.", 
				"Avoid them even if we do meet because i am not best version of myself.", 
				"Do all the best to find a way to find them.",
				"Find them and solve the problem because I treat them as family."});
		questions[8].setQuestionKey(new int[] {0, 2, 1, 3});
		
		this.modu[1] = new QuizFunQuestions("Fun", "Kingdom Hearts Character", questions, characters, characterDesc, charactersPoint);
	}
	
	public void Dota2Character() {
		
		QuestionsFun[] questions = new QuestionsFun[9];
		String[] characters = new String[4];
		String[] characterDesc = new String[4];
		int[] charactersPoint = {0, 0, 0, 0};
		
		for (int i = 0; i < questions.length; i++) {
			questions[i] = new QuestionsFun(4);
		}
		
		// Define available characters
		characters[0] = "Crystal Maiden";
		characters[1] = "Lina";
		characters[2] = "Phantom Assasin";
		characters[3] = "Enigma";
		
		// Define character's description
		characterDesc[0] = "You're a shit player with the skill of a Hero Crystal Maiden. I suggest leave the Dota community.";
		characterDesc[1] = "You're a decent noob player who thinks you can cope up with pros just like Lina. Suggestion says your likely 1k MMR";
		characterDesc[2] = "You're a average player with potential just like Phantom Assasin . Refine your skills to be a professional.";
		characterDesc[3] = "You're a decendant of the Chi Long Qua god's, just like Enigma you're a big deal . Suggestion says jump in and 1 v 5.";
			
		questions[0].setQuestionName("What is your role?");
		questions[0].setQuestionOption(new String[] {"Feeder", "Carry", "Jungler", "Support"});
		questions[0].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[1].setQuestionName("What is you're MMR?");
		questions[1].setQuestionOption(new String[] {"1k", "2k", "3k", "4k++"});
		questions[1].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[2].setQuestionName("You're 25000 GPM and XPM down compared to the enermy team ,its 24 minutes in the gamw what should you do?");
		questions[2].setQuestionOption(new String[] {"Team Stupid", "All chat GGWP", "Be as tryhard as possible", "Enjoy the game"});
		questions[2].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[3].setQuestionName("Rapier has been dropped by your carry, you're team gives up, what should you do?");
		questions[3].setQuestionOption(new String[] {
				"Cut trees and hide in the trees", 
				"Yell GG noob carry",
				"Defend and hope to make a big difference under tower",
				"Make a smoke attempt to kill the opponents off guard"
		});
		questions[3].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[4].setQuestionName("What is your ideal weapon as a carry?");
		questions[4].setQuestionOption(new String[] {"Shadow Blade", "Sange and Yasha", "Desolator", "Divine Rapier"});
		questions[4].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[5].setQuestionName("Which is the best team layout?");
		questions[5].setQuestionOption(new String[] {
				"Phantom Assasin,Juggernaught,Sniper,Templa Assasin,Shadow Fiend",
				"Weaver,Rikki,Bounty Hunter,Templa Assasin,Clinks",
				"Enigma,Silencer,Omninight,Shadow Fiend,Dragon Knight",
				"Tidehunter,Invoker,Phantom Assasin,Dazzle,Slardar"
		});
		questions[5].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[6].setQuestionName("What is your favourite ARCANA?");
		questions[6].setQuestionOption(new String[] {
				"CM arcana",
				"Lina arcana",
				"PA arcana",
				"Techies arcana"
		});
		questions[6].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[7].setQuestionName("Who is the best hero for you?");
		questions[7].setQuestionOption(new String[] {"Phantom Assasin", "Rikki", "Shadow Fiend", "Invoker"});
		questions[7].setQuestionKey(new int[] {0, 1, 2, 3});
		
		questions[8].setQuestionName("Do you want kill roshan when the enermy team is missing?");
		questions[8].setQuestionOption(new String[] {
				"YES! Let's do it!",
				"We should but spread out in the rosh pit",
				"One should wait oustide",
				"Let,s go in smoke up and back to our jungle and wait"
		});
		questions[8].setQuestionKey(new int[] {0, 1, 2, 3});
		
		this.modu[2] = new QuizFunQuestions("Fun", "Dota2 Character", questions, characters, characterDesc, charactersPoint);
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
