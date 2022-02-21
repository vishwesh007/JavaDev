package com.infy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;

public class AttributesDemo3 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("sam\\Sample.txt");
		// PosixFileAttributeView - Since posix view is not there in Windows
		// it will return a null view, so we will get null pointer exception
		PosixFileAttributeView posixView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
		PosixFileAttributes posix = posixView.readAttributes();
		System.out.println("PosixViewOwnner: " + posix.owner().getName());
	}

}