package com.capgemini.quiz.day6;

public class Question5 {
	static final int a = 20;

	static final void call() {
		System.out.println("two");
	}

	static {
		System.out.println("one");
	}
}
	/*    public static void main(String[] args) { 
		// the main method is same class then first static block execute 
		// the main is separate class then first final and next static block will execute
		Question5.call();
		System.out.println(Question5.a);
	    }
        }
	*/