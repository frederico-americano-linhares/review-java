package com.preply.weekthree.images;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		KeywordDatabase kd = new KeywordDatabase();
		Classification.read(kd);
		kd.print();
		kd.findImages("animals");
		System.out.println();
		kd.findOrImages("animals", "people");
		System.out.println();
		kd.findAndImages("animals", "people");

		String line = "";
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("What would you like to search for?");

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

			if (length == 1) {
				kd.findImages(lineWords[0]);
			} else {
				if (lineWords[1].equalsIgnoreCase("or")) {
					kd.findOrImages(lineWords[0], lineWords[2]);
				} else {
					kd.findAndImages(lineWords[0], lineWords[2]);
				}
			}

		}
	}

}
