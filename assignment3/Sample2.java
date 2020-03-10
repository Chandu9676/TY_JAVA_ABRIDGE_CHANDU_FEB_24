package com.capgemini.javabasics.assignment3;

public class Sample2 {
	public static void main(String[] args) {
		long[] number = { 251, 457, 455, 565, 99 };
		printNum(number);
		System.out.println("================================");
		long[] values = getNum();
		printNum(values);
	}

	static void printNum(long[] numbers) {
		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}
	}

	static long[] getNum() {
		long[] num = { 543, 666, 777, 434, 565 };
		return num;
	}
}
