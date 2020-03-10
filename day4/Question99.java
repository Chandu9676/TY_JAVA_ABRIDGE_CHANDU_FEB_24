package com.capgemini.quiz.day4;

public class Question99 {
	public static void main(String[] args) {
		String value = "abc"; // local variable not changing 
		changeValue(value);
		System.out.println(value); //still the value pointing to abc value 
	}

	public static void changeValue(String a) {
		a = "XYZ";  //value initialize only
	//	System.out.println(a);
	}
} 
