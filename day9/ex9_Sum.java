package day9;

/*
 * Write a program to print sum of first 10 numbers.
 */

public class ex9_Sum 
{
	public static void main(String[] args)
	{
		int n=10;
		int sum=0;
		System.out.print("The sum of first 10 numbers are ");
		for(int i=1; i<=n; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
