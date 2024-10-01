/*
	Write a program which scan 10 numbers from user
	calculate total sum of even number odd number
	print total even number and odd number

	*/
package day1_20_09_2024;
import java.util.Scanner;
public class Odd_Even_Sum {
		public static void main(String args[])
		{
	Scanner obj=new Scanner(System.in); //new is allocate the dynamic memory for obj
	int a=1,n,odd=0,even=0,oddcount=0,evencount=0;

	System.out.println("Enter 10 Numbers");
	      
	while(a<=10)
	{
		n=obj.nextInt();
		if(n%2==0)
		{
		even=even+n;
		evencount++;
		}
		else
		{
		odd=odd+n;
		oddcount++;
		}
	a++;
	}
	System.out.println(" Even Sum  =" +even);
	System.out.println("\n  Even Count="+evencount);
	System.out.println(" Odd Sum  =" +odd);
	System.out.println("\n  Odd Count="+oddcount);

	}
	
}
