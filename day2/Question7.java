package com.capgemini.quiz.day2;

public class Question7 {
	public static void main(String[] args) {
		int x = 3;
		int y = 0;
		for (; y < 10; y++)
			if (y % x == 0)
				continue;
			else if (y == 8)
				break;
			else
				System.out.println(y + " ");
	}
}
// 12457