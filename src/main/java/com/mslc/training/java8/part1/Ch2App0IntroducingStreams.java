package com.mslc.training.java8.part1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ch2App0IntroducingStreams {

	public static void main(String[] args) {

		System.out.println(Runtime.getRuntime().availableProcessors());

		List<String> names = Arrays.asList("Nomura", "BNP Pariba", "Goldman Sasch", "JP Morgan", "Morgan Stanley");

		Stream<String> streamOfNames = names.stream();

		/*
		 * a) Unfold the expression into code snippet b) Write an SOP and run the
		 * program c) After filter, add a map to convert name to upper case - use a
		 * Function<? extends String, ? extends R> d) Write an SOP in filter too and run
		 * the code e) Change the order of operations and see results - First do mapping
		 * and then filter
		 */

		// @formatter:off
		
		ForkJoinPool.commonPool();
		
		List<String> morganCompanies = 
				streamOfNames
				  .parallel()
				  .filter(x -> {
					  
					  System.out.println(Thread.currentThread().getName() +  " is filtering :" + x);
					  if (x.equalsIgnoreCase("Nomura")) {
						  try {
							Thread.currentThread().sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					  }
					  return true;
					  //return x.contains("Morgan");
					  
				  })
				  .map(x -> {
					  System.out.println(Thread.currentThread().getName() +  " is mapping :" + x);

					  return x.toUpperCase();
					  
				  }).collect(Collectors.toList());
		 
		// @formatter:on

		System.out.println(morganCompanies);

	}

}
