package com.mslc.training.java8.part1;

import java.util.List;
import java.util.stream.Collectors;

import com.mslc.training.java8.ch4.StringCombiner;
import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch4App7ReductionAsCollector {

	
	public static void main(String[] args) {

		List<Employee> emps = HealthData.employeeList;

		// but will not work with parallelStream
		String result = emps
						.stream()
						.map(Employee::getName)
						.collect(Collectors.reducing(new StringCombiner(", ", "[", "]"),
													 name -> new StringCombiner(", ", "[", "]").add(name), 
													 StringCombiner::merge))
						.toString();

		System.out.println(result);
	}
}
