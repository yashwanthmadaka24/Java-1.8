package com.mslc.training.java8.part1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch3App0Primitives {

	public static void main(String[] args) {

		// @formatter:off

	   LongStream ls = 	  LongStream
		   .builder().add(12).add(32).add(3232).build();
	   
	 IntStream li =   Stream.of("shakir", "farhan")
	     .mapToInt( x -> {
	    	 System.out.println(" ----- ");
	    	 return x.length();
	     });
	     
	 System.out.println(li.sum());
	 
	 
	     
	 
	 
	    
	   	
		   
		
		   
		
		 
		// @formatter:on

		/**
		 * Primitive Streams : LongStream, IntStream & DoubleStream map functions like
		 * mapToLong actually does not return Stream<Long> but returns a LongStream.
		 * 
		 * Get the statistics of age of all Dependents of all Employees
		 * 
		 */

//	 IntStream i = null;
//	 i.summaryStatistics()

		List<Employee> emps = HealthData.employeeList;

		// @formatter:off

		 IntSummaryStatistics statistics 
		     = emps
		        .stream()
		        .flatMap(x -> x.getDependentList().stream())
		        .mapToInt(x -> x.getAge())
		        .summaryStatistics();
		 
		// @formatter:on
		 
		 IntStream.range(0, 50)
		 	 .limit(5)
		    .forEach(System.out::println);
		 
		System.out.println("Average age : " + statistics.getAverage() + " -- Max Age" + statistics.getMax()
				+ " --  Min Age: " + statistics.getMin());

	}

	static List<Integer> getIds() {

		return Arrays.asList(1, 2);
	}

}
