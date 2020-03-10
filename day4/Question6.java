package com.capgemini.quiz.day4;

public class Question6 {

	double RR(double a, double b){ // if the method  return type is void there should not taking of return
		double sum= 0;
		sum = (a + b)/ 2.;
		return sum;
	}
	public static void main(String[] args) {
		{
			System.out.println(new Question6().RR(5.5 , 6.5));
		}
}
}
