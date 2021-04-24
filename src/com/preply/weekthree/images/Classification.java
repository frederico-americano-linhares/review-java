package com.preply.weekthree.images;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Classification {

	public static void read(KeywordDatabase kd) {

		try {
			File myObj = new File("image_info.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();

				System.out.println(line);
				addImageToKeyword(line,kd);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void addImageToKeyword(String line, KeywordDatabase kd) {

		String[] lineWords = line.split(" ");

		if (lineWords.length < 2) {
			System.out.println("Invalid Line");
			return;
		}

		String filename = lineWords[0];

		for (int i = 1; i < lineWords.length; i++) {
			String keyword = lineWords[i];
			kd.addImageToKeyword(filename, keyword);
		}

	}

}