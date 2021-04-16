package com.preply.weektwo;

public class Mountain extends Terrain {
	
	private int numberMountains; 

	public Mountain(int l, int w, int numberMountains) {
		super(l, w);
		this.numberMountains = numberMountains;
	}

	public int getNumberMountains() {
		return this.numberMountains;
	}

	public void setNumberMountains(int numberMountains) {
		this.numberMountains = numberMountains;
	}
	
	public String getTerrainSize() {
		return "Mountain " +  super.getTerrainSize() + " and has " + numberMountains + " mountains";
	}

}
