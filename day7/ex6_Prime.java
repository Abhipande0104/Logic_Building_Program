package day7;

/*
 * Take integer n as input.Print whether n is prime number or not
 * Input=5		Output = prime
 * Input=8		Output = not prime
 */

public class ex6_Prime 
{
	public static void main(String[] rags)
	{
		int n=255;
		int count=0;
		System.out.print("The number "+n+" is ");
		for(int i=01;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}
