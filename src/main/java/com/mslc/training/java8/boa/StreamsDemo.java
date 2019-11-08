package com.mslc.training.java8.boa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("BNP", "BOA", "Nomura", "JPMC", "Morgan Stanley");

		// @formatter:off
		
		List<Integer> filteredNames =	
			names
			  .stream()
			  .filter(x -> {
				  System.out.println(" filtering " + x + " Thread : " + Thread.currentThread().getName());
				  return x.length() > 0;
			  })
			  .map(x -> {
				  System.out.println(" mapping " + x + " Thread : " + Thread.currentThread().getName());

				  return x.toLowerCase();
			  })
			  .map(x -> x.length())
			  .collect(Collectors.toList());
			  
			
		// @formatter:on
		System.out.println(filteredNames);

	}
}
