package com.mslc.training.java8.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthBenefit;
import com.mslc.training.java8.model.HealthData;
import com.mslc.training.java8.model.HealthPlanGenericImpl;

public class Ch2App6Exercises {

	public static void main(String[] args) {

	
		

		/*
		 * Exercise 1 : Write a function that adds up numbers, i.e. int
		 * addUp(Stream<Integer> numbers)
		 */

		System.out.println(addUp(Stream.of(1, 2, 3, 4, 5)));

		/*
		 * Exercise 2: Write a function that takes in HealthPlans and returns the list
		 * of Strings with their names concatenated with applicable state. Use
		 * HealthData.getThreeHealthPlans()
		 */

		System.out.println(getHealthPlanStates(HealthData.getThreeHealthPlans()));

		/*
		 * Exercise 3: Write a function that takes Employees and return the list of
		 * Employees with at-least 2 dependents.
		 */

		System.out.println(getEmployeesWith2Dependents(HealthData.employees));

		/**
		 * Exercise 4 :
		 * Change the following external-iteration to internal-iteration using Stream
		 * If there are duplicate plans then get the totalBenefits of distinct plans
		 * 
		 **/

		int totalBenefits = 0;
		for (HealthPlanGenericImpl plan : HealthData.getThreeHealthPlans()) {
			Stream<HealthBenefit> benefits = plan.getBenefits();
			totalBenefits += benefits.count();
		}
		System.out.println("Total Health Benefits offered are : " + totalBenefits);

	
		/*
		 * Evaluation : Take a look at the signatures of these Stream methods. Are they
		 * eager or lazy ?
		 */

		// 1) boolean anyMatch(Predicate<? super T> predicate);

		// 2) Stream<T> limit(long maxSize)

		/*
		 * Higher Order Functions : Are these Stream functions higher-order, and why ?
		 */

		// 1) boolean anyMatch(Predicate<? super T> predicate);

		// 2) Stream<T> limit(long maxSize)

		/*
		 * Pure Functions : Are these lambda expressions side-effect free, or do they
		 * mutate ?
		 */

		// x -> x + 1;

		/*
		 * Find the String with the largest number of lower-case letters from a
		 * List<String> You can return an Optional<String> to account for empty list
		 * case. Use hpStates object given below. Also make note of legacy code given below
		 */

		List<String> hpStates = getHealthPlanStates(HealthData.getThreeHealthPlans());

		System.out.println("hpStates : " + hpStates);
		int maxCount = 0;
		String maxCountString = "";
		for (String s : hpStates) {

			// candidate for map
			char[] arr = s.toCharArray();
			int lowerCaseCount = 0;

			for (char c : arr) {
				// filter
				if (Character.isLowerCase(c)) {
					lowerCaseCount++;
				}
			}

			// reduce
			if (lowerCaseCount > maxCount) {
				maxCount = lowerCaseCount;
				maxCountString = s;
			}
		}

		System.out.println("The string with max lowercase " + "characters is : " + maxCountString + " with : "
				+ maxCount + " lower case chars");
		// @formatter:off
		
		// Hint :
		System.out.println(Stream.of(1, 2, 3, 4)
		    .max(Comparator.comparing(Integer::valueOf)));
		
	
		// @formatter:on

		  
		

	}

	static List<Employee> getEmployeesWith2Dependents(Stream<Employee> allEmployees) {

		List<Employee> empsWithAtLeast2Dependents = Collections.EMPTY_LIST;

		return empsWithAtLeast2Dependents;

	}

	static List<String> getHealthPlanStates(List<HealthPlanGenericImpl> healthPlans) {

		List<String> names = Collections.EMPTY_LIST;

		return names;
	}

	static int addUp(Stream<Integer> numbers) {

		int sum = numbers
					.reduce(0, (accumulator, element) -> accumulator + element);

		return sum;
	}

	public static int countLowercaseLetters(String string) {
		return (int) string.chars().filter(Character::isLowerCase).count();
	}

	public static Optional<String> mostLowercaseString(List<String> strings) {
		return strings.stream().max(Comparator.comparing(Ch2App6Exercises::countLowercaseLetters));
	}

}
