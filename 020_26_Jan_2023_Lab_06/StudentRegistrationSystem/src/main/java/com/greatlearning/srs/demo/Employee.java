package com.greatlearning.srs.demo;

public class Employee {

	private String empId;
	private String empName;
	
	private Float salary;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Float salary() {
		return salary;
	}
	
	public void salary(Float salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		Employee empObj = new Employee();
		
		empObj.setEmpId("1");
		String empId = empObj.getEmpId();
		
		empObj.salary(12345F);
		float sal = empObj.salary();
	}
}
