package dayy14_Pattern;

public class prr16 
{
	public static void main(String[] args)
	{
		int row=4;
		int x=1;
		for(int i=1; i<=row; i++)
		{
			int y=x;
			for(int j=1; j<=i; j++)
			{
				System.out.print(y+" ");
				y++;
			}
			x++;
			System.out.println();
		}
	}
}

//1 
//2 3 
//3 4 5 
//4 5 6 7 
