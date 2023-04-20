package day2;

public class ex7 
{
	public static void main(String[] args)
	{
		int num=101;
		
		if(num%3==0 && num%5==0)
		{
			System.out.println("Fizz-Buzz");
		}
		else if(num%3==0)
		{
			System.out.println("Fizz");
		}
		else if(num%5==0)
		{
			System.out.println("Buzz");
		}
		else 
		{
			System.out.println("Not divisible by both");
		}
	}
}

/*
 * Given an integer value as input
 * Print fizz if divisible by 3
 * Print buzz if divisible by 5
 * Print fizz-buzz if divisible by both 
 * If not then print "not divisible by both"
 */
