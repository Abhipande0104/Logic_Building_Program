package dayy13_Pattern;

public class pr9 
{
	public static void main(String[] args)
	{
		int num=1;
		for (int i=1; i<=3; i++)
		{
			char x='C';
			int y=3;
			for(int j=1; j<=3; j++)
			{
				System.out.print((num*num));
				System.out.print(x);
				System.out.print(y);
				System.out.print(" ");
				num++;
				x--;
				y--;
			}
			System.out.println();
		}
	}
}

//1C3  4B2  9A1 
//16C3 25B2 36A1 
//49C3 64B2 81A1 
