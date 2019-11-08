package com.mslc.training.java8.boa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RedueDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 5);

		int value = 0;
		for (Integer i : numbers) {
			value = value + i;
		}
		System.out.println(value);

		Optional<Integer> finalValue = 
				numbers
				.stream()
				.reduce((x, y) -> x + y);

		System.out.println(finalValue.get());
		

	}

}
