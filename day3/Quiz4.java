package day3;

public class Quiz4 
{
	public static void main(String[] args)
	{
		if(10)
		{
			System.out.println("Inside if");
		}
		else
		{
			System.out.println("Inside else");
		}
	}
}

//compilation error
//can not convert int to boolean(in java only boolean values are allowed
//inside the if's condition)
