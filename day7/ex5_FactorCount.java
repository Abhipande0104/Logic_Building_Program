package day7;

/*
 * Take n as input.Count all its factor and print count
 * Input=6
 * Output=4
 */

public class ex5_FactorCount
{
	public static void main(String[] args)
	{
		int n=16;
		int count=0;
		System.out.print("The number of factors of "+n+" are ");
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
