package com.preply.weektwo;

public class Student {

	private String firstName;
	private String middleName;
	private String lastName;

	public Student() {
	}

	public Student(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student change() {

		String newFirstName = this.firstName.trim();
		String newLastName = this.lastName.trim();

		String newMiddleName;

		if (this.middleName.isEmpty()) {
			newMiddleName = "N.A";
		} else {
			newMiddleName = this.middleName.trim();
		}

		return new Student(newFirstName, newMiddleName, newLastName);
	}

	public String generateInitials() {

		Student changedStudent = this.change();

		return changedStudent.firstName.substring(0, 1) + changedStudent.middleName.substring(0, 1)
				+ changedStudent.lastName.substring(0, 1);
	}
}
