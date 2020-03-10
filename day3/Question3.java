package com.capgemini.quiz.day3;

public class Question3 {
	public static void main(String[] args) {
		int x;
		x = 10;
		x = x << 3;
		System.out.println(x);
		int a = 2, b = 2, c = 3;
		a |= 4;
		b >>= 1; // b=b>>1;
		c <<= 1;
		a ^= c;
		System.out.println(a + "  " + b + "  " + c);
	}
}
