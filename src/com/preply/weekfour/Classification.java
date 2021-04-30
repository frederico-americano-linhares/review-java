package com.preply.weekfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Classification {

	public static void read(Database database) {

		try {
			File facultyFile = new File("faculty.txt");
			Scanner myReader = new Scanner(facultyFile);
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();

				addPersonToDepartment(line,database);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		System.out.println("");
	}

	public static void addPersonToDepartment(String line, Database kd) {

		String[] lineWords = line.split(", ");

		if (lineWords.length < 2) {
			System.out.println("Invalid Line");
			return;
		}

		String filename = lineWords[0];

		for (int i = 1; i < lineWords.length; i++) {
			String department = lineWords[i];
			kd.addPersonToDepartment(filename, department);
		}

	}

}