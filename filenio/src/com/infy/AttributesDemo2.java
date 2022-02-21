package com.infy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class AttributesDemo2 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("sam\\Sample.txt");
		
		// BasicFileAttributeView
		BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		BasicFileAttributes basic = basicView.readAttributes();
		System.out.println("Creation Time: " + basic.creationTime());
		System.out.println("Last Access Time: " + basic.lastAccessTime());
		System.out.println("File Size: " + basic.size());
	}

}