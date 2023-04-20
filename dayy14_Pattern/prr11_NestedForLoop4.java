package dayy14_Pattern;

public class prr11_NestedForLoop4 
{
	public static void main(String[] a)
	{
		int row=4;
		int n=10;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("C2W");
				System.out.print(n+"  ");
				n--;
			}
			System.out.println();
		}
	}
}

//C2W10  
//C2W9  C2W8  
//C2W7  C2W6  C2W5  
//C2W4  C2W3  C2W2  C2W1  
