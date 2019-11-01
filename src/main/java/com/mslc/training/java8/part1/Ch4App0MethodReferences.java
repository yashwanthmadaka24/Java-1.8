package com.mslc.training.java8.part1;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ch4App0MethodReferences {

	
	/**
	 * Check out this image for method reference types 
	 * 
	 * <img src="/Users/MuhammedShakir/poc-projects/java-8-lambdas-exercises/src/main/java/com/insightfullogic/java8/examples/chapter5/method-reference-types.png"/>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		BiConsumer<HealthInsuranceService, String> staticReference0 = (x, y) -> System.out.println(x + " ** " + y);
		
		/** << assign the static method reference "addNewInsurance of HeatlthInsuranceService class >> **/
		
		
		BiConsumer<HealthInsuranceService, String> staticReference =  null; // << assign the method reference here>>
		
		staticReference.accept(new HealthInsuranceService("static method reference"), "addNewInsurance");
		
		/** Create a new object of class HealthInsuranceService and assign the reference 
		 *  of "activateInsurance" method
		 */
		HealthInsuranceService service = new HealthInsuranceService("method reference");
		BiConsumer<HealthInsuranceService, String> methodReference = null;
		methodReference.accept(service, "activateInsurance");
		
		
		/** Assign the reference of method "deactivateInsurance" of an arbitrary object 
		 */
		BiConsumer<HealthInsuranceService, String> arbitraryObjectReference = null;
		arbitraryObjectReference.accept(new HealthInsuranceService("arbitrary object method reference"), "deactivateInsurance");
		

		// similar in functionality but without method reference
		BiConsumer<HealthInsuranceService, String> arbitraryObjectReference2 = (x, y) -> x.deactivateInsurance(y);
		arbitraryObjectReference2.accept(new HealthInsuranceService("no method reference"), "deactivateInsurance");
		
		// Make a reference to the constructor to return back the new object of HealthInsuranceService in the following
		
		
		Supplier<HealthInsuranceService> f1 = null;
		
		
		
	}

	
}

class HealthInsuranceService {
	
	private String id;
	
	HealthInsuranceService() {
		
	}
	
	HealthInsuranceService(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
	
		return  id;
	}

	public static HealthInsuranceService addNewInsurance(HealthInsuranceService service, String insuranceName) {

		System.out.println("in addNewInsurance : " + insuranceName + " -- " + service);

		return service;
	}
	
	public HealthInsuranceService activateInsurance(HealthInsuranceService service, String insuranceName) {

		System.out.println("in activateInsurance : " + insuranceName + " -- " + service);

		return service;
	}
	
	
	public HealthInsuranceService deactivateInsurance(String insuranceName) {
		
		System.out.println("in subtract : " + insuranceName + " -- " + this);
		return this;
	}

}
