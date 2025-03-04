package basic.doubt.array;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Java type [array as Object]
		
		int a[] = new int[5];
		 
//		 int[] a = new int[5];
//		 int []a = new int[5];
//		 int [] a = new int[5];

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}

		for (int i = (a.length-1); i >=0; i--) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}

		 
		 
//----------------------------------------------------------------		 
//		 System.out.println("a.length : " + a.length);
//		 String name = "royal";
//		 name.length();
//		 String w[] = new String[5];
//		 System.out.println(w.length);// 5
//		 w[0] = "royal";
//		 System.out.println(w[0].length());

		 
		 
		 
		 
	}
}
