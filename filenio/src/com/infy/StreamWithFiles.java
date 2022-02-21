package com.infy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWithFiles {

	public static void main(String[] args) {
		try (Stream<String> lines = Files.lines(Paths.get("sam\\Sample.txt"));) {

			lines.filter(line -> line.startsWith("Anne")).map(String::toUpperCase).forEach(System.out::println);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}
}