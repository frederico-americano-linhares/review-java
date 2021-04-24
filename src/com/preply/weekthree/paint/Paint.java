package com.preply.weekthree.paint;

import java.util.HashMap;
import java.util.Map;

public class Paint {


	public static void main(String[] args) {

		HashMap<Integer, Integer> mapNumbers = new HashMap<Integer, Integer>();
		mapNumbers.put(4, 21);
		mapNumbers.put(1, 10);
		mapNumbers.put(3, 51);
		mapNumbers.put(2, 90);
		mapNumbers.put(5, 60);

		HashMap<Integer, String> mapColors = new HashMap<Integer, String>();
		mapColors.put(4, "Black");
		mapColors.put(1, "Red");
		mapColors.put(5, "Green");
		mapColors.put(3, "Purple");
		mapColors.put(2, "Yellow");

		paintByNumber(mapNumbers, mapColors );

	}

	static void print2(HashMap<String, Integer> map) {

		for (Map.Entry<String, Integer> set : map.entrySet()) {

			System.out.println(set.getKey() + " = " + set.getValue());
		}

	}

	static void paintByNumber(HashMap<Integer, Integer> mapNumbers, HashMap<Integer, String> mapColors) {

		HashMap result = new HashMap<Integer, String>();
		int max = Integer.MIN_VALUE;
		String mostSpaceColor = "";

		for (HashMap.Entry<Integer, String> setColor : mapColors.entrySet()) {

			result.put(setColor.getValue(), mapNumbers.get(setColor.getKey()));
			if ( mapNumbers.get(setColor.getKey())  > max ) {
				max = mapNumbers.get(setColor.getKey());
				mostSpaceColor = setColor.getValue();
				
			}

		}
		print2(result);
		System.out.println(mostSpaceColor + " has the most spaces to color!" );
	}

}
