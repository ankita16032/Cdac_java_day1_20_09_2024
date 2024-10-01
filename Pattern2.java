/*
Write a program which print the pattern
n=4
* * * * 
* * * * 
* * * * 
* * * * 

*/

package day1_20_09_2024;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in); //new is allocate the dynamic memory for obj
		int n,i,j;
		System.out.println("Enter value for n ");
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
			System.out.print(" * ");
			}
		System.out.println();

		}

		}
		

	}


