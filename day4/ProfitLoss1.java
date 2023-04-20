package day4;

public class ProfitLoss1
{
	public static void main(String[] abhi)
	{
		int sellingPrice=2100;
		int costPrice=2100;
		
		if(sellingPrice > costPrice)
		{
			System.out.println("The profit is of "+(sellingPrice-costPrice));
		}
		else if(costPrice > sellingPrice)
		{
			System.out.println("The loss is of "+(costPrice-sellingPrice));
		}
		else
		{
			System.out.println("No profit no loss");
		}
	}
}
