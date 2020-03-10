package com.capgemini.quiz.day3;

public class Question4 {
	static int x = 10;
	int y = 15;

	public Question4() {
		System.out.println(this.x);
		print();
	}

	public static void print() {
		System.out.println(x);
		// System.out.println(y); //static method cannot acccess non static
		// variables
	}

	public static void main(String[] args) {
		new Question4();

	}
}
