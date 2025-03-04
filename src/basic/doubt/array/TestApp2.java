package basic.doubt.array;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Array Declaration Part
	//	int a[] = new int[5];

		// Array Declaration with Initialisation Part
		int a[] = {50,40,30,20,10};
		
		System.out.println("a.length : " + a.length);
		
		// Ascensing order sorting
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = (i+1); j < a.length; j++) 
			{
				if (a[i] > a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j]  = temp;
				}// temp
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}