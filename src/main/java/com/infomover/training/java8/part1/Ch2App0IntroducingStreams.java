package com.infomover.training.java8.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ch2App0IntroducingStreams {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Nomura", "BNP Pariba", "Goldman Sasch", "JP Morgan", "Morgan Stanley");

		Stream<String> streamOfNames = names.stream();

		/*
		 * a) Unfold the expression into code snippet
		   b) Write an SOP and run the program
		   c) After filter, add a map to convert name to upper case - use a Function<? extends String, ? extends R>
		   d) Write an SOP in filter too and run the code
		   e) Change the order of operations and see results - First do mapping and then filter
		*/
		
		
		List<String> morganCompanies = 
				streamOfNames
					.filter(name -> name.contains("Morgan"))
					.map(name -> name.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(morganCompanies);

	}

}
