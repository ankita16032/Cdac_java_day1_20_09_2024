/*
Write a program scan age of person and print person is
minor
major
senior citizen
invalid age

*/


package day1_20_09_2024;

import java.util.Scanner;

public class Scan_age {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int age;
	System.out.println("Enter age of person: ");
	age=sc.nextInt();
	
	if(age>=1 && age<18)
		System.out.println("Minor Person");
	else if(age>=18 && age<60)
		System.out.println("Major Person");
	else if(age>=60 && age<=100)
		System.out.println("Senior citizen");
	else
		System.out.println("Invalid Age");
	}

}
