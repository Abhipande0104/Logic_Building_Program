package day8;

public class pr1_Scope
{
	public static void main(String[] rags)
	{
		int x=10,y=20;		//initialization
		{
			System.out.println(x+" "+y);
		}
		{
			x=15;			//assignment
			System.out.println(x+" "+y);
		}
		System.out.println(x+" "+y);
	}
}

/* 10	20
 * 15	20
 * 15	20
 */
