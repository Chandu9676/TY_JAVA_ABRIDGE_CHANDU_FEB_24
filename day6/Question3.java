package com.capgemini.quiz.day6;

public class Question3 {
	private double radius;

	public Question3(double radius) {
		radius=radius; //both are same radius value not initialize to instance variable
		
		System.out.println(radius);

	}

	void display() {
		System.out.println(radius);
	}

	public static void main(String[] args) {
		Question3 m = new Question3(10);
		m.display();

	}

}
