package day6;

public class ex1_MathTable
{
	public static void main(String[] rags)
	{
		int i=9;
		int temp=i;
		System.out.println("Table of "+i+" is ");
		while(i<=temp*1000)
		{
			System.out.println(i);
			i=i+temp;
		}
	}
}
