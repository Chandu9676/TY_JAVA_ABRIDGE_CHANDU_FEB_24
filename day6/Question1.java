package com.capgemini.quiz.day6;

public class Question1 {
	static int i;
	int j;
	static {
		i = 10;
		System.out.println("static blocks");

	}
}

class MM {
	public static void main(String[] args) {
		System.out.println(Question1.i);
	}
}
// static blocks it will execute first
// 10