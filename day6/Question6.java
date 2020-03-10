package com.capgemini.quiz.day6;

public class Question6 {
static final int  a = 10;
	static {
		System.out.println("static");  // first static block
	}

	{
		System.out.println("block");    // Second prints statements
	} 
	{
		System.out.println("Second block");
	}

	public Question6() {
		System.out.println("A");
	} 
	{
		System.out.println("third block");
	}

}
