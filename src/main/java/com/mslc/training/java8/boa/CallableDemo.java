package com.mslc.training.java8.boa;

import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Advance Java : https://tcheck.co/2nXhR8
 * 
 * @author muhammedshakir
 *
 */
public class CallableDemo {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(2);
		ScheduledExecutorService s = Executors.newScheduledThreadPool(5);

		service.execute(() -> {
			System.out.println("runnable");
		});

		Callable<String> c = new Callable<String>() {

			@Override
			public String call() throws Exception {

				if (true) {
					throw new SQLException("Assad");
				}
				Thread.sleep(5000);
				return "BoA";
			}
		};

		Future<String> futureObject = service.submit(c);

		new Thread() {
			public void run() {

				try {
					System.out.println("About to get");
					String value = futureObject.get();
					System.out.println(" ----- ");
					System.out.println(value);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					System.out.println("Cause of task failure : " + e.getCause().getMessage());
//					e.printStackTrace();
				}

			};
		}.start();

		System.out.println("main completed...");

	}

}
