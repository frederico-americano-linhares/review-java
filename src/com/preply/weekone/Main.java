package com.preply.weekone;

public class Main {

	public static void main(String args[]) {

		int testSumDigits = 12345;
		SumDigits.sumDigits(testSumDigits);
		
		double x1 = 2;
		double y1 = 3;
		Point p1 = new Point(x1,y1);		
		double x2 = 5;
		double y2 = 6;
		Point p2 = new Point(x2,y2);
		
		System.out.println("P1-origin distance: "+ p1.distance());
		System.out.println("P1-P2 distance: "+ p1.distance(p2));
		
	}

}
