package AccessModifier;

public class Employee {
	
	
	String companyName;
	public String empName;
	public String empId;
	private double empSal;
	protected long mobileNo;
	
	
	Employee(String cName, String eName, String eId, double eSal, long no)
	{
		this.companyName=cName;
		this.empName=eName;
		this.empId=eId;
		this.empSal=eSal;
		this.mobileNo=no;		
	}
	
	

}
