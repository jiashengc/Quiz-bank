
public class InitializeEduQuizes {
	
	private Modules modu[] = new Modules[6];
	private QuestionsEdu[] questions;
	
	// Produce constructor and all setter and getters.
	public InitializeEduQuizes() {
		
		// Initialize all the educational quizzes
		kidzMath();
		blancTrivia();
		Logics();
		Chemistry();
		AdvanceMaths();
		Humanitism();
		
	}
	
	public void kidzMath() {
	
		QuestionsEdu[] questions = new QuestionsEdu[10];
		
		for(int i = 0; i < 10; i+=1){
			questions[i] = new QuestionsEdu();
		}
		
		questions[0].setQuestionName("What is 1 + 1?");
		questions[0].setQuestionOption(new String[] {"11", "111", "2", "Window"});
		questions[0].setAnswer("C");
		
		questions[1].setQuestionName("What is 2 x 2?");
		questions[1].setQuestionOption(new String[] {"4", "22", "Choo Choo Train", "44"});
		questions[1].setAnswer("A");
		
		questions[2].setQuestionName("What is log(1)?");
		questions[2].setQuestionOption(new String[] {"1", "0", "log(1)(1)1", "10"});
		questions[2].setAnswer("B");
		
		questions[3].setQuestionName("What is 10^2?");
		questions[3].setQuestionOption(new String[] {"100", "200", "20", "10"});
		questions[3].setAnswer("A");
		
		questions[4].setQuestionName("If Jun Quan was a 18 years old kid, what would be his height?");
		questions[4].setQuestionOption(new String[] {"100cm", "130cm", "160cm", "190cm"});
		questions[4].setAnswer("C");
		
		questions[5].setQuestionName("If Halim was 140cm tall, and Jun Quan is 69kg fat, what is the velocity of Adrian rushing to Shu En?");
		questions[5].setQuestionOption(new String[] {"0km/h", "150km/h", "200km/h", "300km/h"});
		questions[5].setAnswer("D");
		
		questions[6].setQuestionName("If your mmr is 5k, and Jon's mmr is 10k, how much would JQ's mmr be?");
		questions[6].setQuestionOption(new String[] {"0k scrub", "2k pinoy monkey", "10k MIRACLE", "ggwp"});
		questions[6].setAnswer("D");

		questions[7].setQuestionName("Assuming in a parallel universe, 1 + 1 = 0, 2 + 2 = 1, and 420 * 360 = 322, then what is 322 - 322 in our timeline?");
		questions[7].setQuestionOption(new String[] {"0", "360", "420 Blaze It!", "322"});
		questions[7].setAnswer("A");
		
		questions[8].setQuestionName("If you were to predict, what would be your height now?");
		questions[8].setQuestionOption(new String[] {"100cm", "100m", "200cm", "1km"});
		questions[8].setAnswer("D");
		
		questions[9].setQuestionName("If there were 10 chairs in the class and someone stole one from you, how many chairs would you have left?");
		questions[9].setQuestionOption(new String[] {"1", "0", "9", "10"});
		questions[9].setAnswer("B");
		
		this.modu[0] = new QuizEduQuestions("Education", "Kidz Math", questions, 10, 0);
	}
	
