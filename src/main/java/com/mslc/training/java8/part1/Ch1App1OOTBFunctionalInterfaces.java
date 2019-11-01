package com.mslc.training.java8.part1;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Ch1App1OOTBFunctionalInterfaces {

	public static void main(String[] args) {
		
		Function<Integer, Integer> adder  = x -> x + 1;
		
		BiFunction<Integer, String, String> biFunction ;
		Predicate<Integer> predicate ;
		UnaryOperator<Integer> uo ;
		BinaryOperator<Integer> bo  ;
		
		IntUnaryOperator iuo  ;
		DoubleUnaryOperator duo ;
		
		IntBinaryOperator ibo ;
		DoubleBinaryOperator dbo ;
		
		ToIntFunction<String> tif  ;
		ToIntBiFunction<String, String> tibf  ;
		
	}
}
