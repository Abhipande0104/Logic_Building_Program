/*
   5 4 3 2 1 
   8 6 4 2 
   9 6 3 
   8 4 
   5 
 */

package dayy15_PattUserInput;

import java.io.*;

public class Pr3 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows");
		int rows = Integer.parseInt(br.readLine());
		
		//printing pattern
		for(int i=1; i<=rows; i++)
		{
			int x=(rows-i)+1;
			for(int j=rows; j>=i; j--)
			{
				System.out.print(x*i+" ");
				x--;
			}
			System.out.println();
		}
	}
}
