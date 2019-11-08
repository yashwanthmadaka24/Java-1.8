package com.mslc.training.java8.model.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.mslc.training.java8.model.HealthPlan;
import com.mslc.training.java8.model.HealthPlanComprehensiveImpl;
import com.mslc.training.java8.model.HealthPlanGenericImpl;
import com.mslc.training.java8.model.HealthPlanNonComprehensiveImpl;

public class HealthPlanFactoryLegacy {

	/**
	 * 
	 * 
	 * @param name
	 * @param state
	 * @param type
	 * @return
	 */

	static Map<String, Supplier<HealthPlan>> map = new HashMap<>();

	static {
		map.put("compre", HealthPlanComprehensiveImpl::new);
		map.put("generic", HealthPlanGenericImpl::new);
		map.put("non-compre", HealthPlanNonComprehensiveImpl::new);

	}

	public HealthPlan getHealthPlan(String name, String state, String type) {

		Collection<String> c = new ArrayList<String>();

		return map.get(type).get();

//		switch (type) {
//
//		case "generic":
//
//			return new HealthPlanGenericImpl(name, state);
//		case "compre":
//			return new HealthPlanComprehensiveImpl(name, state);
//
//		case "non-compre":
//			return new HealthPlanNonComprehensiveImpl(name, state);
//		default:
//			throw new RuntimeException("Invalid plan type");
//		}
	}

}
