package com.assignments;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num, rvs = 0;
        while (temp>0) {
            rvs=rvs*10+temp%10;
            temp=temp/10;
        }
        if (num == rvs)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is NOT a Palindrome");

        sc.close();


	}

}
