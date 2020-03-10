package com.capgemini.quiz.day5;

public class Question8 {

	static int i = 100;

	public static void run(int k) {
		int i = 200;
		System.out.println(i);
		System.out.println(k);
	}

	public static void main(String[] args) {
		run(10);
	}

	static {
		int j = 15;
		System.out.println(j);
	}
}
