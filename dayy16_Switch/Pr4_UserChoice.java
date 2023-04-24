/*
 * WAP to take choice from the user and display its choice.
 */

package dayy16_Switch;

import java.io.*;

public class Pr4_UserChoice
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		
		System.out.println("Whats your interest");
		System.out.println("1.movies");
		System.out.println("2.series");
		System.out.println("Enter your choice 1 or 2");
		
		choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1:
			int wish;
			System.out.println("Movie you wish to watch today");
			System.out.println("1.Founder");
			System.out.println("2.SnowDown");
			System.out.println("3.Jobs");
			System.out.println("4.Her");
			System.out.println("5.Social Network");
			System.out.println("6.Wall-E");
			System.out.println("7.AI");
			System.out.println("Enter your choice");
			
			wish=Integer.parseInt(br.readLine());
			switch(wish)
			{
			case 1:
				System.out.println("You wish to watch Founder");
				break;
			case 2:
				System.out.println("You wish to watch Snowdown");
				break;
			case 3:
				System.out.println("You wish to watch Jobs");
				break;
			case 4:
				System.out.println("You wish to watch Her");
				break;
			case 5:
				System.out.println("You wish to watch Social Network");
				break;
			case 6:
				System.out.println("You wish to watch Wall-E");
				break;
			case 7:
				System.out.println("You wish to watch AI");
				break;
			default:
				System.out.println("Invalid choice");
			}
			break;
			
		case 2:
			int wish1;
			System.out.println("Best series to watch");
			System.out.println("1.Silicon Valley");
			System.out.println("2.Devs");
			System.out.println("3.the IT Crowd");
			System.out.println("4.Mr. Robot");
			System.out.println("Print user's choice");
			
			wish1=Integer.parseInt(br.readLine());
			switch(wish1)
			{
			case 1:
				System.out.println("You wish to watch Silicon Valley");
				break;
			case 2:
				System.out.println("You wish to watch Devs");
				break;
			case 3:
				System.out.println("You wish to watch the IT Crowd");
				break;
			case 4:
				System.out.println("You wish to watch Mr. Robot");
				break;
			default:
				System.out.println("Invalid choice");
			}
			break;
			default:
				System.out.println("Invalid choice");
		}
	}
}
