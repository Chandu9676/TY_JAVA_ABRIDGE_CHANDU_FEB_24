package com.capgemini.quiz.day4;

public class Question9 {
public int number;
}
class Test{
	public void doIT(int i,Question9 p){
		i = 5;
		p.number = 8;
		
	}
	public static void main(String[] args) {
		int x = 0;
		Question9 p=new Question9();
		new Question9().doIT(x,p);
		System.out.println(x + "" + p.number);
	}
}
