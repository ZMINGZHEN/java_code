package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author Xiloer
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		/*
		 * 获取当前目录下的所有子项
		 */
		File dir = new File(".");//当前目录
		/*
		 * boolean isFile()
		 * 判断当前File对象表示的是否为一个文件
		 * 
		 * boolean isDirectory()
		 * 判断当前File表示的是否为一个目录
		 */
		if(dir.isDirectory()) {
			/*
			 * File[] listFiles()
			 * 获取当前File表示的目录中的所有子项，每一个
			 * 子项以一个File实例形式保存在数组中，并将该
			 * 数组返回
			 */
			File[] subs = dir.listFiles();
			System.out.println("有"+subs.length+"个子项");
			for(int i=0;i<subs.length;i++) {
				System.out.println(subs[i].getName());
			}
			
		}
		
		
	}
}





