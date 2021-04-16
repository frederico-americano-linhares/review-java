package com.preply.weektwo;

import java.util.*;

public class ArraysExercise {

	public static void main(String[] args) {

		int[] initialArray = { 281, 344, 265, 272, 236, 324, 287 };

		int[] secondArray = { 281, 344, 265, 272, 236, 324, 287 };
		int[] thirdArray = { 281, 344, 265, 272, 236, 324, 290 };

		int position = findElement(initialArray, 272);
		int[] newArray = copyArray(initialArray);

		boolean compareFirstAndSecond = isEqual(initialArray, secondArray);
		boolean compareFirstAndThird = isEqual(initialArray, thirdArray);

		System.out.println("Position " + ++position);
		System.out.println("New Array " + Arrays.toString(newArray));
		System.out.println("compareFirstAndSecond " + compareFirstAndSecond);
		System.out.println("compareFirstAndThird " + compareFirstAndThird);
		display(initialArray);
	}

	private static int findElement(int[] initialArray, int searchedElement) {

		for (int i = 0; i < initialArray.length; i++) {
			if (searchedElement == initialArray[i]) {
				return i;
			}
		}
		return -1;

	}

	private static int[] copyArray(int[] initialArray) {

		int[] newArray = new int[initialArray.length];

		for (int i = 0; i < initialArray.length; i++) {
			newArray[i] = initialArray[i];
		}
		return newArray;

	}

	private static boolean isEqual(int[] firstArray, int[] secondArray) {

		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] != secondArray[i])
				return false;
		}
		return true;

	}

	private static void display(int[] initialArray) {

		System.out.println("For Loop:");
		for (int i = 0; i < initialArray.length; i++) {
			System.out.println("i:" + i + " value:" + initialArray[i]);
		}
		System.out.println();

		System.out.println("Enhanced For Loop:");
		for (int number : initialArray) {
			System.out.println(number);
		}
		System.out.println();

		System.out.println("While loop :");
		int j = 0;
		while (j < initialArray.length) {
			System.out.println("j:" + j + " value:" + initialArray[j]);
			j++;
		}
		System.out.println();

		System.out.println("Without loop :");
		System.out.println(Arrays.toString(initialArray));
		System.out.println();

	}

}