package com.preply.weekone;

public class Chocolate {

	private int barCode;
	private String name;
	private double weight;
	private double cost;

	public Chocolate() {
	}

	public Chocolate(int barCode, String name, double weight, double cost) {
		this.barCode = barCode;
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}