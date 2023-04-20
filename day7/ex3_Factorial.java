package day7;

public class ex3_Factorial 
{
	public static void main(String[] args)
	{
		int n=10;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print("The factorial of the number "+n+" is ");
		System.out.println(fact);
	}
}
