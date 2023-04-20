package day8;

public class pr3_Scope
{
	public static void main(String[] args)
	{
		int x=10;
		{
			int y=20;
			System.out.println(x+" "+y);
		}
		{
			int y=15;
			System.out.println(x+" "+y);
		}
		System.out.println(x+" "+y);
	}
}

//Unresolved compilation problem(1 error)
//y can not be resolved to a variable
