package com.datatypes;

public class Non_primitive {

	public static void main(String[] args) {
        String name = "MMMKHAN";
        System.out.println("String: " + name);
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
        Student s1 = new Student("Ali", 21);
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
        }

	}
class Student {
    private String name;
    private int age;
    Student(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    String getName() {
    	return name;
    }
    int getAge() {
    	return age;
    }
}