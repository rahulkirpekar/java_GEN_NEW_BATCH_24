package exceptiontopic;
import java.util.Scanner;
public class TestApp3 
{
	public static  void isValidForVote(int age)// throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise Exception---User Defined Exception  
			throw new InvalidAgeException("\nInvalid Age,\n\tPlease enter age greater than 18");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		
		try 
		{
			TestApp3.isValidForVote(age);
		}catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("General Statements");
	}
}
