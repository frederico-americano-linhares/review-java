package com.preply.weekthree.images;

public class Main {


	public static void main(String[] args) {

		KeywordDatabase kd = new KeywordDatabase();
		Classification.read(kd);
		kd.print();
		kd.findImages("animals");
		System.out.println();
		kd.findOrImages("animals","people");
		System.out.println();
		kd.findAndImages("animals","people");
}

}
