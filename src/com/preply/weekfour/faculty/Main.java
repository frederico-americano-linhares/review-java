package com.preply.weekfour.faculty;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Database kd = new Database();
		Classification.read(kd);

		String line = "";
		Scanner sc = new Scanner(System.in);

		showUserInputMessage();

		while (true) {

			System.out.print(">> ");
			line = sc.nextLine();

			if (line.isEmpty()) {
				continue;
			}

			String[] command = line.split(">> ");

			command = command[0].split(" ");
			
			String arg1 = "";
			String arg2 = "";
			String arg3 = "";
			String arg4 = "";			
			
			
			int length = command.length;
			if (length < 1 || length > 4) {
				System.out.println("Invalid command");
				continue;
			}

			arg1 = removeWhiteSpaces(command[0]);
			
			if (length == 1 && arg1.equalsIgnoreCase("exit")) {
				System.out.println("Goodbye! Have a nice day!");
				System.exit(0);
			} else {
				arg2 = removeWhiteSpaces(command[1]);
				if (length == 2 && arg1.equalsIgnoreCase("list")) {	
					if (arg2.equalsIgnoreCase("all")) {
						kd.printAllFileFormat();
					} else {
						kd.findPersonByDepartment(arg2);
					}

				} else {
					if (length == 4) {
						arg3 = removeWhiteSpaces(command[2]);
						arg4 = removeWhiteSpaces(command[3]);
						if (command[0].equalsIgnoreCase("add")) {
							kd.addPersonToDepartment(arg3 + " " + arg4,
									removeComma(arg2));
						} else if (arg1.equalsIgnoreCase("remove")) {
							kd.removePersonFromDepartment(arg3 + " " + arg4,
									removeComma(arg2));
						}

					}
				}
			}

		}
	}

	private static String removeComma(String arg2) {
		return arg2.substring(0, arg2.length() - 1);
	}

	private static String removeWhiteSpaces(String originalString) {
		return originalString.trim();
	}

	private static void showUserInputMessage() {
		System.out.println("Welcome the Faculty Directory Program");
		System.out.println("Use commands:");
		System.out.println(" list all");
		System.out.println(" list DEPT_NAME");
		System.out.println(" add DEPT_NAME, FIRST LAST");
		System.out.println(" remove DEPT_NAME, FIRST LAST");
		System.out.println(" exit");
	}
}
