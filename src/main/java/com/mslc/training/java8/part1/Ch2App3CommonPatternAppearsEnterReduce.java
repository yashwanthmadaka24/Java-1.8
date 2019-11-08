package com.mslc.training.java8.part1;

import java.util.List;

import com.mslc.training.java8.model.Employee;
import com.mslc.training.java8.model.HealthData;

public class Ch2App3CommonPatternAppearsEnterReduce {

	public static void main(String[] args) {

		/**
		 * Exercise 1: Find the employee with least dependents 1st with legacy code and
		 * then with reduce
		 * 
		 **/

		List<Employee> emps = HealthData.employeeList;
		

		Employee emp = emps.get(0);
		for (Employee e : emps) {
			if (e.getDependentList().size() < emp.getDependentList().size()) {
				emp = e;
			}
		}
		System.out.println("emp with least dependents : " + emp + " -- " + emp.getDependentList().size());


	}

}
