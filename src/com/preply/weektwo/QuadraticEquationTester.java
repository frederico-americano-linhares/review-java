package com.preply.weektwo;

public class QuadraticEquationTester {

	public static void main(String[] args) {

		QuadraticEquation equationOne = new QuadraticEquation(1d, 4d, 4d);
		QuadraticEquation equationTwo = new QuadraticEquation(2d, 5d, 2d);
		QuadraticEquation equationThree = new QuadraticEquation(1d, 4d, 6d);

		System.out.println(equationOne.realRoots());
		System.out.println(equationTwo.realRoots());
		System.out.println(equationThree.realRoots());
	}
}