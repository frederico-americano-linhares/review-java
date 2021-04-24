package com.preply.weekthree.images;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KeywordDatabase{
	
	static HashMap<String,Set<String>> keywords;
	
	public KeywordDatabase(){
		
		this.keywords = new HashMap<String, Set<String>>();
		
	}
	
	public boolean getKeyword(String keyword) {
		
		if (keywords.containsKey(keyword)) {
			return true;
		}
		return false;
	}
	
    public void print() {  	
     		
    	for (Map.Entry<String, Set<String>> entry : this.keywords.entrySet()) {
    	    System.out.println(entry.toString());
    	}

    }
    
	public void addImageToKeyword(String image, String keyword){
		
		this.keywords.computeIfAbsent(keyword, k -> new HashSet<String>()).add(image);
		
	}
    
	
	
}