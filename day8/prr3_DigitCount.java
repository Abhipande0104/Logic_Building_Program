package day8;

/*
 * Write a program to count the digits of the given number
 */

public class prr3_DigitCount
{
	public static void main(String args[])
	{
		int n=985632;
		int count=0;
		System.out.print("The number of digits in "+n+" is ");
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}

//The number of digits in 985632 is 6
