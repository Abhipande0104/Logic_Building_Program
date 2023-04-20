package day8;

/*
 * Write a program to print table of 2
 */

public class prr1_WhileLoopBasic 
{
	public static void main(String[] args)
	{
		int n=2;
		int x=n;
		System.out.println("Table of "+n+" is ");
		while(n<=(x*10))
		{
			//int y=n;
			System.out.print(n+" ");
			n=n+x;
		}
	}
}

//Table of 2 is 
//2 4 6 8 10 12 14 16 18 20 
