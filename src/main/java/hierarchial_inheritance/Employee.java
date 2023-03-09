package hierarchial_inheritance;

public class Employee {

	private String name;
	private int empid;
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void setID(int empid) {
		
		this.empid=empid;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return empid;
	}
	
	
}
