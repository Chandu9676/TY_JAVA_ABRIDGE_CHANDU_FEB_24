package com.capgemini.quiz.day4;

public class Question4 {
	static String s = "";

	public static void main(String[] args) {
		P: for (int i = 2; i < 6; i++) {
			if (i == 3)
				continue;

			if (i == 5)
				break P;

			s = s + i;
		}
		System.out.println(s);

	}
} 
// a)24  b)42 c)23 d)22        
