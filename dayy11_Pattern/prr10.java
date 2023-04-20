package dayy11_Pattern;

public class prr10 
{
	public static void main(String[] args)
	{
		int x=1;
		for(int i=1; i<=4; i++)
		{
			int y=x;
			for(int j=1; j<=4; j++)
			{
				System.out.print(y+" ");
				y++;
			}
			x++;
			System.out.println("");
		}
	}
}

//1 2 3 4 
//2 3 4 5 
//3 4 5 6 
//4 5 6 7 
