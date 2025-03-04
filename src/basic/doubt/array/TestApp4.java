package basic.doubt.array;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		int a[] = new int[20];
		
		int l=1,count=0,no;
		
		for (int i = 0; i < a.length; ) 
		{
			no = l;
			for(int j = 1 ; j <= no ; j++) 
			{
				if(no%j==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				a[i] = no;
				i++;
			}
			count=0;
			l++;
		}
		for (int i = 0; i < a.length; i++) 
		{	
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}
