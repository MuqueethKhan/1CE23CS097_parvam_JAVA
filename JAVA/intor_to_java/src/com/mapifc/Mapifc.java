package com.mapifc;

import java.util.HashMap;
import java.util.Map;

public class Mapifc {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Apple");
		map.put(2, "Ball");
		System.out.println(map);
		System.out.println(map.get(1));
	}

}
