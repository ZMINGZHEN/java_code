package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文字
 * @author Xiloer
 *
 */
public class ReadStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","r");
		//RAF也有length方法，表示其操作的文件大小
		long len = raf.length();
		byte[] data = new byte[(int)len];
		
		raf.read(data);
		/*
		 * String的构造方法
		 * String(byte[] data,String charsetName)
		 * 将给定的字节数组中所有的字节按照指定的字符集
		 * 还原为字符串
		 */
		String line = new String(data,"UTF-8");
		System.out.println(line);
		
		raf.close();
	}
}





