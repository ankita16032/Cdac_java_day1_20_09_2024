package day1_20_09_2024;
import java.util.Scanner;
class Pos_Neg_no {

		public static void main(String args[])
		{
			Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
			
			int a;
			System.out.println("Enter the value for a");
			a=obj.nextInt();
			if(a>0)
			{
			System.out.println(+a+" Number Is Positive");
			System.out.println(" Positive");
			}
			else
			{
			System.out.println(+a+" Number Is Negative");
			System.out.println(" Negative");
			}
		}
	}


