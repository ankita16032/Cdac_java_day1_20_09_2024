package day1_20_09_2024;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,n,fact=1;
		System.out.println("Enter value for a: ");
		a=sc.nextInt();
		n=a;
		while(a>0)
		{
			fact=fact*a;
			a--;
		}
		System.out.println(n+" Factorial = "+fact);
	}

}