	public void blancTrivia() {
		
		QuestionsEdu[] questions = new QuestionsEdu[13];
		
		for(int i = 0; i < 13; i+=1){
			questions[i] = new QuestionsEdu();
		}
		
		questions[0].setQuestionName("Blanc is also known as?");
		questions[0].setQuestionOption(new String[] {"Black Heart", "Purple Heart", "Green Heart", "White Heart", "Yellow Heart", "Iris Heart", "Blue Heart"});
		questions[0].setAnswer("D");
		
		questions[1].setQuestionName("What weapon does Blanc uses?");
		questions[1].setQuestionOption(new String[] {"War Hammer", "Rapier", "Sword", "Staff", "Dolls", "Cat Gloves", "Lance"});
		questions[1].setAnswer("A");

		questions[2].setQuestionName("What weapon does her HDD form uses?");
		questions[2].setQuestionOption(new String[] {"Odachi", "Galient Sword", "Staff", "Lance", "Cat Gloves", "Rapier", "Axe/Maul"});
		questions[2].setAnswer("G");
		
		questions[3].setQuestionName("How tall is Blanc?");
		questions[3].setQuestionOption(new String[] {"146cm", "144cm", "163cm", "158cm"});
		questions[3].setAnswer("B");
		
		questions[4].setQuestionName("How heavy is Blanc?");
		questions[4].setQuestionOption(new String[] {"27kg", "28kg", "36kg", "38kg", "39kg", "40kg", "43kg", "48kg"});
		questions[4].setAnswer("C");
		
		questions[5].setQuestionName("What are Blanc's sister(s) called?");
		questions[5].setQuestionOption(new String[] {"Black Sister", "White Sister", "Purple Sister", "Green Sister", "Yellow Sister", "Iris Sister", "Blue Sister", "She has none"});
		questions[5].setAnswer("B");
		
		questions[6].setQuestionName("What are Blanc's eye colors?");
		questions[6].setQuestionOption(new String[] {"Blue", "Magenta", "Purple", "Red", "Dark Pink", "Orange", "Green", "Teal"});
		questions[6].setAnswer("A");
		
		questions[7].setQuestionName("What are Blanc's eye colors in HDD form?");
		questions[7].setQuestionOption(new String[] {"Blue", "Magenta", "Purple", "Red", "Dark Pink", "Orange", "Green", "Teal"});
		questions[7].setAnswer("D");
		
		questions[8].setQuestionName("What's Blanc's hair colour?");
		questions[8].setQuestionOption(new String[] {"Black", "Brown", "Purple", "Blonde", "Blue", "Green", "White"});
		questions[8].setAnswer("B");
		
		questions[9].setQuestionName("What's Blanc's hair colour in HDD form?");
		questions[9].setQuestionOption(new String[] {"Black", "Brown", "Purple", "Blonde", "Blue", "Green", "White"});
		questions[9].setAnswer("E");
		
		questions[10].setQuestionName("Which console does Blanc represent?");
		questions[10].setQuestionOption(new String[] {"SEGA Neptune", "Playstation 2", "Playstation Vita", "Nitendo Wii", "Nitendo DS", "XBOX 360"});
		questions[10].setAnswer("D");
		
		questions[11].setQuestionName("What is Blanc's signature colour?");
		questions[11].setQuestionOption(new String[] {"White", "Green", "Black", "Purple", "Blue", "Yellow", "Red"});
		questions[11].setAnswer("A");
		
		questions[12].setQuestionName("What is Blanc's signature colour in Hyperdimension Neptunia Victory and ReBirth 3?");
		questions[12].setQuestionOption(new String[] {"White", "Green", "Black", "Purple", "Blue", "Yellow", "Red"});
		questions[12].setAnswer("G");
		
		this.modu[1] = new QuizEduQuestions("Trivia", "Blanc Trivia", questions, 13, 0);
	}
	
	public void Logics() {
		
		QuestionsEdu[] questions = new QuestionsEdu[10];
		
		for(int i = 0; i < 10; i++){
			questions[i] = new QuestionsEdu();
		}
		
		questions[0].setQuestionName("An apple falls on your head, what causes it?");
		questions[0].setQuestionOption(new String[] {"God", "My mother", "Gravity", "Perhaps its just heavy"});
		questions[0].setAnswer("C");
		
		questions[1].setQuestionName("An opposite gender person slaps you on the face,why is it so?");
		questions[1].setQuestionOption(new String[] {"She is pissed at you", "You pissed in your pants", "God did it", "You guys broke up"});
		questions[1].setAnswer("A");

		questions[2].setQuestionName("If your mass on earth is 50kg and your mass on the moon is one-sixth of it ,what is the magnitude of the algebraic term 3n?");
		questions[2].setQuestionOption(new String[] {"One-sixth of 3n", "Six times of 3n", "3", "n"});
		questions[2].setAnswer("C");
		
		questions[3].setQuestionName("If a zombie apocalypse were to happen, where is the safest place to be?");
		questions[3].setQuestionOption(new String[] {"Heaven", "Pluto", "My bedroom", "On a boat"});
		questions[3].setAnswer("D");
		
		questions[4].setQuestionName("Cray is a planet 5 lighyears away, assuming your blind what would be your distance from Cray?");
		questions[4].setQuestionOption(new String[] {"100km away", "I am blind I can't tell", "5 Light years", "Somewhere out there"});
		questions[4].setAnswer("C");
		
		questions[5].setQuestionName("Coding is for?");
		questions[5].setQuestionOption(new String[] {"My sister", "Programmmers", "Engineers", "Thiefs"});
		questions[5].setAnswer("B");
		
		questions[6].setQuestionName("Bob is 5kg what is his approximate age?");
		questions[6].setQuestionOption(new String[] {"10months", "5years", "God knows", "Is he dead?"});
		questions[6].setAnswer("A");
		
		questions[7].setQuestionName("If your mom is Asian and your dad is also Asian, what are you?");
		questions[7].setQuestionOption(new String[] {"Asian", "Black", "Yellow", "Batman"});
		questions[7].setAnswer("A");
		
		questions[8].setQuestionName("Congratulations your at question 9 did you find the previous questions helpful?");
		questions[8].setQuestionOption(new String[] {"Yes", "No", "This quiz is bad", "Rate 5/5"});
		questions[8].setAnswer("A");
		
		questions[9].setQuestionName("You're 15 years old and weight 55kg, if a bird could fly when its 1.5kg why can't you fly?");
		questions[9].setQuestionOption(new String[] {"Cause I am Asian", "I can fly", "I am not a bird", "I am not 1.5kg"});
		questions[9].setAnswer("C");
		
		this.modu[2] = new QuizEduQuestions("Education", "Logics", questions, 10, 0);
	}
	
