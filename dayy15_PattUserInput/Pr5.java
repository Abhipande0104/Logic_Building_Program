/*
	0 
	1 1 
	2 3 5 
	8 13 21 34 

Palindrome numbers
 */

package dayy15_PattUserInput;

import java.io.*;

public class Pr5 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows");
		int rows= Integer.parseInt(br.readLine());
		
		int num1=0;
		int num2=1;
		int sum;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num1+" ");
				sum=num1+num2;
				num1=num2;
				num2=sum;
			}
			System.out.println();
		}
	}
}
