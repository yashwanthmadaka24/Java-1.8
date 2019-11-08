package com.mslc.training.java8.part1;

import java.util.List;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch4App6RefactoringAndCustomCollectorsPart1 {
			  

	public static void main(String[] args) {

		/** concatenating names of all employees **/
		
		// Java 1.7 way of 
		
		List<Employee> emps = HealthData.employeeList;
		
		StringBuilder builder = new StringBuilder("[");
		
		for (Employee emp : emps) {

			if (builder.length() > 1)
				builder.append(", ");
			
			String name = emp.getName();
			builder.append(name);
		}
		builder.append("]");
		String result = builder.toString();
		System.out.println(result);
		

		//  1.8 Way - Refactoring the code to use Streams & Map
		
		// We are essentially reducing the stream here
		
		StringBuilder builder2 = new StringBuilder("["); 
		
		emps.stream()
		  .map( Employee:: getName) 
		  .forEach( name -> {
			  
			  if (builder2.length() > 1)
				  builder2.append(", ");
			  
			  builder2.append( name);
			  
		   });
		
		builder2.append("]"); 
		result = builder2.toString();

		System.out.println(result);

	}
}
