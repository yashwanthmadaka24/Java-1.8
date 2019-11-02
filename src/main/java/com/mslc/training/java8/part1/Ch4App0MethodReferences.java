package com.mslc.training.java8.part1;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ch4App0MethodReferences {

	public static void main(String[] args) {

		/**
		 * << assign the static method reference "addNewInsurance of
		 * HealthInsuranceService class >>
		 **/

		BiConsumer<HealthInsuranceService, String> staticReference = null;

//		staticReference.accept(new HealthInsuranceService("static method reference"), "addNewInsurance");

		/**
		 * Declare a functional interface for activateInsurance method to be invoked on
		 * an instance of "activateInsurance" method
		 */
		HealthInsuranceService service = new HealthInsuranceService("method reference");
//		<< Define the function interface of the right type here >> methodReference = service::activateInsurance;
//		methodReference.apply(service, "activateInsurance");

		/**
		 * Define the signature of the deactivateInsurance of an arbitrary object.
		 * Arbitrary object is the one that will be passed at the time of executing the
		 * functional interface with accept or what ever .. depdending of the functional
		 * interface
		 * 
		 */
//		<< Define the functional interface here >> = HealthInsuranceService::deactivateInsurance;
//		arbitraryObjectReference.accept(new HealthInsuranceService("Arbitrary Object"), "deactivateInsurance");

		// Make a reference to the constructor to return back the new object of
		// HealthInsuranceService in the following

		Supplier<HealthInsuranceService> f1 = null;

		// Uncomment the following and do the needful
//		<< define functional interface reference here to hold reference to overloaded constructor> con2 = HealthInsuranceService::new;
//		HealthInsuranceService s = con2.apply("new");

		// Define more constructors and get the references

	}

}

class HealthInsuranceService {

	private String id;

	HealthInsuranceService() {

	}

	HealthInsuranceService(String id) {
		System.out.println("Construct 2 executed : " + id);
		this.id = id;
	}

	@Override
	public String toString() {

		return id;
	}

	public static HealthInsuranceService addNewInsurance(HealthInsuranceService service, String insuranceName) {

		System.out.println("in addNewInsurance : " + insuranceName + " -- " + service);

		return service;
	}

	public HealthInsuranceService activateInsurance(HealthInsuranceService service, String insuranceName) {

		System.out.println("in activateInsurance : " + insuranceName + " -- " + service);

		return service;
	}

	public String deactivateInsurance(String insuranceName) {

		System.out.println("in deactivateInsurance : " + insuranceName + " -- " + this);
		return "this";
	}

}

interface MyComparator<T> {

	int cmp(T o1, T o2);
}
