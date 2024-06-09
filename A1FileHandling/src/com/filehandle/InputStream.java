package com.filehandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:/Users/siddu/OneDrive/Desktop/SpringFW&Boot@Udemy/A1FileHandling/Text.txt")){
			
			//1 way
//			byte b[] = new byte[fis.available()];
//			fis.read(b);
//			String str = new String(b);
//			System.out.println(str);
			
			//2 way
//			int x;
//			do {
//				x=fis.read();
//				if(x!=-1)
//					System.out.print((char)x);
//			}while(x!=-1);
			
			//3 way
//			int x;
//			while((x=fis.read())!=-1) {
//				System.out.print((char)x);
//			}
			
			//4 way
			//FileReader
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
