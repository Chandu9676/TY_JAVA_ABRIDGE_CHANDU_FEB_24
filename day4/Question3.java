package com.capgemini.quiz.day4;

public class Question3 {
	public static void main(String[] args) {
		int i = 0, j = 9;
		do {
			i++;
			if (j-- < i++) {
				break;
			}
		} while (i < 5);
		System.out.println(i + "" + j);

	}
}
// a) 44 b)22 c)55 d)66 