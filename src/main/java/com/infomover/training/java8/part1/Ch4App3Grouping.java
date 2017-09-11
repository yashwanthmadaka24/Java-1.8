package com.infomover.training.java8.part1;

import java.util.stream.Stream;

import com.infomover.training.java8.model.Employee;
import com.infomover.training.java8.model.HealthData;

public class Ch4App3Grouping {

	public static void main(String[] args) {
		
		
		/**
		 * Get employees grouped by their Primary HealthPlan
		 * 
		 */
		
		Stream<Employee> emps = HealthData.employees;
		
//		Map<HealthPlan, List<Employee>> groupedEmps = 
//				emps
//				  .collect(<<  use Collectors.groupingBy (Function<? extends Employee, ? extends HealthPlan>)  >>))
//
//		groupedEmps.forEach((key, value) -> System.out.println(key + " -- " + value));
		
		Stream<Employee> emps2 = HealthData.employeeList.stream();

		/** Get list of employees by their age groups 25 to 35 and 35 to 45 **/
//		Map<Integer, List<Employee>> ageWiseEmps =  
//						emps2
//							// String can be constructor using ternary operator based on age
//						    .collect ( << Use Collectors.groupingBy(Function<Employee, String>)   >>  )
		
		
		
		
		
		
		

		
	}
}
