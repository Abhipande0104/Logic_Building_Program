package dayy14_Pattern;

public class prr17 
{
	public static void main(String[] args)
	{
		int row=6;
		char ch='F';
		int n=1;
		for(int i=1; i<=row; i++)
		{
			char p=ch;
			for(int j=1; j<=i; j++) 
			{
				if(j%2==1)
				{
					System.out.print(p);
					System.out.print(" ");
					p++;
				}
				else
				{
					System.out.print(n+" ");
					n++;
				}
			}
			ch--;
			System.out.println();
		}
	}
}

//F 
//E 1 
//D 2 E 
//C 3 D 4 
//B 5 C 6 D 
//A 7 B 8 C 9 
