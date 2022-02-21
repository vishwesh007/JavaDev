package com.infy;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScenarioDemo {

	Path acc = Path.of("D://Bank//account//acc.txt");
	Path loan = Path.of("D://Bank//loan//loan.txt");
	Path ins = Path.of("D://Bank//insurance//ins.txt");
	Path eligible = Path.of("D://eligible.txt");
	Path destination = Path.of("C:\\Users\\nivetha.r09\\Desktop\\eligible.txt");
	
	String content1 = "Bolt:bolt@thunder.com:9995677898";
	
	public static void main(String[] args) throws IOException {
		ScenarioDemo s = new ScenarioDemo();
		s.writeContent();
		s.filter();
		s.checkLoanEligibility();
		s.move();
		s.getSize();
		s.setReadOnly();

	}

	public void writeContent() {
		// Buffer and Channel
		try (RandomAccessFile file = new RandomAccessFile(acc.toFile(), "rw")) {
			FileChannel fileChannel = file.getChannel();
			ByteBuffer readBuffer = ByteBuffer.allocate(512);
			ByteBuffer writeBuffer = ByteBuffer.wrap(content1.getBytes());
			while (fileChannel.read(readBuffer) > 0) {
				readBuffer.flip();
				while (readBuffer.hasRemaining()) {
					System.out.print((char) readBuffer.get());
				}
				fileChannel.write(writeBuffer);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void filter() throws IOException {
		// ReadAllLines method
		List<String> insList = Files.readAllLines(ins);

		for (String s : insList) {
			String[] arr = s.split(":");
			if (arr[2].equalsIgnoreCase("no")) {
				System.out.println(arr[0] + " - " + arr[1]);
			}
		}
	}

	public void checkLoanEligibility() {
		// Stream API Files class
		try (Stream<String> stream = Files.lines(loan);
				RandomAccessFile file = new RandomAccessFile(eligible.toFile(), "rw");) {

			String accNo = stream.filter(s -> {
				String[] arr = s.split(":");
				return arr[2].equalsIgnoreCase("no");
			}).map(s -> {
				String[] arr = s.split(":");
				return arr[0] + " - " + arr[1];
			}).collect(Collectors.joining("\n"));

			FileChannel fileChannel = file.getChannel();
			ByteBuffer writeBuffer = ByteBuffer.wrap(accNo.getBytes());
			fileChannel.write(writeBuffer);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void move() throws IOException {
		// Files.move() method
		Files.move(eligible, destination);
	}

	public void getSize() throws IOException {
		// BasicFileAttributeView
		BasicFileAttributeView basic = Files.getFileAttributeView(destination, BasicFileAttributeView.class);
		System.out.println(basic.readAttributes().size());
	}

	public void setReadOnly() throws IOException {
		// DosFileAttributeView - setReadOnly() method
		DosFileAttributeView dos = Files.getFileAttributeView(destination, DosFileAttributeView.class);
		dos.setReadOnly(true);
	}

}

