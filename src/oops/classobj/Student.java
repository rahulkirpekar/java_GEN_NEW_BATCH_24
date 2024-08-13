public class Student
{
	// 1) Data Members--data--store

	int rno,std;
	String name;
	

	// 2) Constructors

	// 3) member Function


	// 4) define  main function
	public static void main(String args[])
	{
		Student obj = new Student();

		System.out.println("obj===>"+obj);


		obj.rno=1;
		obj.name="rahul";
		obj.std=12;

		System.out.println(obj.rno+" " + obj.name+" " + obj.std);		

/*
		Student ---DataType(ClassName)
		obj -------Reference Variable(Pointer Varibale)
			obj ---> store (object Address---HEAP)

		new---JVM--Signal---create object---HEAP	
	
		Student---object
*/
	}
}