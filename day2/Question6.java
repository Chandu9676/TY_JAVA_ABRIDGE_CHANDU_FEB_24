package com.capgemini.quiz.day2;

public class Question6 {
	public static void main(String[] args) {
		char ch = 'h';
		String s = "chinny";
		switch (ch) {
		// switch (s){
		// case "chinny" : System.out.println(s);
		// }
		case 'a':
			System.out.println(ch);
			break;
		case 'h':
			System.out.println(ch++);
		case 'i':
			System.out.println(ch);
			break;
		case 'k':
			System.out.println(ch);
		}
	}
}
// a)chinny and h and i b) chinny h c)error (c)