package com.capgemini.quiz.day4;

public class Question8 {
	public int desplay(int x, int y) {
		return (x + y);
	//	return ("the sum is " + x + y);
		//return type is int so must return the integer value
	}

	public static void main(String[] args) {
		Question8 n = new Question8();
		System.out.println((n.desplay(4, 5)));
	}
}