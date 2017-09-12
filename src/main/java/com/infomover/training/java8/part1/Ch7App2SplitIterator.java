package com.infomover.training.java8.part1;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Ch7App2SplitIterator {

	public static void main(String[] args) {

		
		List<String> names = Arrays.asList("a", "b", "c", "d", "e");
		
		Spliterator<String> si1 =   names.spliterator();
		
		System.out.println("si1 is splitIterator and estimatedSize : " + si1.estimateSize() );
		
		
		Spliterator<String> si2 = si1.trySplit();
		
		System.out.println("si2 estimatedSize : " + si2.estimateSize() );

		
		Spliterator<String> si3 = si1.trySplit();
		
		System.out.println("si3 estimateSize : " + si3.estimateSize() );
		
		Spliterator<String> si4 = si3.trySplit();

		
		si1.forEachRemaining(x -> System.out.println("si1 : " + x));
		System.out.println("**");
		si2.forEachRemaining(x -> System.out.println("si2 : " + x));
		System.out.println("**");
		si3.forEachRemaining(x -> System.out.println("si3 : " + x));
		
//		
//		// Will throw null as it cannot be split further
//		System.out.println("**");
//		si4.forEachRemaining(x -> System.out.println("si4 : " + x));
//		
	}

}
