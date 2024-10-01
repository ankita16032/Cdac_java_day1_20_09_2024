/*
	Write a program which calculate the factorial of number
	Enter number 4
	1*2*3*4
	*/
package day1_20_09_2024;
import java.util.Scanner;
public class Factorial_1_to_n {

	
	
	class MyFirst
	{
		public static void main(String args[])
		{
	Scanner obj=new Scanner(System.in); //new is allocate the dynamic memory for obj
	int a,n,fact=1;
	System.out.println("Enter value for n ");
	n=obj.nextInt();
	for(a=1;a<=n;a++)
	{
	fact=fact*a;
	}
	     System.out.println(n+"Factorial =" +fact);
	}
	}


}
