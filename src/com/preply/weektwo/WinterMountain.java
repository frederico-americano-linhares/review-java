package com.preply.weektwo;

public class WinterMountain extends Mountain {
	
	private double temperature;

	public WinterMountain(int l, int w, int numberMountains, double temperature) {
		super(l, w,numberMountains);
		this.temperature = temperature;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public String getTerrainSize() {
		return "Winter " + super.getTerrainSize() + " and temperature " + temperature + " degrees";
	}

}
