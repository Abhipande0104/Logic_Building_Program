package day7;

/*
 * Take n as input.Print odd integers from 1 to n.
 * Input=6
 * Output=1 3 5 
 */

public class ex2_Odd 
{
	public static void main(String[] args)
	{
		int n=6;
		System.out.println("The odd integers from 1 to "+n+" are ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}
