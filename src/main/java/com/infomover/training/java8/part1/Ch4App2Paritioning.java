package com.infomover.training.java8.part1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.infomover.training.java8.model.Employee;
import com.infomover.training.java8.model.HealthData;

public class Ch4App2Paritioning {

	/**
	 * Partition by employee that has dependents and those 
	 * that does not have dependents.
	 * 
	 *  Get a Map<Boolean, List<Employee>>; 
	 *  false = [List of employees with no dependents]
	 *  true = [List of employees that has dependents]
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		
		
		Stream<Employee> emps = HealthData.employees;
		
//		Map<Boolean, List<Employee>> empsWithDependents = 
//				emps
//				.collect(<< use Collectors.partitionBy(Function<Employee, Boolean>))
//				
		Map<Boolean, List<Employee>> empsWithDepdents = 
				 emps
				  .collect(Collectors.partitioningBy( 
						  x -> x.getDependentList().size() > 0));
		
		empsWithDepdents.forEach((key, value) -> System.out.println(key + " -- " + value));
		
		
		
	
		
		
	}
}
