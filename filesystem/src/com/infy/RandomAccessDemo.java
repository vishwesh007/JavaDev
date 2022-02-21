package com.infy;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args)  {

		// RandomAccessFile

		File file = new File("Output.txt");
		try(
		RandomAccessFile randomFile = new RandomAccessFile(file, "rw")){
		randomFile.writeUTF("Java package class random access demo");
		System.out.println("Current position:" + randomFile.getFilePointer());
		randomFile.seek(0);
		System.out.println("Current position:" + randomFile.getFilePointer());
		System.out.println(randomFile.readUTF());
		
		}
		catch(IOException io) {
			System.out.println(io.getMessage());
		}
	}

}