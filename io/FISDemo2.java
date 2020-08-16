package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 由于英文数字和符号都是单字节的编码，所以如果是读取
 * 这些内容时可以一次只读1个字节并转换为char
 * @author Xiloer
 *
 */
public class FISDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("fos2.txt");
		int d;
		while((d = fis.read())!=-1) {
			System.out.print((char)d);
		}
		
		fis.close();
	}
}







