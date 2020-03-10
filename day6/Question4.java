package com.capgemini.quiz.day6;

public class Question4 {
	/*
	 * static{ int a = 5; } compile time error (the variable 'a' in static block
	 * cannot able to access using this keyword)
	 * 
	 * 
	 */
	public static void main(String args[]) {
		new Question4().call();
	}

	private static int a; // default value is zero

	void call() {
		this.a++; // a value incremented 0 to 1
		System.out.print(this.a);
	}

}
