package com.capgemini.quiz.day2;

public class Question4 {
	public static void main(String[] args) {
		char ch = 'h';
		switch (ch) {
		case 'a':
			System.out.println(ch);
			break;
		case 'h':
			System.out.println(ch++);
		case 'i':
			System.out.println(++ch+1);
			break;
		case 'k':
			System.out.println(ch);
		}
	}
}
