package day9;

/*
 * Write a program to print Fibonnaci series.
 */

public class pr4_Fibbonaci 
{
	public static void main(String[] rags)
	{
		int n1=0;
		int n2=1;
	    int sum=0;
	    
	    System.out.println("The Fibonnci series is ");
	    System.out.print(n1+" "+n2+"");
	    for(int i=0; i<15; i++)
	    {
	    	sum=n1+n2;
	    	System.out.print(" "+sum);
	    	n1=n2;
	    	n2=sum;
	    }
	}
}
