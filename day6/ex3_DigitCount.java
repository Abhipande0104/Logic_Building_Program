package day6;

public class ex3_DigitCount
{
	public static void main(String[] args)
	{
		int n=225;
		int i=0;
		System.out.println("The total digits in number is ");
		while(n!=0)
		{
			//rem=n%2;
			n=n/10;
			i++;
		}
		System.out.println(i);
	}
}
