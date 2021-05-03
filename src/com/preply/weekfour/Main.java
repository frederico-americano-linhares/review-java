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
		kd.removePersonFromDepartment("Brian Shaw", "MATH");
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

			System.out.print(">> ");
			line = sc.nextLine();

			if (line.isEmpty()) {
				continue;
			}

			System.out.println(" Line: " + line);

			String[] command = line.split(">> ");

			command = command[0].split(" ");

			int length = command.length;
			if (length < 1 || length > 4) {
				System.out.println("Invalid command");
				continue;
			}

			if (length == 1 && command[0].equalsIgnoreCase("exit")) {
				System.out.println("Goodbye! Have a nice day!");
				System.exit(0);
			} else {
				if (length == 2 && command[0].equalsIgnoreCase("list")) {
					if (command[1].equalsIgnoreCase("all")) {
						kd.printAllFileFormat();
					} else {
						kd.findPersonByDepartment(command[1]);
					}

				} else {
					if (length == 4) {
						if (command[0].equalsIgnoreCase("add")) {
							kd.addPersonToDepartment(command[2] + " " + command[3],
									command[1].substring(0, command[1].length() - 1));
						} else if (command[0].equalsIgnoreCase("remove")) {
							kd.removePersonFromDepartment(command[2] + " " + command[3],
									command[1].substring(0, command[1].length() - 1));
						}

					}
				}
			}

		}
	}
}
