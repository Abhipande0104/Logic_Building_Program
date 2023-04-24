/*
 * WAP in which student will enter marks obtained in 5 different subjects.
 * If all the subjects has marks greater than pass marks add rhem and provide to switch case 
 * to print grades.
 */

package dayy16_Switch;

import java.io.*;

public class Pr1_Marks 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int marathiMarks;
		System.out.println("Enter marathi marks");
		marathiMarks = Integer.parseInt(br.readLine());
		
		int englishMarks;
		System.out.println("Enter english marks");
		englishMarks = Integer.parseInt(br.readLine());
		
		int scienceMarks;
		System.out.println("Enter science marks");
		scienceMarks = Integer.parseInt(br.readLine());
		
		int mathsMarks;
		System.out.println("Enter maths marks");
		mathsMarks = Integer.parseInt(br.readLine());
		
		int sstMarks;
		System.out.println("Enter Social Science marks");
		sstMarks = Integer.parseInt(br.readLine());
		
		if(marathiMarks<35 || englishMarks<35 || scienceMarks<35 || mathsMarks<35 || sstMarks<35 )
		{
			System.out.println("You are failed");
		}
		else
		{
			double average=(marathiMarks + englishMarks + mathsMarks + scienceMarks + sstMarks)/5;
			
			char ch;
			if(average>75)
				ch='A';
			else if(average>60)
				ch='B';
			else if(average>50)
				ch='C';
			else if(average>40)
				ch='D';
			else if(average>35)
				ch='E';
			else
				ch='F';
			System.out.println("The result of student is ");
			switch(ch)
			{
				case'A':
					System.out.println("First Class with Distinction");
					break;
				case'B':
					System.out.println("First Class");
					break;
				case'C':
					System.out.println("Second Class");
					break;
				case'D':
					System.out.println("Third Class");
					break;
				case'E':
					System.out.println("Pass");
					break;
				case'F':
					System.out.println("Fail");
					break;
			}	
		}
	}
}
