package day4;

public class PythagoreanTriplet
{
	public static void main(String [] rags)
	{
		int a=4;
		int b=5;
		int c=3;
		
		if(a>=b && a>=c && (a*a==b*b+c*c))
		{
			System.out.println("The above is pythagorean triplet");
		}
		else if(a>=b && a>=c && (a*a!=b*b+c*c))
		{
			System.out.println("NOT pythagorean triplet");
		}
		
		else if(b>=a && b>=c && (b*b==a*a+c*c))
		{
			System.out.println("The above is pythagorean triplet");
		}
		else if(b>=a && b>=c && (b*b!=a*a+c*c))
		{
			System.out.println("NOT pythagorean triplet");
		}
		
		else if(c>=b && c>=a && (c*c==b*b+a*a))
		{
			System.out.println("The above is pythagorean triplet");
		}
		else if(c>=b && c>=a && (c*c!=b*b+a*a))
		{
			System.out.println("NOT pythagorean triplet");
		}
	}
}
