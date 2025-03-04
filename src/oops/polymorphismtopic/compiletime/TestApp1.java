package oops.polymorphismtopic.compiletime;

//  Method Overloadding--CompileTime---compiler
// TestApp1---3-4 developer
public class TestApp1 
{
	public static void addFun(short no1,short no2) 
	{
		System.out.println("short--TwoArgs--addFun(short no1,short no2) : " + (no1+no2));
	}

	public static void addFun(long no1,long no2) 
	{
		System.out.println("long--TwoArgs--addFun(long no1,long no2) : " + (no1+no2));
	}
	
	public static void addFun(int no1,int no2,int no3) 
	{
		System.out.println("ThreeArgs--addFun(int no1,int no2,int no3) : " + (no1+no2+no3));
	}
	
	public static void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("int--FourArgs--addFun(int no1,int no2,int no3,int no4) : " + (no1+no2+no3+no4));
	}
	
	public static void addFun(double no1,double no2,double no3,double no4) 
	{
		System.out.println("double--FourArgs--addFun(double no1,double no2,double no3,double no4) : " + (no1+no2+no3+no4));
	}
	
	public static void main(String[] args) 
	{
		// logic---2 value
		TestApp1.addFun(10, 20); 
		
		// logic---3 value
		TestApp1.addFun(10, 20, 30); 
		
		// logic---4 value
//		TestApp1.addFun(10.43, 20.343443, 30.344,40.3435); 
		
		
		TestApp1.addFun('a', 'b');
//		TestApp1.addFun(10, 20);
		
		
	}
}


/* Method Overloadding Rules:-
 * ***************************
 * 1) excat argument count
 * 2) excat datatype type
 * 3) Type pramotion rule
 * 
   						Type pramotion rule
   						-----------------------
boolean--X

   				byte
   				 |
   				short
   				 |   				
   	char------->int
   				 |   				
   				long
   				 |   				   				
   				float
   				 |   				   				
   				double
   				  	
   						
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 */
























