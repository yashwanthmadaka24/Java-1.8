package com.mslc.training.java8.part1;

import static java.util.stream.Collectors.groupingBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;
import com.mslc.training.java8.model.HealthPlan;

public class Ch4App5ComposingCollectors2 {

	
	public static void main(String[] args) {

		/**
		 * This form of groupingBy divides elements into buckets. 
		 * Each bucket gets associated with the key provided by the
		 * classifier function: getPrimaryHealthPlan. 
		 * 
		 * The groupingBy operation then uses the downstream 
		 * collector to collect each bucket and makes a map of the results.
		 * 
		 */
		
		Stream<Employee> emps1 = HealthData.employeeList.stream();
		

		/** Count the number of employees by primary health plan instead 
		    of getting Map<HealthPlan, List<Employee>>
		    counting is actually a collector - Collectors.counting(); **/

//		Map<HealthPlan, Long> healthPlanEmps = 
//				emps1
//				  .collect(<<  Use groupingBy(Function<HealthPlan, Long>)  >>);
//				  
//		
		
//		healthPlanEmps.forEach((key, value) -> System.out.println(key + " -- " + value));
		
		// Following is to get the Set of Last Names of employees grouped by Health Plan - Naive way
		
	
		Stream<Employee> emps4 = HealthData.employeeList.stream();
		
		Map<HealthPlan, List<Employee>> planWiseEmps = emps4
				.collect(groupingBy(Employee::getPrimaryHealthPlan));
		
		Map<HealthPlan, Set<String>> planWiseEmpNames = new HashMap<>();
		for (Map.Entry<HealthPlan, List<Employee>> entry : planWiseEmps.entrySet()) {
			
			planWiseEmpNames.put(entry.getKey(), entry.getValue()
													.stream()
													.map(emp -> emp.getLastName())
													.collect(Collectors.toSet()));
		}
		
		System.out.println(planWiseEmpNames);
		

		// Do it in a neater way using downstream collector
		Stream<Employee> emps5 = HealthData.employeeList.stream();
		
	   	
//		Map<HealthPlan, Set<String>> groupedEmps2 = 
//				emps5
//				  .collect(groupingBy(
//						    // The key to groupBy (argument 1 of groupingBy)
//						  	<< Use the method reference (the arbitrary way) of Employee class >>, 
//						  	
//						  	// cascaded operation with a mapper  (argument 2 of groupingBy)
//						  	<<  Use mapper which takes 2 arguments : 
//						  		a) method reference to get lastname b) the Collector - in our case toSet() >>
//						  	);
//		
//		groupedEmps2.forEach((key, value) -> System.out.println(key + " -- " + value));
		
		
		
	}
}
