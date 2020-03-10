package com.capgemini.quiz.day4;

public class TestQuestion7 {
	public static void main(String[] args) {
		C c = new C();
		c.fun();
		new A().add();
		//c.new A().add();
		// Error
		D d = new D();
		d.fun();
		new B().add();
		// b.new B().add();
		// Error
	
	}
}
