package com.capgemini.javabasics.assignment3;

public class ItemsTest {
	public static void main(String[] args) {
		Item[] products = new Item[3];

		Item i1 = new Item("slice", 100, "05-06-2020");
		Item i2 = new Item("Sprite", 100, "05-06-2020");
		Item i3 = new Item("thumsup", 100, "05-06-2020");
		products[0] = i1;
		products[1] = i2;
		products[2] = i3;
		printProductDetails(products);
	}

	static void printProductDetails(Item[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.println("product name is " + p[i].ProductName);
			System.out.println("cost product is " + p[i].cost);
			System.out.println("expiry date is " + p[i].expiryDate);
			System.out.println("----------------------------------------");
		}

	}
}
