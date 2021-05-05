package com.preply.weekfour.grep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Grep {
	
	static HashMap<String, HashSet<Integer>> wordFrequency;

 
    public Grep(String filename) {
    	
		this.wordFrequency = new HashMap<String, HashSet<Integer>>();
		
		try {
			File facultyFile = new File(filename);
			Scanner myReader = new Scanner(facultyFile);
			int lineCount = 1;
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				this.addWordsToDatabase(line, lineCount);
				lineCount++;
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}

    }


    public HashSet<Integer> lookup(String word) { 
   
    return this.wordFrequency.get(word);    	
 
    }
    
	public void addWordsToDatabase(String line, int lineCount) {
		
		String[] lineWords = line.split(" ");
		
		for(int i = 0; i < lineWords.length; i++) {			
			
			HashSet<Integer> frequencyLine = this.wordFrequency.getOrDefault(lineWords[i], new HashSet<Integer>());
			frequencyLine.add(lineCount);
			this.wordFrequency.computeIfAbsent(lineWords[i], k -> frequencyLine);
			
	        System.out.println("OK, added " + lineWords[i]);			
		}
	}   
    

    public static void main(String[] args) {
    	
    	Grep grep = new Grep("text.txt");
    	System.out.println(Grep.wordFrequency);
    	System.out.println("'your' Frequency " + grep.lookup("your"));
    	
    	
	}
    
}
