package com.capgemini.javabasics.assignment3;

public class Sample3 {
	public static void main(String[] args) {
		Object[] o = { "chandu", "aravind", "naveen", 454, 6565 };
		printNames(o);
		Object[] oo = GetNames();
		printNames(oo);
	}

	static void printNames(Object[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			System.out.println("-----------------------------------------");
		}

	}

	static Object[] GetNames() {
		Object[] name = { "pavan", "saikumar", 2531, 4545 };
		return name;
	}
}
