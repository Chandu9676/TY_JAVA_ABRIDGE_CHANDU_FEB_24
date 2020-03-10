package com.capgemini.quiz.day2;

public class Question3 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 4; j++) {
				i %= j;
				System.out.println(j);
			}
		}
	}
}
//a) 123  b)error   c) 123(infinity)    d)nothing                 (C)