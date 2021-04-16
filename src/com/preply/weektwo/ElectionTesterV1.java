package com.preply.weektwo;

public class ElectionTesterV1 {

	public static void main(String args[]) {
		
		Candidate candidate1 = new Candidate("Tony Stark", 3691);
		Candidate candidate2 = new Candidate("Henry Pym", 2691);
		Candidate candidate3 = new Candidate("B B", 1962);
		Candidate candidate4 = new Candidate("S R", 1491);
		Candidate candidate5 = new Candidate("C D", 1968);
		
		Candidate[] candidates = {candidate1, candidate2, candidate3, candidate4, candidate5};
	
		printCandidates(candidates);
		
		printTable(candidates);
	}
	
	private static void printCandidates(Candidate[] candidates) {
		
		System.out.println("Raw Election Data:");
		
		for (Candidate candidate : candidates) {
		System.out.println(candidate.getName() + " received " +
						   candidate.getVotes() + " votes." );	
		}
		System.out.println();
		
	}
	
	private static int totalVotes(Candidate[] candidates) {
		
		int total = 0;
		for (Candidate candidate : candidates) {
		total = total + candidate.getVotes();
		}		
		return total;		
	}
	
	private static void printTable(Candidate[] candidates) {
		
		int totalVotes = totalVotes(candidates);
		
		System.out.println("Elections Results:");
		System.out.println("Candidate | Votes Received | % of Total Votes");
		System.out.println("==============================================");
		
		for (Candidate candidate : candidates) {
		System.out.println(candidate.getName() + " | " +
						   candidate.getVotes() + " |" + 
						   candidate.getVotes()*1.00 / totalVotes) ;	
		}
		System.out.println();
		System.out.println("The total number of votes is: " + totalVotes);		
	}
	
	
	
	

}
