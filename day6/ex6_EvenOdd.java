package day6;

public class ex6_EvenOdd
{
	public static void main(String [] args)
	{
		int i=1;
		int n=10;
		int add=0;
		int mul=1;
		
		while(i<=n)
		{
			if(i%2==0)
			{
				add=add+i;
			}
			else
			{
				mul=mul*i;
			}
			i++;
		}
		System.out.println("The addition of even numbers between 1 and 10 is ");
		System.out.println(add);
		System.out.println("The multiplication of odd numbers between 1 and 10 is ");
		System.out.println(mul);
	}
}
