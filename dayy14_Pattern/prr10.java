package dayy14_Pattern;

public class prr10 
{
	public static void main(String args[])
	{
		int n=4;
		int num=2;
		for(int i=1; i<=4; i++)
		{
			num=num-1;
			for(int j=1; j<=(n-i+1); j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}

//1 2 3 4 
//4 5 6 
//6 7 
//7 
