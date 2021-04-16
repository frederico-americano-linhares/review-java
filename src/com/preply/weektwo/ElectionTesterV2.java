package com.preply.weektwo;

import java.util.ArrayList;

public class ElectionTesterV2 {

	public static void main(String args[]) {
		
		Candidate candidate1 = new Candidate("Tony Stark", 3691);
		Candidate candidate2 = new Candidate("Henry Pym", 2691);
		Candidate candidate3 = new Candidate("B B", 1962);
		Candidate candidate4 = new Candidate("S R", 1491);
		Candidate candidate5 = new Candidate("C D", 1968);
		
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		candidates.add(candidate1);
		candidates.add(candidate2);
		candidates.add(candidate3);
		candidates.add(candidate4);
		candidates.add(candidate5);
	
		printCandidates(candidates);
		
		printTable(candidates);
	}
	
	private static void printCandidates(ArrayList<Candidate> candidates) {
		
		System.out.println("Raw Election Data:");
		
		for (Candidate candidate : candidates) {
		System.out.println(candidate.getName() + " received " +
						   candidate.getVotes() + " votes." );	
		}
		System.out.println();
		
	}
	
	private static int totalVotes(ArrayList<Candidate> candidates) {
		
		int total = 0;
		for (Candidate candidate : candidates) {
		total = total + candidate.getVotes();
		}		
		return total;		
	}
	
	private static void printTable(ArrayList<Candidate> candidates) {
		
		int totalVotes = totalVotes(candidates);
		
		System.out.println("Elections Results:");
		System.out.println("Candidate | Votes Received | % of Total Votes");
		System.out.println("==============================================");
		
		for (Candidate candidate : candidates) {
		System.out.print(candidate.getName() + " | " +    candidate.getVotes() + " |"); 
		System.out.printf ("%.2f",candidate.getVotes()*1.00 / totalVotes) ;	
		System.out.println();}
		System.out.println();
		System.out.println("The total number of votes is: " + totalVotes);		
	}
}
