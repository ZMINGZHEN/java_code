package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 程序启动后，要求在控制台输入一个文件名，然后对该文件
 * 进行写操作。
 * 之后用户输入的每一行字符串都写入到这个文件中(文件中的
 * 内容先不考虑换行问题)
 * 当用户单独输入exit是程序退出。
 * @author Xiloer
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName = scanner.nextLine();
		RandomAccessFile raf 
			= new RandomAccessFile(fileName,"rw");
		while(true) {
			//获取用户输入的一行字符串
			String line = scanner.nextLine();
			if("exit".equals(line)) {
				break;
			}
			//将内容转换为字节
			byte[] data = line.getBytes("UTF-8");
			raf.write(data);
		}
		System.out.println("再见!");
		raf.close();
	}
}









