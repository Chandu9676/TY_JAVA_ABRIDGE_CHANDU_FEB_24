package com.capgemini.quiz.day2;

public class Question5 {
	public static void main(String[] args) {
		a: for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					continue a;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}

// int a=5,b=15;
// System.out.println(a %= b);

// a)5 b)1 c) 10 d)3 (a)