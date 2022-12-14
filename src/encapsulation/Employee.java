package encapsulation;

public class Employee {
	
	String name;
	private double sal;

	Employee(String n, double s)
	{
		this.name=n;
		this.sal=s;
	}
	public double getSal()
	{
		return this.sal;
	}
	
	public void setSal(double s)
	{
		this.sal=s;
	}
	
}
