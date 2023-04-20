package day6;

public class ex8_Countdown
{
	public static void main(String[] args)
	{
		int day=7;
		while(day>=1)
		{
			System.out.println(day+" days remaining");
			day--;
		}
		System.out.println("0 day remaining. Assignment is overdue");
	}
}
