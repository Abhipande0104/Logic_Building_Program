package day9;

/*
 * Write a program to print composite number
 */

public class pr1_Composite 
{
	public static void main(String[] rags)
	{
		int n=1;
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==1)
		{
			System.out.println("Not composite not prime");
		}
		else if(count==2)
		{
			System.out.println("Not Composite");
		}
		else
		{
			System.out.println("Composite number");
		}
	}
}
