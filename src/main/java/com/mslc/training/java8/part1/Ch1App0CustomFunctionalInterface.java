package com.mslc.training.java8.part1;

public class Ch1App0CustomFunctionalInterface {

	public static void main(String[] args) {

		AdderTo500 adder = new AdderTo500() {
			public int add(int value) {
				return value + 10;
			}
		};
		int value = execute(adder);

		System.out.println(value);

		// value = execute(<< write a lambda expression here >>);

		System.out.println(value);

		MyCalculator multiplyBy10 = new MyCalculator() {

			@Override
			public int calculate(int value) {

				return value * 10;
			}
		};

		MyCalculator multiplyBy5 = x -> x * 5;

		System.out.println(multiplyBy10.calculate(10));
		System.out.println(multiplyBy5.calculate(10));

	}

	// can pass instance of anonymous class or a lambda
	static int execute(AdderTo500 adder) {
		return adder.add(500);
	}

	static int execute(MyCalculator c) {
		return c.calculate(20);
	}
}

@FunctionalInterface
interface MyCalculator {

	public int calculate(int value);
//	public int newCalculate(int e) ;
}

interface AdderTo500 {
	public int add(int value);
}
