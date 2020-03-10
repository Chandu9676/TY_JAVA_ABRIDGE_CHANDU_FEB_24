package com.capgemini.quiz.day4;

public class Question1 {
	int value = 0;

	public void Question() {
		addValue();
	}

	void addValue() {
		value += 10;
	}

	int getValue() {
		return value;
	}
}

class Derived extends Question1 {
	Derived() {
		addValue();
	}

	void addValue() {
		value += 20;
	}
}

