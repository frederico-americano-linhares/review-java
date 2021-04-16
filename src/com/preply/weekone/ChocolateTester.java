package com.preply.weekone;

public class ChocolateTester {
	
	public static void main(String[] args) {
		
		Chocolate chocolate = new Chocolate(
				101,
				"Cadbury",
				12,
				10);		
		
		printChocolate(chocolate);
		
		chocolate.setBarCode(102);
		chocolate.setName("Hershey's");
		chocolate.setWeight(24);
		chocolate.setCost(50);
		
		printChocolate(chocolate);		
	}

	private static void printChocolate(Chocolate chocolate) {
		System.out.println("Chocolate [barCode=" + chocolate.getBarCode() +
					", name=" + chocolate.getName() +
					", weight=" + chocolate.getWeight() +
					", cost=" + chocolate.getCost() + "]");
	}
}