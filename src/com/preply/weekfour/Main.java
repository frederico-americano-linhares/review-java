package com.preply.weekfour;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Database kd = new Database();
		Classification.read(kd);
		kd.printAllMapFormat();
		System.out.println();
		kd.printAllFileFormat();
		System.out.println();
		kd.addPersonToDepartment("Rob Long", "BUS");
		kd.addPersonToDepartment("ROB Long", "BUS");
		System.out.println();		
		kd.findPersonByDepartment("CIS");
		System.out.println();
		kd.removePersonFromDepartment("Brian Shaw","MATH");
		System.out.println();
		kd.printAllFileFormat();

		String line = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome the Faculty Directory Program");
		System.out.println("Use commands:");
		System.out.println(" list all");
		System.out.println(" list DEPT_NAME");
		System.out.println(" add DEPT_NAME, FIRST LAST");
		System.out.println(" remove DEPT_NAME, FIRST LAST");
		System.out.println(" exit");


		while (true) {

			line = sc.nextLine();

			if (line.isEmpty()) {
				continue;
			}

			String[] lineWords = line.split(" ");

			int length = lineWords.length;
			if (length < 1 || length > 3) {
				System.out.println("Invalid command");
				continue;
			}

			/*if (length == 1) {
				break;
			} else {
				if (lineWords[1].equalsIgnoreCase("or")) {
					kd.findOrImages(lineWords[0], lineWords[2]);
				} else {
					kd.findAndImages(lineWords[0], lineWords[2]);
				}
			}*/

		}
	}

}
