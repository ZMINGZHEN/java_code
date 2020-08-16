package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * 原理:
 * 顺序将原文件中每个字节读出来写入到另一个
 * 文件中
 * @author Xiloer
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src 
			= new RandomAccessFile("./ideaIC.exe","r");
		
		RandomAccessFile desc
			= new RandomAccessFile("./ideaIC_cp.exe","rw");
		/*
		 * image.jpg 内容:
		 * 10010101 11100001 00111010 .... 00111011
		 *    
		 * int d:                     vvvvvvvv
		 * 00000000 00000000 00000000 10010101
		 * 
		 * image_cp.jpg
		 * 
		 */
		int d;//用于记录每次读取到的字节
		while((d = src.read())!=-1){
			desc.write(d);
		}
		System.out.println("复制完毕!");
		src.close();
		desc.close();
	}
}






