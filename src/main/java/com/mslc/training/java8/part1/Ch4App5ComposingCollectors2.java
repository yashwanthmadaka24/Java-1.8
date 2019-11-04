package com.mslc.training.java8.part1;

import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch4App5ComposingCollectors2 {

	/**
	 * Exercises
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Stream<Employee> emps1 = HealthData.employeeList.stream();

		/**
		 * Exercise 1: Count the number of employees by primary health plan instead of
		 * getting Map<HealthPlan, List<Employee>> counting is actually a collector -
		 * Collectors.counting();
		 **/

		/**
		 * Exercise 2:
		 * 
		 * Get the Set of Last Names grouped by Health Plan
		 * 
		 * 
		 */

	}
}
