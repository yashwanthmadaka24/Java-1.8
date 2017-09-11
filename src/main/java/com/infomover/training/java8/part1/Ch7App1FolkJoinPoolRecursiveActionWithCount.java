package com.infomover.training.java8.part1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class Ch7App1FolkJoinPoolRecursiveActionWithCount {

	static ForkJoinPool fjp = new ForkJoinPool();

	public static void main(String[] args) throws InterruptedException, IOException {

		MyRecursiveAction task = new MyRecursiveAction(
				"Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).Amazon Prime Day is almost here, and if you’re serious about finding the best deals, admittedly you’ll probably refrain from shopping this weekend and see what Amazon has to offer (like big discounts on its own devices).");

		long start = System.currentTimeMillis();

		fjp.execute(task);
		task.join();

	}

}

class MyRecursiveAction extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int count = 0;
	private String theString;
	private static final int THRESHOLD = 4;

	public MyRecursiveAction(String theString) {

		this.theString = theString;

	}

	@Override
	protected void compute() {

		if (theString.length() > THRESHOLD) {
			// fork
			String s1 = theString.substring(0, theString.length() / 2);
			String s2 = theString.substring(theString.length() / 2, theString.length());
			List<MyRecursiveAction> tasks = new ArrayList<>();
			tasks.add(new MyRecursiveAction(s1));
			tasks.add(new MyRecursiveAction(s2));
			ForkJoinTask.invokeAll(tasks);
			
			
		} else {
			String value = theString.toUpperCase();
			//synchronized (MyRecursiveAction.class) {
				count++;
				System.out.println(value.replace(" ", "-") + "  -> " + Thread.currentThread().getName() + " -- Count : "
						+ count);
		    //}

		}

	}

}
