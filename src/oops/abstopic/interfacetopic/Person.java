package oops.abstopic.interfacetopic;

public interface Person 
{
/*	
	interface(100%	Abstraction):-
	--------------------------------
		1) Dm's---[public static final]---constant variables
	

		2) Mf's:-
		----------
			1) Abstract Methods---[public abstract]
			2) Non-Abstract Methods
				Java_8+
					==>static method(8th version)
					==>default method(8th version)
				java_9+
					==>static method
					==>default method
					==>private method(9th version)
					
					
*/
//	1) Dm's---[public static final]---constant variables
	public static final int NO = 10;//public static final

//	2) Mf's:-
//	----------
//		1) Abstract Methods---[public abstract]
		void getBehave();// [public abstract]  
	
	
//		2) Non-Abstract Methods
//			Java_8+
//				==>static method(8th version)
		static void testStatic() 
		{
			System.out.println("Person -- static method---testStatic()");
		}		
//				==>default method(8th version)
		
		default void testDefault() 
		{
			System.out.println("Person -- default method---testDefault()");
			testPrivate(); 
		}		
//			java_9+
//				==>static method
//				==>default method
//				==>private method(9th version)
		private void testPrivate() 
		{
			System.out.println("Person -- private method---testPrivate()");
		}		
}