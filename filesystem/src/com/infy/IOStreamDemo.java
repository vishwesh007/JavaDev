package com.infy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class IOStreamDemo {

	public static void main(String[] args) {
		try (BufferedOutputStream outFile = new BufferedOutputStream(new FileOutputStream("OutFile.txt"));
				BufferedInputStream inFile = new BufferedInputStream(new FileInputStream("InFile.txt"));
				Reader readFile = new FileReader("ReadFrom.txt");
				Writer writeFile = new FileWriter("WriteTo.txt");) {
			// Byte Stream
			int value = inFile.read();

			while (value != -1) {
				outFile.write(value);
				value = inFile.read();
			}

			// Character Stream
			int value1 = readFile.read();

			while (value1 != -1) {
				writeFile.write(value1);
				value1 = readFile.read();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
