package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * 缓冲流是一对高级流，在流链接中的作用是加快读写效率。
 * 
 * java.io.BufferedInputStream和BufferedOutputStream
 * 缓冲流内部维护了一个8K的字节数组，它们在读写的过程中会
 * 将读写字节统一转换为块读写来提高读写效率。
 * 
 * @author Xiloer
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis 
			= new FileInputStream("ConcurrentDemo.zip");
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		FileOutputStream fos
			= new FileOutputStream("ConcurrentDemo_cp1.zip");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		int d;
		long start = System.currentTimeMillis();
		while((d = bis.read())!=-1) {
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		bis.close();
		bos.close();
	}
}











