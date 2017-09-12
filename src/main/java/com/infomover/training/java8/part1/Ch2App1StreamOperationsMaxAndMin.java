package com.infomover.training.java8.part1;

import java.util.Comparator;
import java.util.stream.Stream;

import com.infomover.training.java8.model.Employee;
import com.infomover.training.java8.model.HealthData;

public class Ch2App1StreamOperationsMaxAndMin {

	public static void main(String[] args) {
		
		
		// Find the employee with least dependents
		
		Stream<Employee> emps = HealthData.employees;
		
		
		
		
		  // the Comparator.comparing function takes a Function<? extends T, ? extends U> 
		  // T : the element you need to compare
		  // U : the key that is comparing key

		/** Uncomment the following code snippet and use a Comparator **/
		
//		Employee empWithLeastDependents = 
//					emps
//					  .min(<< Use a Comparator.comparing(keyExtractor) function here >> )
//					  .get();

//		System.out.println(empWithLeastDependents + " - has " + empWithLeastDependents.getDependentList().size() + " dependents");
		
	}
}
