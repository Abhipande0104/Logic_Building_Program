package day9;

/*
 * Write a program to print table of 12.
 */

public class ex7_TableOf12 
{
	public static void main(String[] rags)
	{
		System.out.println("Table of 12 is ");
		int n=12;
		int mul=1;
		for(int i=1; i<=10; i++)
		{
			mul=n*i;
			System.out.println(mul);
		}
	}
}
