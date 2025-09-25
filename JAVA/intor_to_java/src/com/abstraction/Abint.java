package com.abstraction;

class Car implements Vehicle{
	public void start() {
		System.out.println("Start the car");
	}
	public void stop() {
		System.out.println("Stop the car");
	}
}
public class Abint {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.stop();
		Vehicle.display();
	}
}