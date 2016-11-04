
public class Modules {
	private String moduleType;
	private String moduleName;
	public Result results[];
	
	public Modules(){
		moduleType = "";
		results = new Result[]{};
	}
	
	public Modules(String moduleType, Result results[]){
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
	
	public Result[] getResult(){
		return results;
	}
	
	public void setResult(Result results[]){
		this.results = results;
	}
	
	public String toString(){
		return "Module Type\t:\t"+moduleType;
	}
}
