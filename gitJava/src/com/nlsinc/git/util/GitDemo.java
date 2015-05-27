package com.nlsinc.git.util;

public class GitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(1, "netlogic");
		printInfo();
		e.printDetails();
		

	}
	
	public static void printInfo()
	{
		System.out.println("This is from method print info");
		System.out.println("This is my first change");
		System.out.println("This is my second change");
	}

}
