package com.preply.weekthree.images;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Keyword {
	
	private String keyword;
	private Set<String> imageFileName;
	
	

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Set<String> getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(Set<String> imageFileName) {
		this.imageFileName = imageFileName;
	}

	public Keyword(String keyword){
		
		this.keyword = keyword;
		this.imageFileName = new HashSet<String>();
		
	}
	
	public void addImageToKeyword(String keyword){	
		this.imageFileName.add(keyword);		
	}
	
    public String toString() {
    	
    	String images = Stream.of(this.imageFileName).map(Object::toString).collect(Collectors.joining(","));
    	
        return "Keyword: " + this.keyword + ", Images: " + images;
    }
    
    


}


