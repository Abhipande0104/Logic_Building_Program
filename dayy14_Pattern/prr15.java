package dayy14_Pattern;

public class prr15 
{
	public static void main(String[] args)
	{
		int row=4;
		int n=4;
		char ch='A';
		for(int i=1; i<=row; i++)
		{
			char x=ch;
			for(int j=1; j<=(n-i+1); j++)
			{
				System.out.print(x+" ");
				x++;
			}
			ch++;
			System.out.println();
		}
	}
}

//A B C D 
//B C D 
//C D 
//D 
