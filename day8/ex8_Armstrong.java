package day8;

/*
 * Take n as input.Print whether n is armstrong number or not
 * Input=23			Output=Not Armstrong
 * Input=153		Output=Armstrong
 */

public class ex8_Armstrong 
{
	public static void main(String[] args)
	{
		int n=153;
		int count=0;
		int temp1=n;
		int temp2=n;
		int sum=0;
		
		System.out.print("The number "+n+" is ");
		while(temp1!=0)
		{
			count++;
			temp1=temp1/10;
		}
		//System.out.println(count);
		
		while(n!=0)
		{
			int rem=n%10;
			int mul=1;
			for(int i=0;i<count;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			n=n/10;
		}
		if(temp2==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not Armstrong number");
		}
	}
}
