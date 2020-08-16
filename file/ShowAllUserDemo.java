package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中所有用户信息读取并输出到控制台
 * @author Xiloer
 *
 */
public class ShowAllUserDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat","r");
		for(int i=0;i<raf.length()/100;i++) {
			//读取用户名
			byte[] data = new byte[32];
			raf.read(data);//一次性读取32字节
			String username = new String(data,"UTF-8").trim();
			
			raf.read(data);//一次性读取32字节
			String password = new String(data,"UTF-8").trim();
			
			raf.read(data);//一次性读取32字节
			String nickname = new String(data,"UTF-8").trim();
		
			int age = raf.readInt();
			System.out.println(username+","+password+","+nickname+","+age);
			System.out.println("pos:"+raf.getFilePointer());
		}
		
		raf.close();
	}
}










