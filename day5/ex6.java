/*
 * Given an integer. Print all its digit
 * Input :- 6531
 * Output :- 1
 * 			 3
 * 			 5
 * 			 6
 */

package day5;

public class ex6
{
	public static void main(String[] args)
	{
		int n=6531;
		while(n!=0)
		{
			System.out.println(n%10);
			n=n/10;
		}
	}
}
