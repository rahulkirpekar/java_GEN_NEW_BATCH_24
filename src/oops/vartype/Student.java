package oops.vartype;

public class Student 
{
	// Data Members----->Instance Variables
	int rno;
	String name;
	int std;
	
	// Default Constructor
	Student()
	{
		System.out.println("START :: Default Constructor---"+this);
//		System.out.println(rno +" " + name+" "+std ) ;
		
		rno=1;
		name="rahul";
		std=12;

//		System.out.println(rno +" " + name+" "+std ) ;
		System.out.println("EXIT :: Default Constructor");
	}
}
