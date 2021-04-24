package com.preply.weekthree.grademanagement;

import java.util.Scanner;

public class UserInterface {

	public static void showMainMenu() {

		String choice = "0";
		Scanner input = new Scanner(System.in);

		Manager manager = new Manager();

		while (!choice.equals("7")) {
			System.out.println("---------------------------------------");
			System.out.println("Choose the option number:");
			System.out.println("1 - Average grade");
			System.out.println("2 - Display grades");
			System.out.println("3 - Find highest");
			System.out.println("4 - Find lowest");
			System.out.println("5 - Random initialization of list");
			System.out.println("6 - Fixed initialization of list");
			System.out.println("7 - Quit the program");
			System.out.println("---------------------------------------");
			choice = input.next();

			if (!choice.equals("7")) {

				switch (choice) {
				case "1":
					manager.calculateAverage();
					break;
				case "2":
					manager.printList();
					break;
				case "3":
					manager.calculateHighest();
					break;
				case "4":
					manager.calculateLowest();
					break;
				case "5":
					manager.setRandomValuesToList();
					break;
				case "6":
					manager.setFixedValuesToList();
					break;
				default:
					System.out.println("Unknown choice: " + choice);
				}

			}
		}
		input.close();

	}

}
