package day9;

/*
 * Write a program to print odd numbers from 1-50.
 */

public class ex5_Odd 
{
	public static void main(String[] args)
	{
		System.out.println("Odd numbers from 1-50 are ");
		for(int i=1;i<=50;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}
