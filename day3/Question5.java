package com.capgemini.quiz.day3;

public class Question5 {
	static int x = 10;

	public Question5() {
		System.out.println(this.x);
		Question5();
	}

	public static void Question5() {
		// System.out.println(this.x); // cannot use this to static content
	}

	public static void main(String[] args) {
		new Question5();
	}
}
