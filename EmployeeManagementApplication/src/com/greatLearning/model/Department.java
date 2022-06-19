package com.greatLearning.model;

/**
 * 
 * @author Ayush
 * 
 * This is the Department class which contains information about the department.
 * This class is made so that in future if we want to add any special function of access to the employees of this department
 * we can implement those here.
 */

public class Department {
	private String departmentName;

	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
