package com.poly;

class Addition{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		Addition a= new Addition();
		a.add(10,20);
		a.add(19.5, 30.5);
	}

}
