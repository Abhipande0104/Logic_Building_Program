package day2;

public class ex4 
{
	public static void main(String[] args)
	{
		float temperature=98.4f;
		
		if(temperature>98.6)
		{
			System.out.println("High");
		}
		else if(98.0<temperature && temperature<98.6)
		{
			System.out.println("Normal");
		}
		else
		{
			System.out.println("Low");
		}
	}
}

/*
 * Define temperature slab and classify accordingly as high, normal and low.
 */
