package com.capgemini.quiz.day5;

public class Question2 {
	int id;
	String name;

	Question2(int i, String s) {
		this.id = i;
		this.name = s;

	}

	void details() {
		System.out.println("id is" + id);
		System.out.println("name is " + name);
	}
}

class A extends Question2 {
	int id1;
	String name1;

	A(int b, String s1) {
		super(20, "nani");
		this.id1 = b;
		this.name1 = s1;
	}

	void details() {
		System.out.println("id is" + id1);
		System.out.println("name is " + name1);
	}
}
