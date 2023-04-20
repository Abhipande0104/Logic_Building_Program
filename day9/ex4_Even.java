package day9;

/*
 * Write a program to print even numbers from 1-100.
 */

public class ex4_Even 
{
	public static void main(String[] args)
	{
		System.out.println("Even numbers from 1-100 are ");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
