package com.infy;


import java.nio.file.FileSystems;
import java.util.Set;

public class AttributesDemo1 {

	public static void main(String[] args)  {

		// To check the supported File Attribute View
		Set<String> viewName = FileSystems.getDefault().supportedFileAttributeViews();
		viewName.forEach(System.out::println);

	}

}