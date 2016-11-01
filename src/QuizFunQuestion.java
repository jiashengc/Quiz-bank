
public class QuizFunQuestion extends Modules {
	private String questionName[];
	private String role;
	private int roleNum[];
	
	public QuizFunQuestion(){
		questionName = new String[]{};
		role = "";
		roleNum = new int[]{};
	}
	
	public QuizFunQuestion(String questionArray[], String role, int roleNum[] ){
		this.questionName = questionArray;
		this.role = role;
		this.roleNum = roleNum;
	}
	
	public String[] getQuestionArray() {
		return questionName;
	}
	
	public void setQuestionArray(String questionArray[]) {
		this.questionName = questionArray;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int[] getRoleNum() {
		return roleNum;
	}

	public void setRoleNum(int roleNum[]) {
		this.roleNum = roleNum;
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
		return super.toString()+"\nQuestion name\t:\t" +tmpName;
	}
}
