package dayy14_Pattern;

public class pr7
{
	public static void main(String[] args)
	{
		int row=6;
		char x='F';
		for(int i=1; i<=row; i++)
		{
			char y=x;
			for(int j=1; j<=i; j++)
			{
				System.out.print(y+" ");
				y++;
			}
			x--;
			System.out.println();
		}
	}
}

//F 
//E F 
//D E F 
//C D E F 
//B C D E F 
//A B C D E F 
