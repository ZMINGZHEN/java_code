package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 向文件中写入文本数据
 * @author Xiloer
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("./raf.txt","rw");
		
		String str = "让我再看你一遍，从南道北.";
		/*
		 * 当指定的字符集拼写不正确时，下面的代码会抛出异常:
		 * java.io.UnsupportedEncodingException: UFT-8
		 */
//		byte[] data = str.getBytes("UFT-8");
		
		byte[] data = str.getBytes("UTF-8");
		
		raf.write(data);
		System.out.println("写出完毕!");
		
		raf.close();
		
	}
}







