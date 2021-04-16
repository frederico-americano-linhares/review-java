package com.preply.weektwo;

public class StudentTester {

	public static void main(String[] args) {

		Student student = new Student("  Filius  ", "", " Flitwich");

		System.out.println(student.generateInitials());
	}
}