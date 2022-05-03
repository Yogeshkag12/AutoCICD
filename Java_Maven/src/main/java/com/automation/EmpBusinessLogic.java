package com.automation;

public class EmpBusinessLogic {
	
	// Calculate the working hours of employee
	   public double calculateWorkingHours(EmployeeDetails employeeDetails) {

	      double wokingHours = 0;

	      if(employeeDetails.getWeeklyWorkingHours() < 25) {
	         System.out.println("Employe has worked Less in a week");

	      }else if(employeeDetails.getWeeklyWorkingHours() == 25) {
		         System.out.println("Employe has worked as per expected hours");

		      }
	      else if(employeeDetails.getWeeklyWorkingHours() > 25) {
		         System.out.println("Employe has worked more in a week");

		      }
	      else if(employeeDetails.getWeeklyWorkingHours() == 0) {
		         System.out.println("Employee was on leave");

		      }

	      return wokingHours;
	   }
}
