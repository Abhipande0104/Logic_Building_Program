/*
  WAP and take 2 characters
  If both are same print same
  If both are different, print their positional difference
  
 Enter start character
 a p
 The difference between a and p character is 15
 */

package dayy15_PattUserInput;

import java.io.*;

public class Pr6
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start character");
		char ch1= (char)br.read();
		br.skip(1);
		char ch2= (char)br.read();
		
		//checking the difference(positional difference)
		if(ch1==ch2)
		{
			System.out.println("The 2 characters are same");
		}
		else
		{
			int diff=ch1-ch2;
			if(diff<0)
			{
				diff=diff*(-1);
			}
			System.out.println("The difference between "+ch1+" and "+ch2+" character is "+diff);
		}
	}
}
