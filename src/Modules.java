import java.util.ArrayList;

public abstract  class Modules {
	private String moduleType;
	private String moduleName;
	private ArrayList<Result> results = new ArrayList<Result>();
	
	// Produce all constructor, overloaded constructor, and all setter and getters.
	public Modules(){
		moduleType = "";
	}
	
	public Modules(String moduleType, ArrayList<Result> results){
		this.moduleType = moduleType;
		this.results = results;
	}
	
	public String getModuleType(){
		return moduleType;
	}
	
	public void setModuleType(String moduleType){
		this.moduleType = moduleType;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public ArrayList<Result> getResult(){
		return results;
	}
	
	public void setResult(ArrayList<Result> results){
		this.results = results;
	}
	
	public String toString(){
		return "Module Type\t:\t"+moduleType;
	}
	
	public abstract void showAnswer();
}
