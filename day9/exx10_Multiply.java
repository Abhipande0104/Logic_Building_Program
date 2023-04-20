package day9;

/*
 * Write a program to print the multiplication of first 10 numbers.
 */

public class exx10_Multiply
{
	public static void main(String[] rags)
	{
		int n=10;
		int mul=1;
		System.out.print("The multiplication of first "+n+" numbers are ");
		for(int i=1; i<=n; i++)
		{
			mul=mul*i;
		}
		System.out.println(mul);
	}
}
