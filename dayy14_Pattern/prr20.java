package dayy14_Pattern;

public class prr20 
{
	public static void main(String[] args)
	{
		int row=4;
		int n=1;
		for(int i=1; i<=row; i++)
		{
			int x=n;
			for(int j=1; j<=i; j++)
			{
				if(x%2==1)
				{
					System.out.print((x*x)+" ");
				}
				else
				{
					System.out.print((x*x*x)+" ");
				}
				x++;
			}
			n++;
			System.out.println();
		}
	}
}

//1 
//8 9 
//9 64 25 
//64 25 216 49 
