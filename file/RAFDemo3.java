package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据以及基于指针的读写操作
 * @author Xiloer
 *
 */
public class RAFDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("raf.dat","rw");
		/*
		 * long getFilePointer()
		 * 获取RAF当前指针的位置
		 * 
		 * 注:RAF总是在指针指向的位置进行读或写操作，并且
		 * 读写后指针会自动后移到下个字节的位置。
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);//0
		/*
		 * int最大值的2进制
		 *     1       2        3         4
		 * 01111111 11111111 11111111 11111111
		 * 位运算:
		 * max>>>24
		 * 00000000 00000000 00000000 01111111
		 * 
		 * max>>>16
		 * 00000000 00000000 01111111 11111111
		 * 
		 * max>>>8
		 * 00000000 01111111 11111111 11111111
		 * raf.dat
		 * 01111111
		 */
		int max = Integer.MAX_VALUE;		
		raf.write(max>>>24);//写max的第一个字节
		System.out.println("pos:"+raf.getFilePointer());//1
		raf.write(max>>>16);//写max的第二个字节
		raf.write(max>>>8);//写max的第三个字节
		raf.write(max);//写max最后一个字节
		System.out.println("pos:"+raf.getFilePointer());//4
		//上述连续操作后，就将一个int值的4个字节2进制写入文件了
		
		/*
		 * RAF提供了直接写出基本类型的方法，但是原理同上
		 */
		raf.writeInt(max);//连续写4字节，将int值写入文件
		System.out.println("pos:"+raf.getFilePointer());//8
		raf.writeLong(123L);//连续写8字节
		System.out.println("pos:"+raf.getFilePointer());//16
		raf.writeDouble(123.123);//连续写8字节
		System.out.println("pos:"+raf.getFilePointer());//24
		
		System.out.println("写出完毕!");
		/*
		 * void seek(long pos)
		 * 移动指针到指定位置
		 */
		raf.seek(0);//将指针移动到文件最开始,第一个字节位置
		System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * int readInt()
		 * 连续读取4个字节，并还原对应的int值
		 */
		int d = raf.readInt();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		
		//读取long值
		//1先将指针移动到long的第一个字节位置
		raf.seek(8);
		//2连续读取8个字节还原long值
		long lon = raf.readLong();
		System.out.println(lon);
		System.out.println("pos:"+raf.getFilePointer());
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.close();
		
	}
}







