package com.infy;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformance {

	public static void main(String[] args) {
		
		long currentTime = System.currentTimeMillis();
		
		List<Integer> data = new ArrayList<>();
		
		for (int i = 0; i < 10000; i++) {
			data.add(i);
		}

		long sum = data.stream()
				
				.map(i -> (int) Math.sqrt(i)).map(number -> performComputation(number))
				.reduce(0,Integer::sum);

		System.out.println(sum);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken to complete:" + (endTime - currentTime) / (1000 * 60) + " minutes");

	}

	public static int performComputation(int number) {
		int sum = 0;
		for (int i = 1; i < 1000000; i++) {
			int div = (number / i);
			sum += div;

		}
		return sum;	

	}

}
