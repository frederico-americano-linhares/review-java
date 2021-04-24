package com.preply.weekthree.images;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KeywordDatabase {

	static HashMap<String, Set<String>> keywords;

	public KeywordDatabase() {

		this.keywords = new HashMap<String, Set<String>>();

	}

	public boolean getKeyword(String keyword) {

		if (keywords.containsKey(keyword)) {
			return true;
		}
		return false;
	}

	public void print() {

		System.out.println("");
		for (Map.Entry<String, Set<String>> entry : this.keywords.entrySet()) {
			System.out.println(entry.toString());
		}
		System.out.println("");

	}

	public void addImageToKeyword(String image, String keyword) {

		this.keywords.computeIfAbsent(keyword, k -> new HashSet<String>()).add(image);

	}

	public void findImages(String keyword) {

		Set<String> result = new HashSet<String>();

		this.keywords.entrySet().forEach(entry -> {
			if (entry.getKey().equalsIgnoreCase(keyword)) {
				// System.out.println(entry.getKey() + " " + entry.getValue());
				result.addAll(entry.getValue());
			}
		});

		System.out.println(result);

	}

	public void findOrImages(String keyword1, String keyword2) {

		Set<String> result = new HashSet<String>();

		this.keywords.entrySet().forEach(entry -> {
			if (entry.getKey().equalsIgnoreCase(keyword1) || entry.getKey().equalsIgnoreCase(keyword2)) {
				// System.out.println(entry.getKey() + " " + entry.getValue());

				result.addAll(entry.getValue());
			}
		});

		System.out.println(result);

	}

	public void findAndImages(String keyword1, String keyword2) {

		Set<String> result1 = new HashSet<String>();
		Set<String> result2 = new HashSet<String>();

		this.keywords.entrySet().forEach(entry -> {
			if (entry.getKey().equalsIgnoreCase(keyword1)) {
				result1.addAll(entry.getValue());
			}
		});
		

		this.keywords.entrySet().forEach(entry -> {
			if (entry.getKey().equalsIgnoreCase(keyword2)) {
				result2.addAll(entry.getValue());
			}
		});
		
		result1.retainAll(result2);
		
		System.out.println(result1);


	}

}