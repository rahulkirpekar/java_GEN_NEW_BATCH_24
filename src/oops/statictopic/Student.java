package oops.statictopic;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	static String schoolName;
	
	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std +" " + schoolName);
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName("DPS");
		
//		Student s1 = new Student();//s1  -- [rno,name,std]
//		Student s2 = new Student();//s2  -- [rno,name,std]
//		Student s3 = new Student();//s3  -- [rno,name,std]
//		Student s4 = new Student();//s4  -- [rno,name,std]
//		Student s5 = new Student();//s5  -- [rno,name,std]

//		s1.scanData();
//		s2.scanData();
//		s3.scanData();
//		s4.scanData();
//		s5.scanData();
//		
//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
//		s4.dispData();
//		s5.dispData();
		
		
		
		
		// Staticway---static property Initialise
//		Student.schoolName = "DPS";
//		System.out.println("s1.schoolName : "+s1.schoolName);
//		System.out.println("s2.schoolName : "+s2.schoolName);
//		System.out.println("s3.schoolName : "+s3.schoolName);
//		System.out.println("s4.schoolName : "+s4.schoolName);
//		System.out.println("s5.schoolName :  "+s5.schoolName);
//		s2.schoolName = "ABC School";
//		System.out.println("s1.schoolName : "+s1.schoolName);
//		System.out.println("s2.schoolName : "+s2.schoolName);
//		System.out.println("s3.schoolName : "+s3.schoolName);
//		System.out.println("s4.schoolName : "+s4.schoolName);
//		System.out.println("s5.schoolName :  "+s5.schoolName);
		
	}
}
