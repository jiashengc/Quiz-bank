
public class QuestionsFun {
	private String questionName[];
	private String role;
	private int roleNum[];
	private boolean played;
	
	public QuestionsFun(){	
		questionName = new String[]{};
		role = "";
		roleNum = new int[]{};
		played = false;
	}
	
	public QuestionsFun(String questionArray[], String role, int roleNum[], boolean played){
		this.questionName = questionArray;
		this.role = role;
		this.roleNum = roleNum;
		this.played = played;
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
	
	public boolean isPlayed() {
		return played;
	}

	public void setPlayed(boolean played) {
		this.played = played;
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