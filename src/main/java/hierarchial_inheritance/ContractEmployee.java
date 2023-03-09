package hierarchial_inheritance;

public class ContractEmployee extends Employee{

	private int salary;
	private String payrollCompanyString;
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setPayrollCompany(String payrollCompanyString) {
		this.payrollCompanyString=payrollCompanyString;
	}
	
	public int getSalary() {
		
		return salary;
	}
	
	public String getPayrollCompany() {
		
		return payrollCompanyString;
	}
	
	public void calculateSalary() {
		salary = salary + 2000;	
	}
	
	public void display() {
		System.out.println("Contract Salary before increment: "+getSalary());
		calculateSalary();
		System.out.println("Contract Salary after increment: "+getSalary());
		System.out.println("Payroll Company: "+getPayrollCompany());
	}
}