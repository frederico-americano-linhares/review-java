package com.preply.weektwo;

public class Forest extends Terrain {

	private int numberTrees;

	public Forest(int l, int w, int numberTrees) {
		super(l, w);
		this.numberTrees = numberTrees;
	}

	public int getNumberTrees() {
		return numberTrees;
	}

	public void setNumberTrees(int numberTrees) {
		this.numberTrees = numberTrees;
	}

	public String getTerrainSize() {
		return "Forest " +  super.getTerrainSize() + " and has " + numberTrees + " trees";
	}

}
