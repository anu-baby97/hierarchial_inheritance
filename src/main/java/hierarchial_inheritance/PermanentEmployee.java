package hierarchial_inheritance;

public class PermanentEmployee extends Employee {

	private int salary;

	public void setSalary(int sal) {
		salary = sal;
	}

	public int getSalary() {
		calculateSalary();
		return salary;
	}

	public void calculateSalary() {
		salary = salary + 5000;
	}
}
