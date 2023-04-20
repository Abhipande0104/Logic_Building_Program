package day8;

/*
 * Write a program to count odd digits of the given number
 */

public class prr4_OddDigitCount
{
	public static void main(String[] args)
	{
		int n=6843513;
		int count=0;
		System.out.print("The count of odd digits in "+n+" is ");
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}

//The count of odd digits in 6843513 is 4
