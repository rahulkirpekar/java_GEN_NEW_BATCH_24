package oops.inhtopic.si;

// Impl class
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();//s1--[id,name,salary,dsgn,orgname]
		Employee e2 = new Employee();//s2--[id,name,salary,dsgn,orgname]
		Employee e3 = new Employee();//s3--[id,name,salary,dsgn,orgname]
		Employee e4 = new Employee();//s4--[id,name,salary,dsgn,orgname]
		Employee e5 = new Employee();//s5--[id,name,salary,dsgn,orgname]
		
		e1.scanData();
		e2.scanData();
		e3.scanData();
		e4.scanData();
		e5.scanData();
		
		e1.dispData();
		e2.dispData();
		e3.dispData();
		e4.dispData();
		e5.dispData();
	}
}
