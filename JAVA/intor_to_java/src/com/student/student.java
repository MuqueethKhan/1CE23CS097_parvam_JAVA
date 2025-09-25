package com.student;

import java.util.*;

public class student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		int studentId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Grade (single character): ");
		char grade = sc.next().charAt(0);
		
		System.out.println("\n--- Student Details ---");
		System.out.println("Student ID: " + studentId);
		System.out.println("Name      : " + name);
		System.out.println("Age       : " + age);
		System.out.println("Grade     : " + grade);

		sc.close();
	}

}
