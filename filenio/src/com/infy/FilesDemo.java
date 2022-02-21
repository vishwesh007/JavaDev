package com.infy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {
	public static void main(String[] args) throws IOException {

		Path path1 = Path.of("D://Java");

		System.out.println("Before Creating: " + Files.exists(path1));
		Files.createDirectory(path1);
		System.out.println("After Creating: " + Files.exists(path1));

	}
}