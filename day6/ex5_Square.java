package day6;

public class ex5_Square
{
	public static void main(String[] ags)
	{
		int n=2368;
		int rem;
		System.out.println("The square of even digits of number "+n+" is ");
		while(n!=0)
		{
			rem=n%10;
			if(rem%2==00)
			{
				System.out.println(rem*rem);
			}
			n=n/10;
		}
	}
}
