package com.mslc.training.java8.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch1App1OOTBFunctionalInterfaces2 {

	public static void main(String[] args) {
		List<Employee> empList = HealthData.employeeList;

		Function<String, String> f1 = x -> x.toString();
		Function<String, String> after = f1.compose(x -> x.substring(0, 3));
		System.out.println(after.apply("Shakir"));

//		
//		List<String> newList = mutateEmployeeToStringLegacy(empList);
//		System.out.println(newList);
//		
//		System.out.println(Function.identity().apply(empList.get(0)));

		List<String> newList2 = mutateEmployeeToStringJava8(empList, x -> x.getName());
		System.out.println(newList2);

		Function<Employee, String> employeeMapper = x -> x.getName();

		List<String> newList3 = mutateEmployeeToStringJava8(empList,
				employeeMapper.andThen(x -> x.substring(0, x.indexOf(" "))));
		
		newList3
		  .forEach(System.out::println);
		
		

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

	public static List<String> mutateEmployeeToStringJava8(List<Employee> input, Function<Employee, String> mapper) {
		List<String> empNameList = new ArrayList<String>();

		for (Employee emp : input) {
			empNameList.add(mapper.apply(emp));
		}
		return empNameList;
	}

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
	 * function that you have written to pass a single Functional expression but a)
	 * using .andThen b) using .compose. In all the cases, the result must be as
	 * same as mutateEmployeeAndApplyThenLogicLegacy
	 **/

}
