package com.capgemini.javabasics.assignment2;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {

		System.out.println("Enter 1 for your name");
		System.out.println("Enter 2 for your age");
		System.out.println("Enter 3 for your phonenumber");
		System.out.println("Enter 4 for mail");
		System.out.println("Enter 5 for your address");

		String name = null;
		int age = 0;
		long phonenumber = 0;
		String MailID = null;
		String Address = null;

		// L: for (int m = 1; m > 0; m++) {
		P: for (int i = 1; i > 0; i++) {

			K: for (int j = 1; j > 0; j++) {

				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();

				switch (n) {
				case 1:
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Enter your name");
					name = sc1.nextLine();
					System.out.println("Enter 2 to go next step");
					break;
				case 2:
					System.out.println("Enter your age");
					age = sc.nextInt();
					System.out.println("Enter 3 to go next step");
					break;
				case 3:
					System.out.println("Enter your phonenumber");
					phonenumber = sc.nextLong();
					sc.nextLine();
					System.out.println("Enter 4 to go next step");
					break;
				case 4:
					System.out.println("Enter your mailID");
					Scanner sc2 = new Scanner(System.in);
					MailID = sc2.nextLine();
					System.out.println("Enter 5 go next step");
					break;
				case 5:
					System.out.println("Enter your address");
					Address = sc.nextLine();
					sc.nextLine();
					System.out.println("============= You want to check your details Enter 6 ===============");
					break;
				case 6:
					System.out.println(" You want to proceed then Enter 10");
					int k = sc.nextInt();
					System.out.println("your name is   :" + "     " + name);
					System.out.println("***** you want to change name Enter 8 ******");
					System.out.println("your age is     :" + "     " + age);
					System.out.println("***** you want to change age Enter 9 ******");
					System.out.println("your phonenumber is     :" + "     " + phonenumber);
					System.out.println("***** you want to change phonenumber Enter 10 *****");
					System.out.println("your  mail is     :" + "     " + MailID);
					System.out.println("***** you want to change mailID Enter 11 *****");
					System.out.println("your address is     :" + "     " + Address);
					System.out.println("***** you want to change address Enter 12 *****");
					System.out.println();
					System.out.println();
					System.out.println("==================you want to save and please Enter 7======================");
					break;
				case 7:
					break K;
				case 8:
					Scanner sc4 = new Scanner(System.in);
					System.out.println("Enter your name");
					name = sc4.nextLine();
					System.out.println("save and check your details enter 6");
					break;
				case 9:
					System.out.println("Enter your age");
					age = sc.nextInt();
					System.out.println("save and check your details enter 6");
					break;
				case 10:
					System.out.println("Enter your phonenumber");
					phonenumber = sc.nextLong();
					sc.nextLine();
					System.out.println("save and check your details enter 6");
					break;
				case 11:
					System.out.println("Enter your mailID");
					Scanner sc5 = new Scanner(System.in);
					MailID = sc5.nextLine();

					System.out.println("save and check your details enter 6");
					break;
				case 12:
					System.out.println("Enter your address");
					Address = sc.nextLine();
					sc.nextLine();
					System.out.println("************check your details enter 6************");
					break;
				default:
					System.out.println("============Invalid number===============");
					break;
				}
			}

			if (name == null) {
				System.out.println("Your name is missing please enter 8");

				break P;
			} else if (age == 0) {
				System.out.println("Your age is missing please enter 9");

				break P;
			} else

			if (phonenumber == 0) {
				System.out.println("Your phone number is missing please enter 10");
				break P;
			} else

			if (MailID == null) {
				System.out.println("Your mailid is missing please enter 11");
				break P;
			} else

			if (Address == null) {
				System.out.println("Your address is missing please enter 12");
				break P;
			} else {

				break P;
			}

			// break L;
		}
		System.out.println("*************  SUCCESSFULLY REGISTERED **************");
		System.out.println("You want Exit plese enter 15");
		Scanner a = new Scanner(System.in);
		int v = a.nextInt();
		System.out.println("!!!!!!!!!!!!!!!!!!!  THANK YOU   !!!!!!!!!!!!!!!!!!!!!!!!!");

	}

}
