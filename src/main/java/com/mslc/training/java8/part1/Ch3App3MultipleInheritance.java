package com.mslc.training.java8.part1;

public class Ch3App3MultipleInheritance {

	/**
	 * <p>
	 * The Three Rules If you’re ever unsure of what will happen with default
	 * methods or with multiple inheritance of behavior, there are three simple
	 * rules for handling conflicts:
	 * </p>
	 * 
	 * <ol>
	 * <li>Any class wins over any interface. So if there’s a method with a body, or
	 * an abstract declaration, in the superclass chain, we can ignore the
	 * interfaces completely.</li>
	 * <li>Subtype wins over supertype. If we have a situation in which two
	 * interfaces are competing to provide a default method and one interface
	 * extends the other, the subclass wins.</li>
	 * <li>No rule 3. If the previous two rules don’t give us the answer, the
	 * subclass must either implement the method or declare it abstract></li>
	 * </ol>
	 * <b> Rule 1 is what brings us compatibility with old code.</b>
	 * <hr>
	 * 
	 * 
	 **/

	// @formatter:off

	/**
	 * Exercise 1:
         - AxaInsurance : default method : calculatePremium()
                - AxaHealthInsurance extends AxaInsurance : default Method : calculatePremium()
                - AxaLifeInsurance extends AxaInsurance : default Method : calculatePremium()
        - Instantiate and invoke calculatePremium (from main)  on following classes
                - AxaInsuranceImpl implements AxaInsurance
                - AxaHealthInsuranceImpl implements AxaHealthInsurance
                - AxaLifeInsurnaceImpl implements AxaLifeInsurance
        - Now override the default methods in the following classes and run the same code
                - AxaHealthInstanceImpl
                - AxaLifeInsuranceImpl
        - Finally create a class called GeneralInsuranceImpl that implements both : AxaHealthInsurance & AxaLifeInsurance
                - Check what happens. 
                - Use <<InterfaceName>>.super.method()
	 * 
	 * 
	 */
	 
	// @formatter:on

}
