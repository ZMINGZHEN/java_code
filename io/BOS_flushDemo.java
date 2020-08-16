package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字节输出流的缓冲区问题
 * @author Xiloer
 *
 */
public class BOS_flushDemo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		String str = "你还要我怎样，要怎样。";		
		bos.write(str.getBytes("UTF-8"));
		/*
		 * void flush()
		 * 强制将缓冲流的缓冲区中已经缓存的数据一次性写出
		 * 
		 */
//		bos.flush();
		System.out.println("写出完毕!");
		//缓冲流close时会自动调用一次flush方法
		bos.close();
		
	}
}








