package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次读写的数据量，减少实际读写的次数可以提高读写效率
 * 
 * 一组一组字节的读写称为:块读写
 * 单个字节的读写一般称为:随机读写
 * @author Xiloer
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src 
			= new RandomAccessFile("./ideaIC.exe","r");
		
		RandomAccessFile desc
			= new RandomAccessFile("./ideaIC_cp2.exe","rw");
		
		/*
		 * int read(byte[] data)
		 * 一次性读取给定的字节数组总长度的字节量并转入到
		 * 该数组中，返回值的int值表示实际读取到的字节数
		 * 如果返回值为-1则表示文件末尾			
		 * void write(byte[] data)
		 * 一次性将给定字节数组中的所有字节写入文件		 
		 * void write(byte[] data,int offset,int len)
		 * 一次性将给定的字节数组中从下标offset处开始的
		 * 连续len个字节一次性写出
		 */
		int len;//记录每次实际读取到的字节量
		byte[] data = new byte[1024*10];//10k
		long start = System.currentTimeMillis();
		while((len = src.read(data))!=-1) {
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		src.close();
		desc.close();
	}
}







