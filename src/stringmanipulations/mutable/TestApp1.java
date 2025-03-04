package stringmanipulations.mutable;

public class TestApp1 
{
	public static void main(String[] args)
	{
/*		
	// -----Mutable Behavior-----	
//		StringBuilder sb = new StringBuilder("royal");
		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb+"--"+sb.hashCode());
		sb.append(" technosoft");
		System.out.println(sb+"--"+sb.hashCode());
*/		
		// -----Immutable Behavior-----	
		String name1 = "royal";
		String name2 = "techno";
		
		System.out.println(name1+"-----"+name1.hashCode());
		
//		name1+name2;	//
		//royaltechnosoft
		name1 = name1.concat(name2);
		
		System.out.println(name1+"-----"+name1.hashCode());
	}
}
