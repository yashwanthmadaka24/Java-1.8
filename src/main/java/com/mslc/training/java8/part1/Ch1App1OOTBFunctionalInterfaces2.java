package com.mslc.training.java8.part1;

import java.util.ArrayList;
import java.util.List;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch1App1OOTBFunctionalInterfaces2 {

	public static void main(String[] args) {
		List<Employee> empList = HealthData.employeeList;
		List<String> newList = mutateEmployeeToStringLegacy(empList);
		System.out.println(newList);

//		List<String> newList2 = mutateEmployeeToStringJava8(empList, << functional interface >> );
//		System.out.println(newList2);

	}

	/**
	 * TODO : Exercise 1 Design the higher order function called
	 * mutateEmployeeToString to mutate Employee object in the provided employee
	 * list.
	 * 
	 * 
	 **/

	public static List<String> mutateEmployeeToStringLegacy(List<Employee> employeeList) {

		List<String> empNameList = new ArrayList<String>();
		for (Employee emp : employeeList) {
			empNameList.add(emp.getName());
		}
		return empNameList;
	}

	/**
	 * TODO : Exercise 1 Design the higher order function called
	 * mutateEmployeeToStringJava8 to mutate Employee object into String (name of
	 * employee) and return a new List
	 * 
	 * 
	 **/

//	public static List<Employee> mutateEmployeeToStringJava8(List<Employee>  input,   << Functional Interface >> ) {
//		
//	}

	public static List<String> mutateEmployeeAndApplyThenLogicLegacy(List<Employee> employeeList) {

		List<String> empNameList = new ArrayList<String>();
		for (Employee emp : employeeList) {
			// empNameList.add(emp.getName());
			String name = emp.getName();
			String firstName = name.substring(0, name.indexOf(" "));
			empNameList.add(firstName);
		}
		return empNameList;
	}

	/**
	 * TODO : Exercise 2 Design the higher order function called
	 * mutateEmployeeToComposeLogicJava8 to provide the functionality as implemented
	 * in mutateEmployeeToComposeLogicLegacy
	 * 
	 * 
	 **/

//	public static List<Employee> mutateEmployeeToComposeLogicJava8(List<Employee>  input,   << Functional Interface >> ) {
//		
//	}

	/**
	 * TODO : Exercise 3 Reuse the same 1st (Exercise 1 in this class) higher order
	 * function that you have written to pass pass a single Functional expression
	 * but a) using .andThen b) using .compose. In both all the cases, the result
	 * must be as same as mutateEmployeeAndApplyThenLogicLegacy
	 **/

}
