package com.arrindex;
import java.util.Arrays;
import java.util.Scanner;

public class Indexes {

	public static void main(String[] args) {
			int[] arr=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the nos");
			for(int i=0;i<5;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Array: "+Arrays.toString(arr));
			System.out.println("5th number:"+arr[4]);
			sc.close();
	}

}
