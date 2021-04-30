package com.preply.weekfour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {

	static HashMap<String, ArrayList<String>> facultyMap;

	public Database() {

		this.facultyMap = new HashMap<String, ArrayList<String>>();

	}

	public boolean getKeyword(String keyword) {

		if (facultyMap.containsKey(keyword)) {
			return true;
		}
		return false;
	}
	
	public void printAllFileFormat() {

		System.out.println("");
		for (Map.Entry<String, ArrayList<String>> entry : this.facultyMap.entrySet()) {
			for (String value : entry.getValue()) {
				System.out.println(value + ", " + entry.getKey());
			}
		}
	}

	public void printAllMapFormat() {

		System.out.println("");
		for (Map.Entry<String, ArrayList<String>> entry : this.facultyMap.entrySet()) {
			System.out.println(entry.toString());
		}
		System.out.println("");

	}

	public void addPersonToDepartment(String person, String department) {
		
		if (this.facultyMap.containsKey(department) && this.facultyMap.get(department).contains(person)) {
			
        System.out.println("Cannot add " + person + " to " + department	+ " because they already exist there");
        return;
		}
		

		this.facultyMap.computeIfAbsent(department, k -> new ArrayList<String>()).add(person);

	}
	
	public void removePersonFromDepartment(String person, String department) {
		
		
		ArrayList<String> people = this.facultyMap.get(department);
		if (!people.isEmpty() && people.contains(person)) {
			
			people.remove(person);
			this.facultyMap.computeIfAbsent(department, k -> new ArrayList<String>()).addAll(people);
		}
		

	}


	public void findPersonByDepartment(String department) {

		ArrayList<String> result = new ArrayList<String>();

		this.facultyMap.entrySet().forEach(entry -> {
			if (entry.getKey().equalsIgnoreCase(department)) {
				result.addAll(entry.getValue());
			}
		});
		

		generateResponse(result);

	}

	private void generateResponse(ArrayList<String> result) {
		if (result.isEmpty()) {
			System.out.println("Your search returned no results.");	
		}
		else {
		System.out.println(result);
		}
	}


}