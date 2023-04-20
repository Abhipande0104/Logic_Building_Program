package day7;

/*
 * Take n as input.Print from 1 to n.
 * Input=5
 * Output=1 2 3 4 5
 */

public class ex1_Print
{
	public static void main(String[] args)
	{
		int n=5;
		System.out.println("The integers from 1 to "+n+" are ");
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+i);
		}
	}
}
