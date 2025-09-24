package com.objects;

class Car{
	String brand;
	int year;
	public void display() {
		System.out.println("Brand: " +brand);
		System.out.println("Year: "+year);
	}
}
public class Cobject {
	public static void main(String[] args) {
		Car obj1=new Car();
		obj1.brand="BMW";
		obj1.year=2025;
		obj1.display();
		Car obj2=new Car();
		obj2.brand="Mercedes";
		obj2.year=2023;
		obj2.display();
	}
}