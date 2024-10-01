
	/*
	Write a menu as 1.addition 2.subtraction

	*/
package day1_20_09_2024;
	import java.util.Scanner;
	class Menu_Driven
	{
		public static void main(String args[])
		{
	Scanner obj=new Scanner(System.in); //new is allocate the dynamic memory for obj

			int a,b,c,ch;
		System.out.println("Enter value for a");
	        a=obj.nextInt(); 
	System.out.println("Enter value for b");
	        b=obj.nextInt(); 
		
		System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	System.out.println("Enter Choice");
	ch=obj.nextInt();

	switch(ch)
	{
	case 1:
	c=a+b;
	System.out.println(" Addition="+c);
	break;
	case 2:
	c=a-b;
	System.out.println("Subtraction="+c);
	break;
	default:
	System.out.println("Invalid Choice");
	}

	}
	}



