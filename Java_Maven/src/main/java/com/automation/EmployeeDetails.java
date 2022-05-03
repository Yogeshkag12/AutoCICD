package com.automation;

public class EmployeeDetails {
	private String name;
	private double monthlySalary
	private double weekelySalary;
	private double weekelySalary;
	private int time
	private String day;
	private int weeklyworkingHours;

	// @return the name

	public String getName() {
		return name;
	}
	// @param name the name to set

	public void setName(String name) {
		this.name = name;
	}
	// @return the monthlySalary

	public double getMonthlySalary() {
		return monthlySalary;
	}
	// @param monthlySalary the monthlySalary to set

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	// @return the time

	public int getTime() {
		return time;
	}

	// @param time the time to set

	public void setDayAndTime(String day,int time) {
		this.day = day;
		this.time = time;
	}
	// @return the weeklyWorkingHours

	public int getWeeklyWorkingHours() {
		return workingHours;
	}

	// @param workingHours the workingHours to set

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
}
