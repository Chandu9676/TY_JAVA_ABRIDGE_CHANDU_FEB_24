package com.capgemini.javabasics.assignment3;

public class Sample1 {
	public static void main(String[] args) {
		double [] num = {25.1,45.9,45.6,56.5,99.9};
		printNum(num);
		System.out.println("=======================");
		double[] number = getNum();
		printNum(number);
	}

	static void printNum(double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
	}

	static double[] getNum() {
		double[] num = {32.5,45.5,58.2,68.5,77.7};
		return num;
	}
}

