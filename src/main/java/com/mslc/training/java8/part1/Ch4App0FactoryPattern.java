package com.mslc.training.java8.part1;

import java.util.function.BiFunction;

import com.mslc.training.java8.model.HealthPlan;
import com.mslc.training.java8.model.HealthPlanComprehensiveImpl;
import com.mslc.training.java8.model.factory.HealthPlanFactoryLegacy;

public class Ch4App0FactoryPattern {

	public static void main(String[] args) {

		HealthPlanFactoryLegacy factory = new HealthPlanFactoryLegacy();
		HealthPlan p1 = factory.getHealthPlan("dental", "IL", "compre");
		HealthPlan p2 = factory.getHealthPlan("general-health", "IL", "generic");

		p1.applyBenefits();
		p2.applyBenefits();
		
//		BiFunction<String, String, HealthPlan> b = HealthPlanComprehensiveImpl::new;
//		HealthPlan p = b.apply("asd", "dsd");
//		System.out.println(p.getClass().getCanonicalName());
		

		// Exercise : Create a new HealthPlanFactoryJava8 class thats acts as a factory
		// HealthPlanFactoryJava8 factory2 = new HealthPlanFactoryJava8();
//		
//		factory2.getHealthPlan("dental", "IL", << which parameter to pass >>);
//		factory2.getHealthPlan("general-health", "IL", << which parameter tp pass >>);

		// Exercise : Refine new HealthPlanFactoryJava8... to hide the implementation class
		// by writing a static bloc to instantiate the plans and keep them in map
		// then the getInstance function must get the value from map and return
		
//		factory3.getHealthPlan("dental", "IL", "compre");
//		factory3.getHealthPlan("general-health", "IL", "generic");

	}

}