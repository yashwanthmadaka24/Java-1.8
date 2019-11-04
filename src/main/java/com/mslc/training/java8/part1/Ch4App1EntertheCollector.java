package com.mslc.training.java8.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch4App1EntertheCollector {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 10, 10, 412, 322, 112);

		/**
		 * Exercise 1: 
		 * Use Collectors to get the set out of numbers given above and print the same.
		 * 
		 */

		/**
		 * Exercise 2: 
		 * Use Collectors to get sorted Set of numbers
		 * 
		 */

		/**
		 * Exercise 3: 
		 * Use Collectors to get the map of number where key is the number and value is
		 * the number * 10
		 */

		/**
		 * Exercise 4: 
		 * Use Collectors.maxBy to get the Employee with max dependents. You may have to
		 * make use of Comparator.comparing as argument to Collectors.maxBy.
		 * 
		 * Use minBy as well and see the results
		 * 
		 */

		
		/**
		 * Exercise 5: 
		 * Use Collectors.averagingInt Get the average number of dependents of all employees
		 * 
		 */

		Stream<Employee> employees3 = HealthData.employeeList.stream();


//		System.out.println(average);

	}
}
