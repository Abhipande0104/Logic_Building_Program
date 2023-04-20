package day6;

public class ex7_EvenOdd
{
	public static void main(String[] args)
	{
		int n=7;
		int temp=n;
		if(temp%2==0)
		{
			while(n>=0)
			{
				System.out.println(n);
				n--;
			}
		}
		else
		{
			while(n>=0)
			{
				System.out.println(n);
				n=n-2;
			}
		}
	}
}
