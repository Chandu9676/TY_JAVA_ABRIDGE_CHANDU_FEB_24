package com.capgemini.quiz.day3;

public class Question7 {
	private Question7(int a) {
		System.out.println("Question7");
	}
	// Question7(){
	// }
	// }
}

class Test extends Question7 {
	public Test() {
		// super(12);
		System.out.println("test");
	}
}

class Main {
	public static void main(String[] args) {
		new Test();
	}
}
