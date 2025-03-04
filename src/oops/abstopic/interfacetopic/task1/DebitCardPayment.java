package oops.abstopic.interfacetopic.task1;

public class DebitCardPayment implements Payment
{
	private String cardNumber;
	
	public DebitCardPayment(String cardNumber) 
	{
		this.cardNumber  = cardNumber;
	}
	
	@Override
	public void pay(double amount) 
	{
		  System.out.println("Paid " + amount + " using Debit Card: " + cardNumber);
	}
}
