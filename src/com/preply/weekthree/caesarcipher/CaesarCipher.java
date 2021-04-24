package com.preply.weekthree.caesarcipher;

import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {

	private static final String BAD_KEY_MESSAGE = "Bad key. Not in -3..+3";

	public static void main(String[] args) throws IOException {

		String result = "";
		String line = "";
		Scanner sc = new Scanner(System.in);

		while (!result.equalsIgnoreCase(BAD_KEY_MESSAGE)) {

			System.out.println("Please type in one line the key and the text to be translated.");
			System.out.println("Use this format: 1 Testing, 1-2-3.");
			System.out.println("1 is the key and 'Testing, 1-2-3.' is the text");

			line = sc.nextLine();

			if (line.isEmpty()) {
				continue;
			}

			String[] splitedInput = new String[2];

			splitedInput = line.split(" ", 2);

			if (splitedInput.length != 2) {
				continue;
			}

			String key = splitedInput[0];

			try {
				Integer.parseInt(key);
			} catch (Exception e) {
				continue;
			}

			String inputText = splitedInput[1];

			result = translate(inputText, Integer.parseInt(key));

			System.out.println(result);

		}
		
		sc.close();
	}

	public static String translate(String inText, int key) {

		if (key > 3 || key < -3) {
			return BAD_KEY_MESSAGE;
		}

		String outText = "";

		for (int i = 0; i < inText.length(); i++) {

			if (Character.isLetter(inText.charAt(i))) {

				char changed = (char) (inText.charAt(i) + key);

				if (changed > 'z')
					outText += (char) (inText.charAt(i) - (26 - key));
				else
					outText += changed;
			} else {
				outText += inText.charAt(i);
			}

		}
		return "Translated: " + outText;
	}

}
