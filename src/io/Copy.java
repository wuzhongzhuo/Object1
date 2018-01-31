package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
	public static void main(String[] args) throws IOException {
		File file=new File("D:/eclipse-jee-oxygen-2-win32-x86_64.zip");
		InputStream it=new FileInputStream(file);
		byte[] d=new byte[(int) file.length()];
		int read = it.read(d);
		
		
		
		File file1=new File("E:/yashou/eclipse-jee-oxygen-2-win32-x86_64.zip");
		OutputStream os1=new FileOutputStream(file1);
		
		os1.write(d);
		os1.close();
		it.close();
		System.out.println("–¥»ÎÕÍ≥…");
	
	}
}
