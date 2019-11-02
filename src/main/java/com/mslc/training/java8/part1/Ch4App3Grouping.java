package com.mslc.training.java8.part1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;
import com.mslc.training.java8.model.HealthPlanGenericImpl;

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
		
		
		Map<HealthPlanGenericImpl, List<Employee>> groupedEmps =
				  emps.collect(Collectors.groupingBy(x -> x.getPrimaryHealthPlan()));
		    
		
		Stream<Employee> emps2 = HealthData.employeeList.stream();

		/** Get list of employees by their age groups 25 to 35 and 35 to 45 **/
//		Map<String, List<Employee>> ageWiseEmps =  
//						emps2
//							// String can be constructor using ternary operator based on age
//						    .collect ( << Use Collectors.groupingBy(Function<Employee, String>)   >>  )
		
		
		
		
		
		
		

		
	}
}
