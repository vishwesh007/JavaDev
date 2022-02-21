package com.infy;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\Demo.txt");
		System.out.println("File created: " + file.createNewFile());
		System.out.println("Name of the file: " + file.getName());
		System.out.println("Path of the file: " + file.getPath());
		System.out.println("isDirectory: " + file.isDirectory());

	}

}