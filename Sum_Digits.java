/*
Write a program which scan the number and calculate the sum of digit.
and print total unit places
Enter number 124
sum 7
unit places 3

*/

package day1_20_09_2024;

import java.util.Scanner;

public class Sum_Digits {

	
		public static void main(String args[])
		{
	Scanner obj=new Scanner(System.in); //new is allocate the dynamic memory for obj
	int a,n,sum=0,count=0;
		System.out.println("Enter value for a");
	        a=obj.nextInt(); 
		n=a;
	while(a>0)
	{
	sum=sum+a%10;
	a=a/10;
	count++;

	}
	System.out.println(n+" Sum of Digit =" +sum);
	System.out.println("\nTotal Count="+count);
	}
	

}


