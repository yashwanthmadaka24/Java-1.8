package com.mslc.training.java8.part1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch4App1EntertheCollector {

	public static void main(String[] args) {

		Map<Integer, Integer> test = new HashMap<Integer, Integer>();
		test.put(25, 250);
		test.put(25, 350);

		List<Integer> numbers = Arrays.asList(10, 412, 322, 112);

		/**
		 * Exercise 1: Use Collectors to get the set out of numbers given above and
		 * print the same.
		 * 
		 */

		/**
		 * Exercise 2: Use Collectors to get sorted Set of numbers
		 * 
		 */

		// @formatter:off

		Set<Integer> sortedSet 
		    = numbers
		    .stream()
		    .collect(Collectors.toCollection(TreeSet::new));
		System.out.println(sortedSet);
		    
		 // @formatter:on

		/**
		 * Exercise 3: Use Collectors to get the map of number where key is the number
		 * and value is the number * 10
		 */

		// @formatter:off

		
		Map<Integer, Integer> map = 
				 numbers
				   .stream()
				   .collect(Collectors.toMap(x -> x, x -> x * 10));
		System.out.println(map);
		 
		// @formatter:on

		/**
		 * Exercise 4: Use Collectors.maxBy to get the Employee with max dependents. You
		 * may have to make use of Comparator.comparing as argument to Collectors.maxBy.
		 * 
		 * Use minBy as well and see the results
		 * 
		 */

		List<Employee> employees = HealthData.employeeList;
		Employee e = null;

		// @formatter:off
		
		Comparator<Employee> c = Comparator.comparing(x -> x.getDependentList().size());
		
		

		Optional<Employee> empWithMaxDepdents = 
				   employees
				     .stream()
				     .collect(Collectors
				    		 .minBy(Comparator
				    				 .comparing(x -> x.getDependentList().size())  ));
		System.out.println(empWithMaxDepdents.get());
				 
		// @formatter:on

		/**
		 * Exercise 5: Use Collectors.averagingInt Get the average number of dependents
		 * of all employees
		 * 
		 */

		// Stream<Employee> employees3 = HealthData.employeeList.stream();
		
		// @formatter:off
		
		
		double averageNumberOfDependents = 
				employees
				.stream()
			    .collect(Collectors.averagingInt(emp5 -> emp5.getDependentList().size()));
		// @formatter:on
		System.out.println(averageNumberOfDependents);

		

//		System.out.println(average);

	}
}
