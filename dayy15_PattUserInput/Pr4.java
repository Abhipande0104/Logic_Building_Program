/*
 * WAP to print all the even numbers in reverse order and odd numbers in same order
 * Take start and end numbers from user.
 * 
 *  Even numbers
	8 6 4 2 
	Odd numbers
	3 5 7 9 
 */

package dayy15_PattUserInput;

import java.io.*;

public class Pr4
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter start");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("Even numbers");
		for(int i=end; i>=start; i--)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println("Odd numbers");
		for(int i=start; i<=end; i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
