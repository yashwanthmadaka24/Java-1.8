package com.infomover.training.java8.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.infomover.training.java8.model.HealthData;

public class Ch3App0Primitives {

	public static void main(String[] args) {

		/**
		 * Primitive Streams : LongStream, IntStream & DoubleStream map functions like
		 * mapToLong actually does not return Stream<Long> but returns a LongStream.
		 * 
		 * Get the statistics of age of all Dependents of all Employees
		 * 
		 */

		Stream<String> s;

//
//		IntSummaryStatistics statistics = 
//					HealthData.employeeList
//						<< Get the stream using stream() >>
//						<< Use a flatMap to convert Employee to Dependent  >>
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
