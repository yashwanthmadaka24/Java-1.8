package com.infomover.training.java8.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.infomover.training.java8.model.Employee;
import com.infomover.training.java8.model.HealthData;

public class Ch4App1EntertheCollector {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 10, 10, 412, 322, 112);
		
//		Set<Integer>  numbers2 =  numbers
//			.stream()
//			.collect(<< use toSet() );
		
//		System.out.println(numbers2);
		
//		Set<Integer>  numbers3 =  numbers
//				.stream()
//				.collect(<< use Collectors.toCollection( << use constructor  reference of TreeSet >>  >> ));
//			
//		System.out.println("numbers3 : " + numbers3);
		
		
//		Map<Integer, Integer>  numbers4 =  numbers2
//				.stream()
//				.collect(<< use Collectors.toMap >>);
		
		
//		numbers4.forEach((x, y) -> System.out.println(x + " -- " +  y));
		
		/**
		 * Get the Employee with max dependents
		 * 
		 */
		
		Stream<Employee> employees = HealthData.employees;
		
//		Optional<Employee> emp = 
//				employees
//					.collect(<< Use Collectors.maxBy and pass Comparator comparing 
//							based on size of dependentList of employee >> );
		
		
		
		// Neater way to write
		
		
		/** Study the code below **/
		
//		Stream<Employee> employees2 = HealthData.employeeList.stream();
//		
//		Function<Employee, Long> getCount = 
//				  employee -> employee.getDependents().count();
//
//		
//		emp = employees2
//				.collect(Collectors.maxBy(Comparator.comparing(getCount)));
//		
//		System.out.println(emp.isPresent() ? emp.get() : "None");
		
		
		Stream<Employee> employees3 = HealthData.employeeList.stream();
		
		
//		double average = employees3
//			.collect(<< use Collectors.averagingInt and then pass a mapper to return size of dependentsList >>);
		
//		System.out.println(average);
		
		
		
		
									
		
		
		
		
		

		
	}
}
