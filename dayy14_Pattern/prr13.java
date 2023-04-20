package dayy14_Pattern;

public class prr13 
{
	public static void main(String[] args)
	{
		int row=4;
		int n=10;
		for(int i=1; i<=row; i++)
		{
			int x=n;
			for(int j=1; j<=i; j++)
			{
				System.out.print(x+" ");
				x--;
			}
			n=x+1;
			System.out.println();
		}
	}
}

//10 
//10 9 
//9 8 7 
//7 6 5 4 
