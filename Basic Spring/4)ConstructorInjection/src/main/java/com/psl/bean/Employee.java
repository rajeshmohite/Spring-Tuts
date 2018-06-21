package com.psl.bean;

public class Employee{

	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public void perform(){
		System.out.println("Employee id : "+empId+" Employee name : "+empName);
	}
}
