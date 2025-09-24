package com.inheritance;

class Animal{
	public void eat() {
		System.out.println("Animal eats");
	}
	public void sleep() {
		System.out.println("Animal sleeps");
	}
}
class Dog extends Animal{ 
	@Override
	public void eat() {
		System.out.println("Sugho eats");
	}
	public void sleep() {
		System.out.println("Sugho sleeps");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.eat();
		d1.sleep();
		
	}

}
