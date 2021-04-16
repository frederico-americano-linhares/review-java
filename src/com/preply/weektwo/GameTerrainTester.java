package com.preply.weektwo;

public class GameTerrainTester {

	public static void main(String[] args) {

		Terrain terrain = new Terrain(150, 240);
		Terrain forest = new Forest(400, 400, 180);
		Terrain mountain = new Mountain(600, 200, 12);
		Terrain winterMountain = new WinterMountain(500, 500, 30, 12.34d);

		System.out.println(terrain.getTerrainSize());
		System.out.println(forest.getTerrainSize());
		System.out.println(mountain.getTerrainSize());
		System.out.println(winterMountain.getTerrainSize());
	}
}