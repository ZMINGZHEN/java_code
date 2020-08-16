package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流，用于从文件中读取字节
 * @author Xiloer
 *
 */
public class FISDemo {
	public static void main(String[] args) throws IOException {
		//读取fos.txt
		FileInputStream fis
			= new FileInputStream("fos.txt");
		
		byte[] data = new byte[200];
		int len = fis.read(data);
		System.out.println("实际读取了"+len+"个字节");
		/*
		 * String构造方法:
		 * String(byte[] data,int offset,int len,String csn)
		 * 将给定字节数组从下标offset处的连续len个字节使用csn
		 * 指定的字符集转换为字符串
		 */
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
		
	}
}






