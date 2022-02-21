package com.infy;


import java.io.File;
import java.nio.file.Path;

public class PathCreation {

	public static void main(String[] args) {

		Path path = Path.of("D:", "..", "java", "jdk.txt");
		System.out.println("Get File Name: " + path.getFileName());
		System.out.println("Get Parent: " + path.getParent());
		System.out.println("Get Name Count: " + path.getNameCount());

		System.out.println("Comparing Paths: " + path.endsWith(Path.of("jdk.txt")));
		System.out.println("Joining two path: " + path.resolve("new"));
		System.out.println("Creating path between two paths: " + path.relativize(Path.of("D:", "java", "new")));
		System.out.println("Normalizing a path: " + path.normalize());
		File f = path.toFile();
		
		System.out.println("Is directory: " + f.isDirectory());

		System.out.println("To Absolute Path: " + Path.of("\\temp").toAbsolutePath());

		
		Path path2 = Path.of("D:", "java", "jdk.txt");
		System.out.println("Comparing Paths: " + path2.endsWith(Path.of("jdk.txt")));
		System.out.println("Joining two path: " + Path.of("D:", "java").resolve("new"));
		

	}

}