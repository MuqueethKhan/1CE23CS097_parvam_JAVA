package com.constructors;

class Grandparent {
	public Grandparent() {
	super();
	System.out.println("GP constructor");
}
}
class Person extends Grandparent {
	int pid=20;
	public Person() {
		super();
		System.out.println("PC");
	}
}
class Student extends Person{
	public int id;
	public String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id) {
		super();
		System.out.println(super.pid);
		this.id=id;
	}
}
public class Constrs {

	public static void main(String[] args) {
		Student s1=new Student(1010,"Hameem");
		Student s2=new Student(1020,"Lepaksh");
		Student s3=new Student(1030, "Parveen");
		System.out.println("First student: ");
		System.out.println("ID: "+s1.id);
		System.out.println("Name: "+s1.name);
		System.out.println("Second student: ");
		System.out.println("ID: "+s2.id);
		System.out.println("Name: "+s2.name);
		System.out.println("Third student: ");
		System.out.println("ID: "+s3.id);
		System.out.println("Name: "+s3.name);
	}

}
