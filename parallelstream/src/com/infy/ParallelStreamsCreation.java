package com.infy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamsCreation {

	public static void main(String[] args) {
		
		List<Integer> data1 = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i=i+10) {
			data1.add(i);
		}
		
		Stream<Integer> parallelData1 = data1.parallelStream();
		
		Stream<Integer> data2 = Stream.of(5,15,25,35,45,55,65,75,85,95);
		Stream<Integer> parallelData2 = data2.parallel();
		
		System.out.println("******Order Of Execution******");
		
		parallelData1.forEach(System.out::println);
		
		System.out.println("******Ordering Parallel Stream******");
		
		parallelData2.forEachOrdered(System.out::println);
		
		System.out.println("******Parallel To Sequential  Stream******");
		
		Stream.of(5,15,25,35,45,55,65,75,85,95)
		.parallel()
		.sequential()
		.forEach(System.out::println);

	}

		

}