	public void Chemistry() {
		
		QuestionsEdu[] questions = new QuestionsEdu[10];
		
		for(int i = 0; i < 10; i++){
			questions[i] = new QuestionsEdu();
		}
		
		questions[0].setQuestionName("The nucleus of an atom consists of");
		questions[0].setQuestionOption(new String[] {"electrons and neutrons", "electrons and protons", "protons and neutrons", "All of the above"});
		questions[0].setAnswer("C");
		
		questions[1].setQuestionName("The number of moles of solute present in 1 kg of a solvent is called its");
		questions[1].setQuestionOption(new String[] {"molality", "molarity", "normality", "formality"});
		questions[1].setAnswer("A");

		questions[2].setQuestionName("The most electronegative element among the following is");
		questions[2].setQuestionOption(new String[] {"sodium", "bromine", "fluorine", "oxygen"});
		questions[2].setAnswer("C");
		
		questions[3].setQuestionName("The metal used to recover copper from a solution of copper sulphate is");
		questions[3].setQuestionOption(new String[] {"Na", "Ag", "Hg", "Fe"});
		questions[3].setAnswer("D");
		
		questions[4].setQuestionName("The number of d-electrons in Fe2+ (Z = 26) is not equal to that of");
		questions[4].setQuestionOption(new String[] {"p-electrons in Ne(Z = 10)", "s-electrons in Mg(Z = 12)", "d-electrons in Fe(Z = 26)", "p-electrons in CI(Z = 17)"});
		questions[4].setAnswer("D");
		
		questions[5].setQuestionName("The metallurgical process in which a metal is obtained in a fused state is called");
		questions[5].setQuestionOption(new String[] {"smelting", "roasting", "calcinations", "froth floatation"});
		questions[5].setAnswer("A");
		
		questions[6].setQuestionName("The oldest rocks in the earth's crust were once molten, and came from deep inside the earth. The molten rock, called magma, spewed out in volcanic eruptions during the earth;s early life and solidified into hard rock's called");
		questions[6].setQuestionOption(new String[] {"granite", "basalt", "igneous rocks", "sedimentary rocks"});
		questions[6].setAnswer("C");
		
		questions[7].setQuestionName("Chemistry is spelled with a...");
		questions[7].setQuestionOption(new String[] {"S", "C", "E", "All of the above"});
		questions[7].setAnswer("D");
		
		questions[8].setQuestionName("Bob has 2mol of sulpuric acid with quantity of 50ml and James is 5 meters away, what will happen in 20 minutes?");
		questions[8].setQuestionOption(new String[] {"James dies", "Bob dies", "They become friends", "Thier distance increased 30 meters"});
		questions[8].setAnswer("A");
		
		questions[9].setQuestionName("Sulphur at room temperature is what color?");
		questions[9].setQuestionOption(new String[] {"Colourless", "White", "Yellow", "Don't try this at home"});
		questions[9].setAnswer("C");
		
		
		this.modu[3] = new QuizEduQuestions("Education", "Chemistry", questions, 10, 0);
	}
	
