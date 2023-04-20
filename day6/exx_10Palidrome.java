package day6;

public class exx_10Palidrome 
{
	public static void main(String[] args)
	{
		int n=622226;
		int rem;
		int temp=n;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palidrome");
		}
	}
}
