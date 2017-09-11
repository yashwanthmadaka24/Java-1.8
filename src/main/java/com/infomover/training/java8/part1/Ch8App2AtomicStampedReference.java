package com.infomover.training.java8.part1;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Ch8App2AtomicStampedReference {

	public static void main(String[] args) {

		
		AtomicReference<String> ref0 = new AtomicReference<>();
		System.out.println(ref0.get());
		

		AtomicReference<String> ref1 = new AtomicReference<>("I");
		System.out.println(ref1.get());
		ref1.compareAndSet("I", "A");
		System.out.println(ref1.get());
		
		
		
		
		
		Object initialRef = null;
		int initialStamp = 0;

		AtomicStampedReference atomicStampedReference = 
				new AtomicStampedReference(initialRef, initialStamp);

	}
}
