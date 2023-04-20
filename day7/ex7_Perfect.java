package day7;

public class ex7_Perfect 
{
	public static void main(String[] args)
	{
		int n=6;
		int sum=0;
		System.out.print("The number "+n+" is ");
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Non Perfect");
		}
	}
}
