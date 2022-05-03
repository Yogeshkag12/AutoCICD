package com.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();

	@Test
	public void testEmployeeCurrentWorkingHours() {

		employee.setName("Rajeev");
		employee.setDayAndTime("Monday",5);
		employee.setDayAndTime("Tuesday",5);
		employee.setDayAndTime("Wedneday",6);
		employee.setDayAndTime("Thrusday",9);
		employee.setDayAndTime("Friday",0);
		

		double workingHours = empBusinessLogic.calculateWorkingHours(employee);
		Assert.assertEquals(25, wokingHours);
	}
	@Test
	public void testEmployeePastWorkingHours() {

		employee.setName("Rajeev");
		employee.setFromDate("10-4-2022");
		employee.setToDate("15-4-2022");
		

		double workingHours = empBusinessLogic.calculateWorkingHours(employee);
		Assert.assertEquals(25, wokingHours);
	}
	@Test
	public void testEmployeeLeaveCount() {

		employee.setName("Rajeev");
		employee.setFromDate("10-4-2022");
		employee.setToDate("15-4-2022");
		

		double workingHours = empBusinessLogic.calculateWorkingHours(employee);
		Assert.assertEquals(25, wokingHours);
	}

}
