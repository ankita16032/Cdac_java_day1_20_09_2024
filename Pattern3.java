/*
Write a program which print the pattern
n=4
A
A B
A B C
A B C D 
*/

package day1_20_09_2024;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in); //new is allocate the dynamic memory for obj
		int n,i,j;
		char ch='A';
		System.out.println("Enter value for n ");
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{      ch='A';
			for(j=1;j<=i;j++)
			{
			System.out.print(ch);
			ch++;
			}
		System.out.println();

		}

	}

}
