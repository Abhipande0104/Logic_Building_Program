package dayy13_Pattern;

public class pr8 
{
	public static void main(String[] args)
	{
		char x='A';
		char y='b';
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if (j%2==1)
				{
					System.out.print(x+" ");
					x++;
					x++;
				}
				else
				{
					System.out.print(y+" ");
					y++;
					y++;
				}
			}
			System.out.println();
		}
	}
}

//A b C d 
//E f G h 
//I j K l 
//M n O p 
