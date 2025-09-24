package com.datatypes;
import java.util.*;
public class Input {

	public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc1.nextLine();  
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " +name);
        System.out.println("Your age is: " +age);
        sc1.close();
        sc.close();

	}

}
