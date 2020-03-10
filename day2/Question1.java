package com.capgemini.quiz.day2;

public class Question1 {
	public static void main(String[] args) {
		int a = 2, b = 5;
		switch (a + 2) {
		case 4:
			b = 1; // b is replaced
		case 5:
			b = +1; // not incremented
		case 6:
			b += 1; // incremented +1
			System.out.println(b);
		}
	}
}
// a)8 b)3 c)error d) 2 (d)