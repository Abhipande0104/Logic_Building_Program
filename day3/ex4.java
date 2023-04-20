
//Take an integer N as input
//Print odd integers from 1 to N using loop{Print odd numbers}

package day3;

public class ex4 
{
	public static void main(String [] arg)
	{
		int i=1;
		int n=19;
		while(i<=n)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
