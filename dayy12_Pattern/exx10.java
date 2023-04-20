package dayy12_Pattern;

public class exx10 
{
	public static void main(String[] args)
	{
		for(int i=1; i<=3; i++)
		{
			char x='a';
			int y=1;
			for(int j=1; j<=4; j++)
			{
				if(j%2==1)
				{
					System.out.print(x++ +" ");
					//x++;
				}
				else
				{
					System.out.print(y++ +" ");
					//y++;
				}
			}
			System.out.println("");
		}
	}
}
