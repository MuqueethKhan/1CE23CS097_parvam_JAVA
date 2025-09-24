package com.loops;
import java.util.*;
public class whilloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Invalid Number");
		}
		int i=1;
		while (i<=size) {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			} else {
				System.out.println(i + " odd");
			}
			i++;
		}
		sc.close();
	}

}
