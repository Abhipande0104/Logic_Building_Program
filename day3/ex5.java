
//Take an integer N as input
//Print multiple of 4 till N {Print table of 4}

package day3;

public class ex5 
{
	public static void main(String[] args) 
	{
		int i=1;
		int n=59;
		while(i<=n)
		{
			if(i%4==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
