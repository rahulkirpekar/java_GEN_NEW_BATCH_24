package pack1;

// import java.util.Scanner;

public class Student
{
	private int rno;
	private String name;
	private int std;
	
	public void scanData()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData()
	{
		System.out.println(rno+" " + name+ " " + std);
	}

	public static void main(String args[])
	{
		Student s = new Student();

		s.scanData();
		s.dispData();	
	}
}