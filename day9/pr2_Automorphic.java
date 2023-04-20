package day9;

/*
 * Write a program to print automorphic number.
 */

public class pr2_Automorphic 
{
	public static void main(String[] rags)
	{
		int n=376;
		int sqr=n*n;
		int temp=n;
		int count=0;
		
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		
		int rem1=0;
		for(int i=01; i<=count; i++)
		{
			rem1=rem1*10+(sqr%10);
			sqr=sqr/10;
		}
		
		int rem2=0;
		for(int i=01; i<=count; i++)
		{
			rem2=rem2*10+(rem1%10);
			rem1=rem1/10;
		}
		
		if(temp==rem2)
		{
			System.out.println("automorphic");
		}
		else
		{
			System.out.println("No");
		}
	}
}
