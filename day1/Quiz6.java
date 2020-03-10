package com.capgemini.quiz.day1;

public class Quiz6 {
	public static void main(String[] args) {
		int a = 1;
		do {
			System.out.println("Yes");

			while (a < 6) {
				System.out.println("Six");
				a++;
			}
		} while (a < 6);
	}
}
// a)yes b)yes six(6) yes six(6)....6 times c)error d)yes six(infinity) (d)