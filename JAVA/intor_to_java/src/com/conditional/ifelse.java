package com.conditional;
import java.util.*;
public class ifelse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Number is 0");
		}
		else if(n<0) {
			System.out.println("Negative number");
		}
		else if(n%2==0) {
			System.out.println("Even number");
		}
		
		else {
			System.out.println("Odd number");
		}
		sc.close();
		}
}