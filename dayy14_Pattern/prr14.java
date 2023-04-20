package dayy14_Pattern;

public class prr14 
{
	public static void main(String[] args)
	{
		int row=4;
		int n=4;
		int num=1;
		for(int i=1; i<=row; i++)
		{
			int x=num;
			for(int j=1; j<=(n-i+1); j++)
			{
				System.out.print(x+" ");
				x++;
			}
			num++;
			System.out.println();
		}
	}
}

//1 2 3 4 
//2 3 4 
//3 4 
//4 
