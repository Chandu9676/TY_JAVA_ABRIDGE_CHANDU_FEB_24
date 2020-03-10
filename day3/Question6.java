package com.capgemini.quiz.day3;

public class Question6 {
	int b = 10;

	private Question6(int a) {
		this.b = 7;
	}

	Question6() {
	}

	int fun() {
		return b;
	}
}

class B extends Question6 {

	int b;
}


