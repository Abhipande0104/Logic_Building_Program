/*
 * WAP in which user should enter 2 numbers if both the numbers are positive multiply 
 * them and provide it to switch case to verify whether the number is even or odd.
 * If user enter egative number then it should terminate by saying "Negative numbers
 * are not allowed." 
 */

package dayy16_Switch;

import java.io.*;

public class Pr3_EvenOdd
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First number");
		int num1= Integer.parseInt(br.readLine());
		
		System.out.println("Enter second number");
		int num2= Integer.parseInt(br.readLine());
		
		int product=1;
		if(num1<0 || num2<0)
		{
			System.out.println("Either of the number is negative");
		}
		else
		{
			product=num1*num2;
			int prod;
			if(product%2==0)
			{
				prod=1;
			}
			else
			{
				prod=2;
			}
		
			switch(prod)
			{
			case 1:
				System.out.println("The product of numbers is even");
				break;
			case 2:
				System.out.println("The product of numbers is odd");
			}
		}
	}
}
