package dayy14_Pattern;

public class pr5 
{
	public static void main(String[] args)
	{
		int num=10;
		int n=4;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=(n-i+1); j++)
			{
				System.out.print(num+" ");
			}
			num++;
			System.out.println();
		}
	}
}

//10 10 10 10 
//11 11 11 
//12 12 
//13 
