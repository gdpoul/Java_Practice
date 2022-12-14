package Inheritance;

public class Employee extends Member {

	String specialization;

	Employee(String n, int a, long no, String add, double s, String spe) {
		this.name = n;
		this.age = a;
		this.phone_No = no;
		this.address = add;
		this.sal = s;
		this.specialization=spe;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Rahul", 24, 9876543210l, "Pune", 30000.0, "Manual Testing");
           emp1.printSal();
           
        Employee emp2 = new Employee("Raj",25,9234576849l,"Benguluru",350000.0,"API Testing");
        emp2.printSal();
	}

}
