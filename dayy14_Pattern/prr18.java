package dayy14_Pattern;

public class prr18 
{
	public static void main(String[] args)
	{
		int row=4;
		int n=10;
		char ch='J';
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==1)
				{
					System.out.print(n+" ");
					n--;
					ch--;
				}
				else
				{
					System.out.print(ch+" ");
					n--;
					ch--;
				}
			}
			System.out.println();
		}
	}
}

//10 
//I H 
//7 6 5 
//D C B A 
