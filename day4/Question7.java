package com.capgemini.quiz.day4;

public class Question7 {

}

class A {
void add(){
	System.out.println("A class");
}
}

class B extends A {
	void add(){
		System.out.println("A class");
}
}
class C {
	A fun() {
		System.out.println("AAAAAAAfunnnn");
		return new A();
	}
}

class D extends C {
	B fun() {
		System.out.println("DDDDDfunn");
		return new B();
	}
}
