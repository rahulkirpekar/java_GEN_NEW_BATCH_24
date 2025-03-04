package oops.thissuper;

public class TechEmployee extends Employee
{
	int salary;
	
	public TechEmployee(int id, String name, String dsgn, String orgname,int salary) 
	{
		super(id, name, dsgn,orgname);
		this.salary = salary;
	}
	public void disp() 
	{
		System.out.println(id+" " + name+" " + dsgn +" " + orgname+" " + salary);
	}
	
	public static void main(String[] args) 
	{
		TechEmployee e1 = new TechEmployee(1, "ABC", "SE", "Google",1000);

		e1.disp();
	}
}
