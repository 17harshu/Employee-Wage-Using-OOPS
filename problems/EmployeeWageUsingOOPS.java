package com.employee.problems;

public class EmployeeWageUsingOOPS {
	public static final int IS_Employee_Present = 1;
	public static final int Full_Time = 1;
	public static final int Part_Time = 0;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static int ComputeEmpWage() {
		int totalEmpHours = 0;
		int empHrs = 0;
		int totalWorkingDays = 0;

		System.out.println("Welcome to the EmployeeWage Program");

		while (totalEmpHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;

			int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (employeeCheck) {
			case Full_Time:
				System.out.println("Employee is full time");
				totalEmpHours = 8;
				break;
			case Part_Time:
				System.out.println("Employee is part time");
				totalEmpHours = 4;
				break;
			default:
				System.out.println("employee absent");
				break;

			}
			totalEmpHours += empHrs;
			System.out.println("Day:" + NUM_OF_WORKING_DAYS + "Emp Hour:" + empHrs);
		}
		int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage:" + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String args[]) {
		ComputeEmpWage();
	}
}
