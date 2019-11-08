package com.mslc.training.java8.part1;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;
import com.mslc.training.java8.model.HealthPlan;
import com.mslc.training.java8.model.HealthPlanGenericImpl;

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
		// @formatter:off

		Map<HealthPlan, Long> map = 
				 HealthData
				   .employees
				   .collect(Collectors
						   .groupingBy( x -> x.getPrimaryHealthPlan(),
								   Collectors.counting()));
		System.out.println(map);
		
		
				 
		// @formatter:on

		/**
		 * Exercise 2:
		 * 
		 * Get the Set of Last Names grouped by primary Health Plan
		 * 
		 * 
		 */
		
		// @formatter:off
		
		int i = 5;

		Map<HealthPlanGenericImpl, Set<String>>  groupedEmployees =
		    HealthData
		    .employees
		    .collect(Collectors.groupingBy(x -> {
		    	
		    	System.out.println(i);
		    	
		    	return x.getPrimaryHealthPlan();
		    },
		    		   Collectors.mapping(x -> x.getLastName(),
		    				   Collectors.toSet())));
		
		    
		 // @formatter:on

		    
	}
}
