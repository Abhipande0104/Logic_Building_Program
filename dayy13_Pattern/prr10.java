package dayy13_Pattern;

public class prr10
{
	public static void main(String[] args)
	{
		for(int i=1; i<=6; i++)
		{
			char ch='F';
			int n=5;
			for(int j=1; j<=6; j++)
			{
				if(j%2==1)
				{
					System.out.print(ch+"  ");
					ch--;
					ch--;
				}
				else
				{
					System.out.print(n+"  ");
					n--;
					n--;
				}
			}
			System.out.println();
		}
	}
}

//F  5  D  3  B  1  
//F  5  D  3  B  1  
//F  5  D  3  B  1  
//F  5  D  3  B  1  
//F  5  D  3  B  1  
//F  5  D  3  B  1  
