package com.preply.weekthree.grademanagement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;

public class Manager {

	private static final int ARRAY_MAX_SIZE = 40;
	private static final int ARRAY_RANDOM_SIZE = 10;
	private double[] grades;
	private double[] gradesRange;

	public Manager() {

		this.grades = new double[ARRAY_MAX_SIZE];
		this.grades = DoubleStream.generate(() -> -1.0).limit(ARRAY_MAX_SIZE).toArray();

		this.gradesRange = new double[ARRAY_RANDOM_SIZE];
	}

	public void setRandomValuesToList() {

		this.gradesRange = DoubleStream.generate(ThreadLocalRandom.current()::nextDouble).map(x -> round(x * 10, 1))
				.limit(ARRAY_RANDOM_SIZE).toArray();

		System.arraycopy(this.gradesRange, 0, this.grades, 0, ARRAY_RANDOM_SIZE);
	}

	public void setFixedValuesToList() {

		this.grades = DoubleStream.generate(() -> 2.0d).limit(ARRAY_MAX_SIZE).toArray();

	}

	public void calculateAverage() {

		double average = Arrays.stream(this.grades).filter(x -> x >= 0).average().orElse(-1);

		if (!String.valueOf(average).equals("-1,0")) {
			System.out.println("Average: " + round(average, 1));

			return;
		}

		System.out.println("Average: Null List");

	}

	public void calculateHighest() {

		if (isPopulated()) {
			double max = Arrays.stream(this.grades).max().orElseThrow(NoSuchElementException::new);
			System.out.println("Highest: " + max);
		} else {
			System.out.println("Highest: Null List");
		}

	}

	private boolean isPopulated() {
		return !String.valueOf(this.grades[ARRAY_RANDOM_SIZE - 1]).equals("-1.0");
	}

	public void calculateLowest() {

		if (isPopulated()) {
			double min = Arrays.stream(this.grades).filter(x -> x >= 0.0).min().orElseThrow(NoSuchElementException::new);

			System.out.println("Lowest: " + min);
		} else {
			System.out.println("Lowest: Null List");
		}

	}

	public void printList() {

		int limit;
		if (String.valueOf(this.grades[ARRAY_RANDOM_SIZE]).equals("-1.0")
				&& isPopulated()) {
			limit = ARRAY_RANDOM_SIZE;

		} else {
			limit = ARRAY_MAX_SIZE;
		}

		System.out.print("List: [");
		for (int i = 0; i < limit; i++) {
			System.out.print(this.grades[i] + " ");
		}
		System.out.println("]");
	}

	private static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

}
