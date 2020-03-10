package com.capgemini.quiz.day5;

public class Question99 {
	public Question99() {
		System.out.println("qqqqqqqqqqqq");
	}

	public void print() {

	}
}

class Child extends Question99 {
	public Child(){
	//  public  Question99() {
		
	   /*   if overriding the constructor the constructor of super class
		*  and sub class of constructor are should be the same,if we write same it will thorugh errer as 
		*   return type is missing,
		*/
		System.out.println("fhbgbh");
	}

	public void print() {

	}

}