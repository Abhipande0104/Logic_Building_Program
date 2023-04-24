/*
 * WAP that asks the user to enter number from 0 to 5 and print its spelling.
 * If the entered number is greater than 5, print that the number is greater than 5.
 */

package dayy16_Switch;

import java.io.*;

public class Pr2_Spelling 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		int num;
		num = Integer.parseInt(br.readLine());
		if(num<0)
			num=-1;
		if(num>5)
			num=6;
		
		switch(num)
		{
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case -1:
			System.out.println("Th number is negative");
			break;
		case 6:
			System.out.println("The number is greater than 5");
			break;
		}
	}
}
