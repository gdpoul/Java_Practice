package Inheritance;

public class Manager extends Member{
	
	String department;
	Manager(String n, int a, long no, String add, double s, String dept) {
		this.name = n;
		this.age = a;
		this.phone_No = no;
		this.address = add;
		this.sal = s;
		this.department=dept;
		
	}
	public static void main(String[] args) {
		
		Manager mgr1=new Manager("Smith",35,1234567890l,"Delhi",50000.0,"QA");
		mgr1.printSal();
		Manager mgr2=new Manager("Allen",50,1234567890l,"Chennai",100000.0,"R&D");
		mgr2.printSal();
	}

}
