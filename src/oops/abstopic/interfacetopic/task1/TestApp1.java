package oops.abstopic.interfacetopic.task1;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		
		System.out.println("1) For CreditCardPayment ");
		System.out.println("2) For DebitCardPayment ");
		System.out.println("3) For UpiPayment ");
		int choice = sc.nextInt();
		
		Payment paymentBy = null;
		
		switch(choice) 
		{
			case 1: System.out.println("Enter Amount : ");	
					int amount = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter CreditCard Number: ");	
					String cardNumber = sc.nextLine();
					
					paymentBy = new CreditCardPayment(cardNumber);
					paymentBy.pay(amount);
					
					break;
					
			case 2: System.out.println("Enter Amount : ");	
					amount = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter DebitCard Number: ");	
					cardNumber = sc.nextLine();
				
					paymentBy = new DebitCardPayment(cardNumber);
					paymentBy.pay(amount);
					break;
					
			case 3:	System.out.println("Enter Amount : ");	
					amount = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter UPI Id : ");	
					String upiId = sc.nextLine();
					
					paymentBy = new UpiPayment(upiId);
					paymentBy.pay(amount);
					break;
		}
	}
}
