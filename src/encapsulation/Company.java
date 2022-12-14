package encapsulation;

public class Company {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Akash",15000.0);
		
		// get the saray of employee
		System.out.println("salary is :"+emp1.getSal());
		
		//set the salary of employee
		emp1.setSal(20000.5);
		
		System.out.println("updated salary is: "+emp1.getSal());
		
	}

}
