package com.mslc.training.java8.part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch4App2Partitioning {

	/**
	 * Partition by employee that has dependents and those that does not have
	 * dependents.
	 * 
	 */
	public static void main(String[] args) {

		List<Employee> emps = HealthData.employeeList;

		Map<Boolean, List<Employee>> partitionedEmps = new HashMap<>();

		List<Employee> hasDependents = new ArrayList<Employee>();
		List<Employee> noDependents = new ArrayList<>();
		for (Employee emp : emps) {
			if (emp.getDependentList().size() > 0) {
				hasDependents.add(emp);
			} else {
				noDependents.add(emp);
			}
		}

		partitionedEmps.put(true, hasDependents);
		partitionedEmps.put(false, noDependents);

		partitionedEmps.forEach((x, y) -> System.out.println(x + " -- " + y));

		/**
		 * Exercise 1: Explore Collectors.partitionBy function Get the employees who has
		 * dependents and those who do not using Collectors.partitionBy
		 * 
		 */
		// @formatter:off

		
		Map<Boolean, List<Employee>> partitionedEmps1 = HealthData
				 .employeeList
				 .stream()
				 .collect(Collectors
						   .partitioningBy(x -> 
						   x.getDependentList().size()  > 0));
		
		
		Stream<Employee> empStream = HealthData.employees;
		
		
				 
		// @formatter:on
		System.out.println(partitionedEmps1);

	}
}
