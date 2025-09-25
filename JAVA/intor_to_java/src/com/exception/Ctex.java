package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ctex {
	public static void main(String[] args) {
		try {
			FileReader r= new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}