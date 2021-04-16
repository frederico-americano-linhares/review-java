package com.preply.weektwo;

import java.util.Arrays;

public class CricketMatches {

	public static void main(String[] args) {

		int[] scores = { 281, 344, 265, 272, 236, 324, 287 };

		double averageScore = average(scores);

		int countEqual = 0;
		int countAbove = 0;
		long countBelow = 0;

		for (int value : scores) {
			if (Double.compare(Double.valueOf(value), averageScore) == 0) {
				countEqual++;
			} else if (Double.compare(Double.valueOf(value), averageScore) > 0) {
				countAbove++;
			} else {
				countBelow++;
			}
		}

		System.out.println("The average score of the team is " + averageScore + " runs.");
		System.out.println("No. of matches having a score above average is " + countAbove);
		System.out.println("No. of matches having a score equal average is " + countEqual);
		System.out.println("No. of matches having a score below average is " + countBelow);
	}

	private static double average(int[] scores) {

		int sum = Arrays.stream(scores).sum();
		return (sum * 1d / scores.length);

	}
}