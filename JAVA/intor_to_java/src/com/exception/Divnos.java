package com.exception;

import java.util.Scanner;

public class Divnos {

	public static void main(String[] args) {
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int res=n1/n2;
		System.out.println("Result: "+res);
		sc.close();
	}
}