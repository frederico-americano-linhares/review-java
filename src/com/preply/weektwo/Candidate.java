package com.preply.weektwo;

public class Candidate {

	private int numVotes;
	private String name;

	public Candidate(String name, int numVotes) {

		this.name = name;
		this.numVotes = numVotes;
	}

	public String getName() {
		return name;
	}

	public int getVotes() {
		return numVotes;
	}

	public void setVotes(int n) {
		numVotes = n;
	}

	public void setName(String n) {
		name = n;
	}

	public String toString() {
		return name + " received " + numVotes + " votes.";
	}
}
