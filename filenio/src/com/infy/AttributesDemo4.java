package com.infy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class AttributesDemo4 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("sam\\Sample.txt");
		// DosFileAttributeView
		DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
		DosFileAttributes dos = dosView.readAttributes();
		System.out.println("Read Only: " + dos.isReadOnly());
		System.out.println("Is Hidden: " + dos.isHidden());
		System.out.println("Is System: " + dos.isSystem());
		System.out.println("Is Archive: " + dos.isArchive());
	}

}