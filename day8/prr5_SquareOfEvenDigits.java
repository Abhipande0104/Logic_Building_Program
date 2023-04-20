package day8;

/*
 * Write a program to print the square of even digits of the given number
 */

public class prr5_SquareOfEvenDigits 
{
	public static void main(String[] args)
	{
		int num=123456;
		System.out.print("The square of even digits of "+num +" is ");
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
			System.out.print(rem*rem+ " ");
			}
			num=num/10;
		}
	}
}

//The square of even digits of 123456 is 36 16 4 
