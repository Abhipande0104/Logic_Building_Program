/*
   D4 C3 B2 A1 
   A1 B2 C3 D4 
   D4 C3 B2 A1 
   A1 B2 C3 D4 
 */

package dayy15_PattUserInput;

import java.io.*;

public class Pr1_NestedFor5 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows");
		int rows = Integer.parseInt(br.readLine());
		
		//pattern printing
		for(int i=1; i<=rows; i++) 
		{
			char ch1='D';
			char ch2='A';
			int num1=4;
			int num2=1;
			for(int j=1; j<=rows; j++)
			{
				if(i%2==1)
				{
					System.out.print(ch1);
					System.out.print(num1+" ");
					ch1--;
					num1--;
				}
				else
				{
					System.out.print(ch2);
					System.out.print(num2+" ");
					ch2++;
					num2++;
				}
			}
			System.out.println();
		}
	}
}
