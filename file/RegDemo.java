package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能
 * 
 * 程序启动后要求用户输入:用户名，密码，昵称和年龄
 * 除了年龄是int值之外剩下的三个是字符串。
 * 
 * 然后将该用户信息写入文件user.dat中。
 * 
 * 设计：
 * user.dat文件可以保存所有注册用户，每个用户都固定的占用
 * 100字节。其中用户名，密码，昵称为字符串，各占32字节。
 * 年龄为int值占4个字节。
 * 
 * 
 * @author Xiloer
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎注册!");
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		System.out.println("请输入密码:");
		String password = scanner.nextLine();
		System.out.println("请输入昵称:");
		String nickname = scanner.nextLine();
		System.out.println("请输入年龄:");
		int age = scanner.nextInt();
		System.out.println(username+","+password+","+nickname+","+age);
		
		RandomAccessFile raf
			= new RandomAccessFile("user.dat","rw");
		//将指针移动到文件末尾，以便追加新记录
		raf.seek(raf.length());
		
		//写用户名
		byte[] data = username.getBytes("UTF-8");
		//将数组扩容至32字节
		data = Arrays.copyOf(data, 32);
		raf.write(data);//写入32字节
		//写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		//写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		//写年龄
		raf.writeInt(age);
		System.out.println("注册完毕!");
		raf.close();
	}
}











