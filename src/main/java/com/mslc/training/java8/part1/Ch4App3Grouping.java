package com.mslc.training.java8.part1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;
import com.mslc.training.java8.model.HealthPlan;

public class Ch4App3Grouping {

	public static void main(String[] args) {

		/**
		 * Get employees grouped by their Primary HealthPlan. Note there is function
		 * called getPrimaryHealthPlan on Employee
		 * 
		 */

		List<Employee> emps = HealthData.employeeList;
		// @formatter:off
		
		Map<HealthPlan, List<Employee>> groupedEmps =  	
			   emps
			  .stream() 
			  .collect(Collectors.groupingBy(x -> x.getPrimaryHealthPlan()));
 
		// @formatter:on

//		Map<HealthPlan, List<Employee>> groupedEmps = null;

		groupedEmps.forEach((key, value) -> System.out.println(key + " -- " + value));

		Stream<Employee> emps2 = HealthData.employeeList.stream();

		// @formatter:off

		/**
		 * Get list of employees by their age groups 25 to 35 and 35 to 45.
		 * Hint : 
		 * 	Map<String, List<Integer>> allInts2 = 
				Stream.of(35, 45, 35, 35, 35, 45, 48)
					.collect(groupingBy(x -> (x >=30 && x <= 40 ? "30-40" : "40-50")));
		
		 * 
		 */
		
		Function<Integer, String> f = x -> (x >=30 && x <= 40 ? "30-40" : "40-50");
		 
		
		Map<String, List<Integer>> allInts2 = 
				Stream.of(35, 45, 35, 35, 35, 45, 48)
					.collect(Collectors
							.groupingBy(f));
		
		System.out.println(allInts2);
		
		// @formatter:on

	}
}
