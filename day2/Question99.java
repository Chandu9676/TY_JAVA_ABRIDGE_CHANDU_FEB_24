package com.capgemini.quiz.day2;

public class Question99 {
	public static void main(String[] args) {
		int a = 10;
		int b = 25;
		int c = minnumber(a, b);
		System.out.println("min number is " + c);
	}

	static int minnumber(int i, int j) {
		int min;
		if (i > j) {
			min = j;
		} else {

			min = i;

		}
		return min;
	}
}
