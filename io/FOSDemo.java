package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java IO  标准的输入与输出
 * 
 * java将读写按照方向划分为输入与输出
 * 输入:从外界到程序的方向，用于读(获取数据)
 * 输出:从程序到外界的方向，用于写(发送数据)
 * 
 * java将读写描述为"流" stream
 * 可以想象为水流，电流。是一种顺序的向同一方向移动。只不过
 * 我们这里的流中流动的是字节。
 * 
 * java将流划分为两类:
 * 节点流,也称为低级流。是真实连接程序与另一端的"管道"，负责
 * 实际搬运数据。读写一定是建立在低级流的基础上进行的。
 * 
 * 处理流,也称为高级流。不能独立存在，必须连接在其他流上，
 * 目的是当数据流经当前高级流时对其做某些加工处理。是的我们在
 * 读写的过程中对数据完成复杂操作，简化我们的读写工作。
 * 
 * java.io.InputStream是一个抽象类，同时也是所有字节输入流
 * 的超类，里面定义了所有字节输入流都要具备的读取字节的方法。
 * 
 * java.io.OutputStream是所有字节输出流的超类。 
 * 
 * 文件流:java.io.FileInputStream和FileOutputStream
 * 文件流是一对低级流，继承自InputStream和OutputStream
 * 是连接文件的流，用于对文件进行读写数据操作。功能上与
 * RandomAccessFile一致，但是读写方式不同，RAF是基于指针
 * 的随机读写方式，而文件流是基于标准IO的顺序读写方式。
 * 灵活度不如RAF，但是基于IO的流连接可以完成很多复杂数据的
 * 读写操作。
 * 
 * @author Xiloer
 *
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * FileOutputStream的构造方法:
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 */
		FileOutputStream fos
			= new FileOutputStream("fos.txt");
		
		String line = "和我在成都的街头走一走~";
		fos.write(line.getBytes("UTF-8"));
		
		line = "直到所有的灯都熄灭了也不停留~";
		fos.write(line.getBytes("UTF-8"));
		System.out.println("写出完毕!");
		
		fos.close();
		
	}
}








