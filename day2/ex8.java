package day2;

public class ex8 
{
	public static void main(String[] args)
	{
		int units=150;
		int amount;
		
		if(units<=100)
		{
			amount=units*1;
			System.out.println(amount);
		}
		else
		{
			amount=100+((units-100)*2);
			System.out.println(amount);
		}
	}
}

/*
 * Electricity Bill Problem
 * 
 * Given an integer input a which represents units of electricity consumed
 * at the house. Calculate and print bill amount
 * 
 * Units <=100		price per unit 1
 * Units >100		price per unit 2
 * 
 * 	--input:50			 output:50
 *  --input:200			 output:300
 */

