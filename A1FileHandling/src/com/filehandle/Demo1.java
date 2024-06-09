package com.filehandle;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Users/siddu/OneDrive/Desktop/SpringFW&Boot@Udemy/A1FileHandling/Text.txt");
		String str = "Java Programming";
		
//		fos.write(str.getBytes()); //1 way
		
//		byte b[] = str.getBytes(); //2way
//		for(byte x:b)
//			fos.write(x);
		
		byte b[] = str.getBytes();
		fos.write(b,5, str.length()-5);
		
		fos.close();
	}

}
