package oops.thissuper;

public class Student extends Person
{
	int rno;
	String name;
	int std;
	
	public Student() 
	{
		
	}
	public Student(int rno,String name,int std) 
	{
	// dms    local variable
		this.rno = rno;
		super.name = name;
		this.std = std;
	}

	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std);
	}
	public static void main(String[] args) 
	{
		Student s= new Student(1, "rahul", 12);
		
		s.disp();
		
//		Student---[rno name std]
		
	}

}
