
public class Modules {
	private String moduleName;
	private int moduleType[];
	
	public Modules(){
		moduleName = "";
		moduleType = new int[]{0,1};
	}
	
	public Modules(String moduleName, int moduleType[]){
		this.moduleName = moduleName;
		this.moduleType = moduleType;
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
	
	public String toString(){
		return "Module name\t:\t" +moduleName +"\nModule Type\t:\t1. "+moduleType[0] +" 2. " +moduleType[1];
	}
}
