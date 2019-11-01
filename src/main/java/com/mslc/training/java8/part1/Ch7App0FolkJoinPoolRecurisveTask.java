package com.mslc.training.java8.part1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;


public class Ch7App0FolkJoinPoolRecurisveTask {

	public static void main(String[] args) {

		String arr[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

		ForkJoinPool fjp = new ForkJoinPool();


		// 1) Create a new MyRecursiveTask and pass the arr 
		// 2) pass MyRecursiveTask as parameter to fjp.execute
		// 3) use join method of the MyRecursiveTask object to store the value in a String
		// 4) print the value of String
	
		

	}
}

class MyRecursiveTask extends RecursiveTask<String> {

	private String arr[];

	private static final int THRESHOLD = 2;

	public MyRecursiveTask(String arr[]) {

		this.arr = arr;
	}

	@Override
	protected String compute() {

		
		if (arr.length > THRESHOLD) {
			// fork
			
			/**
			 * if the length of arr is greater than THRESHOLD then split (FORK)
			 * then create 2 MyRecursiveTask objects and pass 1st half of arr as parameter to constructor
			 * of 1st object and 2nd half of arr into 2nd MyRecursiveTask object. Use Arrays.copyOfRange 
			 * to split the array into two.
			 * 
			 *  Put the two MyRecursiveTask objects into a list
			 *  
			 *  Use FolkjoinTask.invokeAll to invoke the Tasks - padd the list as parameter 
			 */
			

			
			String concatenatedString = "";
//			for (MyRecursiveTask t : submittedTasks) {
//				
//				// Use a join t.join to join the task and concatenate the
//				// the value in concatenated string
//								
//			}
		
			return concatenatedString;
		} else {

			String concatenatedInTask = "";
			for (String i : arr) {
				concatenatedInTask = concatenatedInTask + i.toUpperCase();
			}

			// String sum = Arrays.stream(arr).collect(Collectors.joining());
			
			return concatenatedInTask;
		}

	}

}
