package com.employee.problems;

import java.util.Random;

class Employee {
	static final int IS_FULL_TIME = 1;

	public static void empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}

public class EmployeeWageUsingOOPS {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee.empCheck();

	}
}