	public void AdvanceMaths() {
		
		QuestionsEdu[] questions = new QuestionsEdu[10];
		
		for(int i = 0; i < 10; i++){
			questions[i] = new QuestionsEdu();
		}
		
		questions[0].setQuestionName("a + a = b,b + a = b,what is b?");
		questions[0].setQuestionOption(new String[] {"a", "b", "ab", "none of the above"});
		questions[0].setAnswer("A");
		
		questions[1].setQuestionName("2kg of pure distiled water is poured into a tank assuming that every instance of 1 second 5cubic cetimeters of water spills, how much time to empty the tank?");
		questions[1].setQuestionOption(new String[] {"400 seconds", "40 seconds", "the tank spillage will be a exponetial graph(it will not reach0)", "Errm..no clue"});
		questions[1].setAnswer("A");

		questions[2].setQuestionName("40 times of a number is equal to 190 plus itself, what is that number?");
		questions[2].setQuestionOption(new String[] {"5", "10", "15", "20"});
		questions[2].setAnswer("B");
		
		questions[3].setQuestionName("2n + 2m(2nm) equals...");
		questions[3].setQuestionOption(new String[] {"6nm", "2n + 4nmm", "4nm + 4nm", "222nmm"});
		questions[3].setAnswer("B");
		
		questions[4].setQuestionName("Lowering electron value of 8hz will create a distubance to hearing, if the speakers were 12 feet away, how much is the magnitude of the entire galaxy?");
		questions[4].setQuestionOption(new String[] {"You will learn that in Quantum Physics", "4 to the power of 67billion light years", "God knows", "A googleplex"});
		questions[4].setAnswer("D");
		
		questions[5].setQuestionName("Obtaining 45 from 45nm is called...");
		questions[5].setQuestionOption(new String[] {"Solving", "Simplification", "Magnitudising", "Seperation"});
		questions[5].setAnswer("C");
		
		questions[6].setQuestionName("If 2 + 2n = 10, what is n?");
		questions[6].setQuestionOption(new String[] {"2", "4", "6", "5"});
		questions[6].setAnswer("B");
		
		questions[7].setQuestionName("Advance Maths differes from maths in which aspect?");
		questions[7].setQuestionOption(new String[] {"More relation and function", "Has the word advance", "More advance", "Only applicable to smart science stream students"});
		questions[7].setAnswer("B");
		
		questions[8].setQuestionName("Nullyfing the addition of 100 to 400 means...");
		questions[8].setQuestionOption(new String[] {"500", "450", "400", "0"});
		questions[8].setAnswer("C");
		
		questions[9].setQuestionName("Spontaneous decay cause Alluminium to lose half of its mass every 12 minutes, how heavy is the alluminium if it were to be 600grams in 108 minutes");
		questions[9].setQuestionOption(new String[] {"2.4kg", "7.2kg", "12.56kg", "36kg"});
		questions[9].setAnswer("D");
		
		
		this.modu[4] = new QuizEduQuestions("Education", "AdvanceMaths", questions, 10, 0);
	}
	
	public void Humanitism() {
		
		QuestionsEdu[] questions = new QuestionsEdu[10];
		
		for(int i = 0; i < 10; i++){
			questions[i] = new QuestionsEdu();
		}
		
		questions[0].setQuestionName("You're reading this question you're a...");
		questions[0].setQuestionOption(new String[] {"God", "Doll", "Human", "Atheist"});
		questions[0].setAnswer("C");
		
		questions[1].setQuestionName("You're mom has 3 children, you are probally...");
		questions[1].setQuestionOption(new String[] {"Her husband", "Her son", "Her Daughter", "Her Children"});
		questions[1].setAnswer("A");

		questions[2].setQuestionName("Jasmine has a little btother ,her bother's name is probally?");
		questions[2].setQuestionOption(new String[] {"Muhammad Khan", "Tok Bo Phu", "Duncan", "No,18"});
		questions[2].setAnswer("C");
		
		questions[3].setQuestionName("If you and your brother or sister copulated together, what would that make you?");
		questions[3].setQuestionOption(new String[] {"A human", "A joke", "A dad", "A mom"});
		questions[3].setAnswer("A");
		
		questions[4].setQuestionName("Humans evolved from apes, why do you have to learn maths?");
		questions[4].setQuestionOption(new String[] {"My mom told me to", "Its compulsary", "God knows", "Maths = Life"});
		questions[4].setAnswer("D");
		
		questions[5].setQuestionName("Your neighbour is robbed what is the right thing to do?");
		questions[5].setQuestionOption(new String[] {"Rob the following neighbour", "Post of facebook to get likes", "Laugh at your neighbour", "Pee on your porch"});
		questions[5].setAnswer("D");
		
		questions[6].setQuestionName("There is a gay couple in front of you, you should...");
		questions[6].setQuestionOption(new String[] {"Shout 'GAY'", "Congratulate him for being weird", "Slap him and say 'you blind bruh'", "Walk away"});
		questions[6].setAnswer("D");
		
		questions[7].setQuestionName("As humans we should ...");
		questions[7].setQuestionOption(new String[] {"Help one another", "Stay introvert", "Talk with ourselfs", "Suicide"});
		questions[7].setAnswer("A");
		
		questions[8].setQuestionName("Your sad you should...");
		questions[8].setQuestionOption(new String[] {"Jump down a clift"});
		questions[8].setAnswer("A");
		
		questions[9].setQuestionName("Why did she break up with me ?");
		questions[9].setQuestionOption(new String[] {"She is a gold digger", "She thinks I am her ATM", "She found out she is ugly", "Girls right...haih"});
		questions[9].setAnswer("D");
		
		
		this.modu[5] = new QuizEduQuestions("Education", "Humanitism", questions, 10, 0);
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
