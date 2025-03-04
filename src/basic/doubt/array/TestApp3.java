package basic.doubt.array;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Value you want to Search in Arrray : ");
		int searchValue = sc.nextInt();
		boolean flag  = true;
		int count = 0 ;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] == searchValue) 
			{
				System.out.println("A["+i+"] : " + a[i]);
				flag  = false;
				count++;
			} 			
		}
		if (flag) 
		{
			System.out.println(searchValue+" not found in Array");
		}else 
		{
			System.out.println(searchValue+" found in Array "+count+" times.");
		}
	}
}