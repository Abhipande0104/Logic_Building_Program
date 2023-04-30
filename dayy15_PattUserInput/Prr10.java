/*
 * WAP to take start and end number from thne user and print all the prime
 * numbers between them.
 */

package dayy15_PattUserInput;

import java.io.*;

public class Prr10 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start number");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end number");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("The prime numbers are ");
		for(int i=start; i<=end; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}
