package day6;

public class ex2_Factorial 
{
	public static void main(String[] args)
	{
		int i=1;
		int n=4;
		int fact=1;
		System.out.println("The factorial of "+n+" is");
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}
