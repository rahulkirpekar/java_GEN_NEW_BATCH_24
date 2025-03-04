package oops.thissuper;

public class Employee 
{
	int id;
	String name,dsgn,orgname;

	public Employee() 
	{
		System.out.println("Employee :: Default Constructor");
	}
	public Employee(int id,String name) 
	{
		this();
		this.id=id;
		this.name=name;
	}
	public Employee(int id,String name,String dsgn) 
	{
		this(id, name);
		this.dsgn=dsgn;
	}
	public Employee(int id,String name,String dsgn,String orgname) 
	{
		this(id,name,dsgn);
		this.orgname=orgname;
	}
	public static void main(String[] args) 
	{
		
		
	}
}