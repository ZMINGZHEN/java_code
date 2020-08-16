package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * 
 * 步骤:
 * 1:创建一个文件输入流读取原文件
 * 2:创建一个文件输出流写复制文件
 * 3:循环从原文件中读取一组字节并写入到复制文件中
 *   完成复制
 * 4:关闭两个流  
 * 
 * @author Xiloer
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis 
			= new FileInputStream("image.jpg");
		FileOutputStream fos
			= new FileOutputStream("image_cp.jpg");
		int len;
		byte[] data = new byte[1024*10];
		while((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}
		System.out.println("复制完毕!");
		fis.close();
		fos.close();
	}
}











