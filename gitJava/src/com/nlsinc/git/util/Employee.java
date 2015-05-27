package com.nlsinc.git.util;

public class Employee {
	
	public int empId;
	public String ename;
	
	public Employee(int empId, String ename) {
		
		this.empId = empId;
		this.ename = ename;
	}
	
	public void printDetails()
	{
		System.out.println(this.empId + " " + this.ename);
		System.out.println("Employee details printed");
		System.out.println("----------------------------------");
	}
	
	
	
	

}
