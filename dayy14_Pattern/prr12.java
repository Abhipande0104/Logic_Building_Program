package dayy14_Pattern;

public class prr12 
{
	public static void main(String[] rags)
	{
		int x=1;
		for(int i=1; i<=5; i++)
		{
			int y=x;
			for(int j=1; j<=i; j++)
			{
				System.out.print(y+" ");
				y++;
			}
			x=y+1;
			System.out.println();
		}
	}
}

//1 
//3 4 
//6 7 8 
//10 11 12 13 
//15 16 17 18 19 
