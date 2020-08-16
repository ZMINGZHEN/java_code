package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 向文件fos2.txt中写入所有的小写字母
 * abcdef....xyz
 * @author Xiloer
 *
 */
public class FOSDemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos 
			= new FileOutputStream("fos2.txt");
		/*
		 * 数字97和字符'a'的2进制编码是一样的。
		 * 所以用wirte方法写出97时是吧97的二进制对应的
		 * 这个字节写出，如果将它理解为字符时等同于写出
		 * 了一个英文字符'a'
		 * 
		 */
		for(int i=0;i<26;i++) {
			fos.write(97+i);
		}
		System.out.println("写出完毕!");
		fos.close();
		
	}
}








