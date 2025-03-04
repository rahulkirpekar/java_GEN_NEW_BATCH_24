package exceptiontopic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		
		try 
		{
			TestApp3.isValidForVote(age);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("General Statements");
	}
}
