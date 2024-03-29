package com.mslc.training.java8.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;
import com.mslc.training.java8.model.HealthPlan;
import com.mslc.training.java8.model.HealthPlanGenericImpl;

public class Ch2App5RefactoringLegacyCode {

	public static void main(String[] args) {

		/**
		 * Exercise 1: Find list of all employees that has at-least one healthplan as
		 * comprehensive. Note that if the name of plan has "compre" then it is
		 * comprehensive
		 * 
		 * 1st write legacy code and the java8 code
		 * 
		 * Hint for java8 code :
		 * 
		 */

		List<Employee> empList = HealthData.employeeList;
		List<Employee> empListWithAtLeast1ComprePlan = new ArrayList<>();
		for (Employee emp : empList) {

			List<HealthPlanGenericImpl> plans = emp.getHealthPlanList();
			for (HealthPlanGenericImpl p : plans) {
				if (p.getName().contains("Compre")) {
					empListWithAtLeast1ComprePlan.add(emp);
				}
			}
		}
		System.out.println(empListWithAtLeast1ComprePlan);

		// @formatter:off
		 List<Employee> empsWithComprePlans = 
				 empList
				   .stream()
				   .filter( x -> 
					   x.getHealthPlanList()
					      .stream()
					      .anyMatch(y -> y.getName().contains("Compre"))				
				   ).collect(Collectors.toList());
		// @formatter:on

		/**
		 * Exercise 2: Find all the dependents in the system where the age is greater
		 * than 15 and put their names (just the name) into a Set. In other words we
		 * want names of all the dependents who are of age greater than 15. Note that
		 * dependents are associated with employees
		 * 
		 * 1st write legacy code then break the same step by step into java8 code
		 **/
		// @formatter:off
		 List<String> names = 
				 empList
				  .stream()
				  .flatMap( x -> x.getDependentList()
						  .stream()
						  .filter(y -> y.getAge() > 15))
//				  .filter( x -> x.getAge() > 15)
				  .map( x -> x.getName())
				  .collect(Collectors.toList());
		 System.out.println(names);
				  
		// @formatter:on

		/**
		 * Exercise 3: Hands-On : Get me the state of comprehensive health plans of all
		 * employees
		 * 
		 * 
		 */
		 
		// @formatter:off
		 List<String> states = 
				   empList
				    .stream()
				    .flatMap(x -> x.getHealthPlanList().stream())
				    .filter(x -> x.getName().contains("Compre"))
				    .map(x -> x.getState())
				    .distinct()
				    .collect(Collectors.toList());
		 System.out.println(states);
		    
		 
		    
		 // @formatter:on

		/**
		 * Exercise 4: Hands-On : Get me all employees with at-least one plan that is
		 * Comprehensive.
		 * 
		 * The legacy code is given below
		 */

//		List<Employee> emps = HealthData.employeeList;
//		List<Employee> empsWithComprePlans = new ArrayList();
//		for (Employee emp : emps) {
//
//			List<HealthPlanGenericImpl> empPlans = emp.getHealthPlanList();
//			for (HealthPlanGenericImpl p : empPlans) {
//				if (p.getName().startsWith("Compre")) {
//					empsWithComprePlans.add(emp);
//					break;
//				}
//			}
//		}

	}
}
