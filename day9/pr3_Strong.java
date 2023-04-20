package day9;

/*
 * Write a program to print Strong number
 */

public class pr3_Strong
{
	public static void main(String[] rags)
	{
		int n=40589;
		int sum=0;
		int temp=n;
		
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1; i<=rem; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		//System.out.println(sum);
		
		if(sum==temp)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("Not strong Number");
		}
	}
}
