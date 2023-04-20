package day8;

public class pr2_Scope
{
	public static void main (String[] args)
	{
		int x=10;
		{
			int y=20;
			System.out.println(x+" "+y);
		}
		{
			System.out.println(x+" "+y);
		}
		System.out.println(x+" "+y);
	}
}

//Unresolved compilation problems	(2 errors)
//y can not be resolved to a variable
//y can not be resolved to a variable
