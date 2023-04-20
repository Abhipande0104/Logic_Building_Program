package day8;

/*
 * Write a program to calculate the factorial of given number
 */

public class prr2_Factorial
{
	public static void main(String[] args)
	{
		int num=5;
		int i=1;
		int fact=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.print("The factorial of "+num+" is ");
		System.out.println(fact);
	}
}

//The factorial of 5 is 120
