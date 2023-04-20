package day7;

/*
 *Take n as input.Print all its factor
 *Input=24
 *Output=1 2 3 4 6 8 12 24 
 */

public class ex4_Factor 
{
	public static void main(String[] rags)
	{
		int n=24;
		System.out.println("The factors of "+n+" are ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
