//O 
//14 13 
//L K J 
//9 8 7 6 
//E D C B A 

package dayy15_PattUserInput;

import java.io.*;

public class Pr7 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row");
		int row = Integer.parseInt(br.readLine());
		int x=(row*(row+1))/2;
		
		//pattern printing
		for(int i=0; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if((i%2==0&&row%2==0)||(i%2==1&&row%2==1))
				{
					System.out.print((char)(64+x)+" ");
				}
				else
				{
					System.out.print(x+" ");
				}
				x--;
			}
			System.out.println();
		}
	}
}
