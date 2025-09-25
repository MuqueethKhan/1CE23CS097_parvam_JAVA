package com.student;
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int empId = sc.nextInt();
		sc.nextLine(); 
		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Department: ");
		String dept = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		System.out.println("\n--- Employee Details ---");
		System.out.println("Employee ID: " + empId);
		System.out.println("Name       : " + name);
		System.out.println("Department : " + dept);
		System.out.println("Salary     : " + salary);
		sc.close();
	}
}