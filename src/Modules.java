
public class Modules {
	private String moduleName;
	private int moduleType[];
	private int score;
	private Result[] results = new Result[20];
	
	public String showResult(){
		String tmp = "";
		for(int i=0 ; i<results.length;i+=1){
			tmp += "Attempt "+(i+1)+"\t:\t"+results.toString();
		}
		return tmp;
	}
	
	public Modules(){
		moduleName = "";
		moduleType = new int[]{0,1};
		score = 0;
	}
	
	public Modules(String moduleName, int moduleType[], int score){
		this.moduleName = moduleName;
		this.moduleType = moduleType;
		this.score = score;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int[] getModuleType() {
		return moduleType;
	}

	public void setModuleType(int moduleType[]) {
		this.moduleType = moduleType;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	
	public String toString(){
		return "Module name\t:\t" +moduleName +"\nModule Type\t:\t1. "+moduleType[0] +" 2. " +moduleType[1];
	}
}
