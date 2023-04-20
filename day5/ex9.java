/*
 * Take an integer n as input. Print perfect squares till n
 * Input :- 30
 * Output :- 1  4  9  16  25 
 */

package day5;

public class ex9 
{
	public static void main(String[] rags)
	{
		int n=1000;
		int i=1;
		
		while(i*i<=n)
		{
			System.out.println(i*i);
			i++;
		}
	}
}
