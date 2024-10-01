package day1_20_09_2024;

import java.util.Scanner;

public class Add_2_nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b,c;
		System.out.println("Enter value for a: ");
		a=sc.nextInt();
		System.out.println("Enter value for b: ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition is: "+c);
		sc.close();
	}

}
