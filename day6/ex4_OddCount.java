package day6;

public class ex4_OddCount
{
	public static void main(String[] args)
	{
		int n= 222134;
		int rem;
		int i=0;
		System.out.println("The total odd digits in the number are ");
		while(n!=0)
		{
			rem=n%10;
			if(rem%2==1)
			{
				i++;
			}
			n=n/10;
		}
		System.out.println(i);
	}
}
