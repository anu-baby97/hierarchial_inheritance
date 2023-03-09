package hierarchial_inheritance;

public class HierarchialInheritance {

	public static void main(String[] args) {
		PermanentEmployee pe =new PermanentEmployee();
		pe.setName("Anu");
		pe.setID(145);
		pe.setSalary(6000);
		
		System.out.println("Name: "+pe.getName());
		System.out.println("ID: "+pe.getID());
		System.out.println("Salary before increment: "+pe.getSalary());
		pe.calculateSalary();
		System.out.println("Salary after increment: "+pe.getSalary());
		
		ContractEmployee ce = new ContractEmployee();
		ce.setName("Mini");
		ce.setID(789);
		ce.setPayrollCompany("XYZ");
		ce.setSalary(5000);
		
		System.out.println("Name: "+ce.getName());
		System.out.println("ID: "+ce.getID());
		ce.display();
	}

}
