package oops.inhtopic.constructortopic;

public class C extends B
{
	int no3;
	
	public C() 
	{
		no3=30;
		System.out.println("C() : no3 : "  + no3);
	}
	public static void main(String[] args) 
	{
		C obj = new C();
		
		System.out.println("In Main : ");
		System.out.println("       obj.no1 : " + obj.no1);
		System.out.println("       obj.no2 : " + obj.no2);
	}
}
