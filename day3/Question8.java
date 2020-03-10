package com.capgemini.quiz.day3;

public class Question8 {
	static int i = demo(); // cannot static reference to non-static demo()
	static {
		i = 10;
		System.out.println(i);
	}

	Question8() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		System.out.println("haiii");
	}

	int demo() {
		System.out.println("demo going on");
		return 10;
	}
}
