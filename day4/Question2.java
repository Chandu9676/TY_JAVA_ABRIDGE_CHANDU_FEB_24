package com.capgemini.quiz.day4;

public class Question2 { 
	//public final  void add()  //final method is nor overriding 
	//public final void add()  //
	public void add() { 
		System.out.println("aaaaaaaaa");
	}
}

class Q extends Question2 { 
	// public void add()
	public final void add() {
		System.out.println("bbbbbbbbbbb");
	}
}
