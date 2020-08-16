package file;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个目录
 * @author Xiloer
 *
 */
public class MkDirDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录下新建一个目录demo
		 */
		File dir = new File("./demo");
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("目录已创建");
		}else {
			System.out.println("目录已存在!");
		}
		
		
		/*
		 * 基于现有的一个目录在其中创建子项
		 * File(File parent,String name)
		 * 在parent目录当中创建一个File表示其子项
		 * 
		 * 在demo目录下新建一个文件demo.txt
		 */
		File file = new File(dir,"demo.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("文件已创建!");
		}else {
			file.delete();
			System.out.println("文件已删除!");
		}
		
	}
}






