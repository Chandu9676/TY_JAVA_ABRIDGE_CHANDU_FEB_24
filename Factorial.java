package com.capgemini.javabasics.assignment1;

public abstract class Factorial {
	public static void main(String[] args) {
		int num = 5, temp = num;
		for (int i = num - 1; i >= 1; i--) {
			num = num * i;

		}
		System.out.println("factorial  " + temp + " is " + num);
	}
}