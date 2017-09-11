package com.infomover.training.java8.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ch2App0IntroducingStreams {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Nomura", "BNP Pariba", "Goldman Sasch", "JP Morgan", "Morgan Stanley");

		Stream<String> streamOfNames = names.stream();

		List<String> morganCompanies = 
					streamOfNames.filter(name -> {
						
										// << Write SOP here to print the value of name
										return name.contains("Morgan");
								  })
								 .collect(Collectors.toList());

		System.out.println(morganCompanies);

	}

}
