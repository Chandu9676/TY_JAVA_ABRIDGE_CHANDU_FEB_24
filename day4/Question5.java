package com.capgemini.quiz.day4;

public class Question5 {
	void RR(double i) {
		if (i > 0)

			// System.out.println("ggggggggggggg");
			// we can write statement here then an error not reachable i++
			return;
		i++;
		// compile time error because here there is no print before return
		System.out.println("hhhhh");
		System.out.println("hhhhh");
	}

	public static void main(String[] args) {
		new Question5().RR(5.5);
		System.out.println("ggggggggggggg");
	}
}
