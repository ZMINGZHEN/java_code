package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
 * @author Xiloer
 *
 */
public class RAFDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("raf.dat","r");
		
		/*
		 * int read()
		 * 从文件中读取1个字节，并以int形式返回。
		 * 如果返回值为-1则表示读取到了文件末尾
		 * EOF：end of file 文件末尾
		 * 
		 * raf.dat文件内容:
		 * 00000001 00000010
		 */
		//00000000 00000000 00000000 00000001
		int d= raf.read();//1
		System.out.println(d);
		//00000000 00000000 00000000 00000010
		d = raf.read();//2
		System.out.println(d);
		//11111111 11111111 11111111 11111111
		d = raf.read();//-1
		System.out.println(d);
		raf.close();
	}
}









