package com.infy;

import java.util.stream.Stream;

public class ParallelStreamStateful {

	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("Robert","John","Caddy","Angel","Lolita");
		//names.sorted().forEach(System.out::println);
		names.parallel().sequential().parallel().sorted().forEach(System.out::println);
		
		
		

	}

}
