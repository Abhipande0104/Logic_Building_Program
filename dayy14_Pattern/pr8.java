package dayy14_Pattern;

public class pr8 
{
	public static void main(String[] rags)
	{
		char ch='J';
		int row=4;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}

//J 
//I H 
//G F E 
//D C B A 
