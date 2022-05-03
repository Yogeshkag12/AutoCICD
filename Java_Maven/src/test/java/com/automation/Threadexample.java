package com.automation;
// Java program to implement solution of producer
// consumer problem.

public class Threadexample {
	public static void main(String[] args)
		throws InterruptedException
	{
		// Object of a class that has both produce()
		// and consume() methods
		final PC2 pc = new PC2();

		// Create producer thread
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				try {
					pc.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Create consumer thread
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				try {
					pc.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}

	// This class has a list, producer (adds items to list
	// and consumer (removes items).
	
}
