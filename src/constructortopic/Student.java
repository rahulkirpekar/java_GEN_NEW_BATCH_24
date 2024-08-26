package constructortopic;

public class Student 
{
	int rno;
	String name;
	int std;
//	
//	// Default Constructor
//	Student()
//	{
//		rno = 1;
//		name="rahul";
//		std=12;
//	}
	
	Student(int rno,String name)
	{
		System.out.println("START :: Student :: TWO--para constructor");
		this.rno = rno;
		this.name = name;
		System.out.println("EXIT :: Student :: TWO--para constructor");
	}
	
	// Para Constructor---Three
//	Student(int rno,String name,int std)
//	{
//		System.out.println("START :: Student :: para constructor");
//		this.rno = rno;
//		this.name = name;
//		this.std = std;
//		System.out.println("EXIT :: Student :: para constructor");
//	}
	
	// Copy Constructor
//	Student(Student s)
//	{
//		System.out.println("START :: Student :: COPY constructor");
//
//	//  s2 <---s1 	
//		rno = s.rno;
//		name = s.name;
//		std = s.std;
//		System.out.println("EXIT :: Student :: COPY constructor");
//
//	}
	public void disp() 
	{
		System.out.println(rno+ "---"+name+"---"+std);
	}
}
