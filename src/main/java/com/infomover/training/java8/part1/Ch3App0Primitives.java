package com.infomover.training.java8.part1;

import java.util.Arrays;
import java.util.List;

public class Ch3App0Primitives {
	
	public static void main(String[] args) {
		
		/**
		 * Primitive Streams : LongStream, IntStream & DoubleStream map
		 * functions like mapToLong actually does not return Stream<Long> but returns a 
		 * LongStream.
		 * 
		 * Get the statistics of age of all Dependents of all Employees
		 * 
		 */
	
//
//		IntSummaryStatistics statistics = 
//					HealthData.employeeList
//						<< Get the stream using stream() >>
//						<< Use a flatMap to convert Employee to Depedent  >>
//						<< Use mapToInt to get age of Dependent >>
//						<< use summaryStatistics() to get the statistics >>
//		
//		System.out.println("Average age : " + statistics.getAverage() + " -- Max Age" + statistics.getMax()
//				+ " --  Min Age: " + statistics.getMin());

	}

	static List<Integer> getIds() {

		return Arrays.asList(1, 2);
	}

}
