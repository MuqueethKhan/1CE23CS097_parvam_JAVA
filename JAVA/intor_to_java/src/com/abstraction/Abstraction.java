package com.abstraction;

abstract class Shape{
	abstract void draw();
	public void display() {
		System.out.println("This is display function");
	}
}
/* A.C can contain both abstract methods as well as non abstract methods
 * We cannot create objects for abstract classes
 * we can achieve 0 to 100% abstraction  */
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a circle");
	}
	void erase() {
		System.out.println("Erase a circle");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a Rectangle");
	}
	void erase() {
		System.out.println("Erase a Rectangle");
	}
}
class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a Triangle");
	}
	void erase() {
		System.out.println("Erase a Triangle");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		c.draw();
		c.erase();
		r.draw();
		r.erase();
		t.draw();
		t.erase();
	}
}