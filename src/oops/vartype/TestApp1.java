package oops.vartype;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// JVM - Default Construtcor
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();

		System.out.println(s1.rno+" " + s1.name+" " + s1.std+"----"+s1);
		System.out.println(s2.rno+" " + s2.name+" " + s2.std+"----"+s2);
		System.out.println(s3.rno+" " + s3.name+" " + s3.std+"----"+s3);
		
		// local variable
//		int no1,no2,ans;
		
//		no1=20;
//		no2=10;
		
//		ans = no1 + no2;

//		System.out.println("Addition : " + ans);
		
	}
}
