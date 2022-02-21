package com.infy;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIODemo {

	public static void main(String[] args) throws IOException {
		
		try(RandomAccessFile file = new RandomAccessFile("C:/Test/temp.txt", "r"))
		{
		FileChannel fileChannel = file.getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(512);
		while (fileChannel.read(byteBuffer) > 0) {
			byteBuffer.flip();
			while (byteBuffer.hasRemaining()) {
				System.out.print((char) byteBuffer.get());
			}
		}
		}
		catch(IOException io) {
			System.out.println(io.getMessage());
		}
		
	}

}