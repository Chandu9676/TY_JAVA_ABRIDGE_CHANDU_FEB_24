package com.capgemini.quiz.day3;

public class Question1 {
	public static void main(String[] args) {
		int a = 42; // 42 binary is 00101010, value is assign into the b then it
					// will changed to 11010101(43)
		int b = ~a;
		System.out.println(a + " " + b);
	}
}
// a) 42 b)-42 c)11010101 d)-43 (d)