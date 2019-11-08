package com.mslc.training.java8.boa;

import java.net.ServerSocket;
import java.net.Socket;

public class Demo {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			@Override
			public void run() {
			
				try {
					ServerSocket ss = new ServerSocket(7001);
					System.out.println("Server Started....");
					Socket s = ss.accept();
					System.out.println("Received connection...");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		};
		
		t1.start();
		
		new Thread() {
			public void run() {
				
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread t1 is in : " + t1.getState().name());
					
				}
			};
		}.start();

	}

}
