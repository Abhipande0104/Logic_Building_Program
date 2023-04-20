package day4;

public class MaxOfThree 
{
	public static void main(String[] rags)
	{
		int num1=9;
		int num2=2;
		int num3=9;
		//int max;
		
		if(num1==num2 && num2==num3)
		{
			System.out.println("All numbers are same");
		}
		else if(num1>=num2 && num1>=num2)
		{
			System.out.println(num1+" is maximum");
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println(num2+" is maximum");
		}
		else
		{
			System.out.println(num3+" is maximum");
		}
		
	}
}
