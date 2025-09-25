package com.ifc;

import java.util.ArrayList;
import java.util.List;

public class ListIfc {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(12);
		l.add(12.0);
		l.add("Hello");
		l.add(true);
		l.add(12);
		l.add(12);
		System.out.println(l);
		
		Object object=l.get(0);
		Integer firstvalue=(Integer)object;
		System.out.println(firstvalue);
		
		String name=(String)l.get(2);
		System.out.println(name);
		
		//with generics
		System.out.println("_________________________________");
		List<Integer> integers=new ArrayList<>();
		integers.add(121);
//		integers.add("st0ringvalue");
		integers.add(130);
		integers.add(170);
		integers.add(15);
		integers.add(140);
		System.out.println(integers);
		
		Integer integer = integers.get(1);
		
		System.out.println(integer);
	}

}
