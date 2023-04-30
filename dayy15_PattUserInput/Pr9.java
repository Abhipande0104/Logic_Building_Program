/*
 * WAP to take number as input and print the addition of factorials of each digit
 * from that number
 * Input 1234
 * Output Addition is 33.
 */

package dayy15_PattUserInput;

import java.io.*;

public class Pr9 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num= Integer.parseInt(br.readLine());
		
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int fact=1;
			int rem=temp%10;
			for(int i=1; i<=rem; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		System.out.println("The sum of factorials of number "+num+" is "+sum);
	}
}
