package com.loops;
import java.util.*;
public class dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int size =sc.nextInt();
		if (size <=0) {
			System.out.println("Invalid number");
		}
		int i = 1;
		do {
			if(i%2==0) {
				System.out.println(i+" is even");
			}else {
				System.out.println(i+" is odd");
			}
			i++;
		}while(i<=size);
		sc.close();
	}

}
