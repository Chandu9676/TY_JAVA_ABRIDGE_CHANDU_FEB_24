package com.capgemini.quiz.day5;

public class Question9 {
	public Question9() {
		System.out.println("1");
		new Question9(10);
		System.out.println("5");
	}

	public Question9(int a) {
		System.out.println("2");
		new Question9(10, 15);
		System.out.println("4");

	}

	public Question9(int a, int b) {
		System.out.println("3");
	}
}

class T {
	public static void main(String[] args) {
		Question9 q = new Question9();
	}
}
