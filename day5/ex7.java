/*
 * Given an integer n. Print sum of all its digit
 * Input :- 6531
 * Output :- 15
 */

package day5;

public class ex7 
{
	public static void main(String[] args)
	{
		int n=968;
		int rem;
		int sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("The addition of the digits are "+sum);
	}
}
