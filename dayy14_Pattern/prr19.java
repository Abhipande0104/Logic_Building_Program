package dayy14_Pattern;

public class prr19 
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
				if(j%2==1)
				{
					System.out.print((y*y*y)+" ");
				}
				else
				{
					System.out.print((y*y)+" ");
				}
				y++;
			}
			x++;
			System.out.println();
		}
	}
}

//1 
//8 9 
//27 16 125 
//64 25 216 49 
