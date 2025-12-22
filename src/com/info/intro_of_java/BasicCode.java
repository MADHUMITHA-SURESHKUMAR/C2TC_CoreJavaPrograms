package com.info.intro_of_java;

public class BasicCode {

	public static void main(String[] args) {
		
		int age = 22;
		double salary = 30000.00;
		boolean isPassed = true;
		char grade = 'A';
		
		
		double newSalary = age; //Implicit or internal conversion - Data widening
		
		int roundSalary = (int)salary; // Explicit or External - Data Narrowing
		
		//Arithmetic operation
		int increment = 3000;
		
		int total = roundSalary + increment;
		
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(roundSalary);
		System.out.println(total);

	}

}
