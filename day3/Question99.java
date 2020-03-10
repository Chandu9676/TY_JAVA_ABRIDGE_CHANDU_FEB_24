package com.capgemini.quiz.day3;

public class Question99 {
	int a=4;
static{
	int b=5; // it cannot accessed outside block
}
public static void main(String[] args) {
	new Question99().call();
}

void call(){
	this.a++;
	this.b++;
	System.out.println(this.a);
	System.out.println(this.b);
}
}

