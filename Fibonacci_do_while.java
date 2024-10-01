/*
	Write a program which print fibbonacci series using do while

	*/
package day1_20_09_2024;
import java.util.Scanner;
public class Fibonacci_do_while {

	
	
	class MyFirst
	{
		public static void main(String args[])
		{
	Scanner obj=new Scanner(System.in); //new is allocate the dynamic memory for obj
	int a=0,b=1,f=1,n;
	System.out.println("Enter value for n");
	n=obj.nextInt();
	     System.out.println(a);
	     System.out.println(b);
		do
		{
	     	System.out.println(f);
		a=b;
		b=f;
		f=a+b;
		}
		while(f<=n);
	}
	}


}
