package com.mslc.training.java8.part1;

import java.util.List;

import com.mslc.training.java8.model.HealthData;
import com.mslc.training.java8.model.HealthPlanGenericImpl;

public class Ch2App4PuttingOperationsToGether {
	
	public static void main(String[] args) {
		
		
		// We want to get all the states that offer comprehensive health plans
		
	    // Get all the states of a given employee
		
		/** Uncomment the following code and implement as explained  **/
//		
//		Set<String> states = HealthData.johnColtrane.getHealthPlans()
//				<< Use a filter to get only those plans that start with "Compre" >>
//				<< Use a map to convert health plan to State >>
//				<< use a collect and then a Collector to create a Set >>

		
		
		List<HealthPlanGenericImpl> healthPlans = HealthData.getThreeHealthPlans();
		// Get all states that offer Comprehensive Health Plan
		
		/** Uncomment the following code and implement as explained  **/
		
//		states =   healthPlans.stream()
//					<< Use a filter to get only those plans that start with "Compre" >>
//					<< Use a map to convert health plan to State >>
//					<< use a collect and then a Collector to create a Set >>
				
		//System.out.println(states);
		
	}

}
