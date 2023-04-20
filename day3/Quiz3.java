package day3;

public class Quiz3
{
	public static void main(String args[])
	{
		if(true)
			if(false)
				System.out.println("inside if");
			else
				System.out.println("inside else1");
		else
			System.out.println("Inside else2");
	}
}

// output: inside else1
