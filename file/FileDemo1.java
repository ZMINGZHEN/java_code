package file;

import java.io.File;

/**
 * java.io.File
 * File的每一个实例可以表示硬盘上的一个文件或目录(实际上
 * 表示的是一个抽象路径，如果该路径恰好在硬盘上存在并对应
 * 文件或目录时就直接表示他们)
 * 通过File我们可以:
 * 1:获取其表示的文件或目录的属性(文件大小，名字等)
 * 2:创建或删除文件和目录
 * 3:获取一个目录中的所有子项
 * 
 * 但是不能访问文件数据(java有其他API可以)
 * @author Xiloer
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		/*
		 * 绝对路径,例如:
		 * C:/Users/pc/eclipse-workspace/JSD2006_SE/test.txt
		 * 
		 * 相对路径，例如:
		 * ./test.txt 
		 * "./"在相对路径中称为当前目录
		 */
		File file = new File("./test.txt");
		String name = file.getName();
		System.out.println("name:"+name);
		
		long len = file.length();
		System.out.println("大小:"+len+"字节");
		//获取绝对路径
		String path = file.getAbsolutePath();
		System.out.println("绝对路径:"+path);
		//是否可读
		boolean cr = file.canRead();
		//是否可写
		boolean cw = file.canWrite();
		System.out.println("是否可读:"+cr);
		System.out.println("是否可写:"+cw);
		
	}
}









