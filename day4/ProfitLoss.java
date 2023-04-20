package day4;

public class ProfitLoss 
{
	public static void main(String [] args)
	{
		int sellingPrice=100;
		int costPrice=100;
		int result = sellingPrice - costPrice;
		if(result>0)
		{
			System.out.println("Profit of "+result);
		}
		else if(result<0)
		{
			System.out.println("Loss of "+result);
		}
		else
		{
			System.out.println("No profit No loss");
		}
	}
}
