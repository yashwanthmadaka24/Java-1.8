package com.infomover.training.java8.part1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.infomover.training.java8.model.Employee;
import com.infomover.training.java8.model.HealthData;

public class Ch4App6RefactoringAndCustomCollectorsPart2 {

	public static void main(String[] args) {

		Stream<String> allStrings = Stream.of("1", "2", "3", "4", "5");

		// CODE SNIPPET 1

		// single argument reduce. The return will be Optional<< what ever the stream
		// type is >>
		Optional<String> reducedString1 = allStrings.reduce((acc, element) -> {

			return acc + " ~ " + element;
		});

		System.out.println("reducedString 1 : " + reducedString1);

		// END-OF CODE SNIPPET 1

		// CODE SNIPPET 2

		// two arguments reduce. The return will be inferred based on the identity and
		// hence not Optional.
		// Note that identity is some concrete value and hence something will for sure
		// return
		allStrings = Stream.of("1", "2", "3", "4", "5");
		String reducedString2 = allStrings.reduce("1st Element", (acc, element) -> {

			return acc + " ~ " + element;
		});

		System.out.println("reducedString 2 : " + reducedString2);

		// END-OF CODE SNIPPET 2

		// CODE SNIPPET 3

		// 3 arguments reduce - only when you want to change (map kind of feature)
		allStrings = Stream.of("1", "2", "3", "4", "5");
		StringBuilder reducedString3 = allStrings.reduce(new StringBuilder(), (acc, element) -> {

			if (acc.length() > 0) {
				acc.append(",");
			}

			acc.append(element);

			return acc;

		}, (left, right) -> {

			return new StringBuilder();
		});

		reducedString3.insert(0, "[").append("]");
		System.out.println("reducedString3 : " + reducedString3);

		// END-OF CODE SNIPPET 3

		// CODE SNIPPET 4
		List<Employee> emps = HealthData.employeeList;
		/**
		 * Concatenate the names of all Employees separated by "," and prefixed with "["
		 * & suffixed with "]"
		 **/

		StringBuilder reduced = emps.stream().reduce(new StringBuilder(), (sb, element) -> {

			if (sb.length() > 0) {
				sb.append(" , ");
			}
			return sb.append(element);

		}, (left, right) -> {
			return left.append(right);
		});

//				 << Use a map to map Employee to employee name . Use getName as method reference [arbitrary object]  >>
//				 << Use a reduce as same as we have used in CODE SNIPPET 3   >>
//				 .reduce( );

		reduced.insert(0, "[");
		reduced.append("]");
		String result = reduced.toString();
		System.out.println(" **** ");
		System.out.println(result);

	}
}
