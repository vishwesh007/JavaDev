package com.infy;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class AttributesDemo6 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("sam\\Sample.txt");
		// UserDefinedAttributeView
		UserDefinedFileAttributeView userView = Files.getFileAttributeView(path, UserDefinedFileAttributeView.class);
		String attriName = "version";
		userView.write(attriName, Charset.defaultCharset().encode("1.0"));

		ByteBuffer bb = ByteBuffer.allocateDirect(userView.size(attriName));
		userView.read(attriName, bb);
		bb.flip();
		System.out.println(Charset.defaultCharset().decode(bb).toString());
	}
}