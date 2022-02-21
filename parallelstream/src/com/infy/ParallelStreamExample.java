package com.infy;

import java.util.stream.IntStream;

public class ParallelStreamExample {
	
	public static void main(String[] args) {			
		System.out.println("******Threads******");

		System.out.println("Normal...");

		IntStream range1 = IntStream.rangeClosed(1, 10);
		range1.forEach(x -> {
			System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
		});
		
		System.out.println("Parallel...");

		IntStream range2 = IntStream.rangeClosed(1, 10);
		range2.parallel()
		.forEach(x -> {
			System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
		});

	}

}
