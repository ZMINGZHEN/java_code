package file;

import java.io.File;

/**
 * 创建多级目录
 * @author Xiloer
 *
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/*
		 *	在当前项目下新建目录:a/b/c/d/e/f 
		 */
		File dir = new File("./a/b/c/d/e/f");
		if(!dir.exists()) {
			//如果父目录不存在则无法创建!
//			dir.mkdir();
			//会将不存在的父目录自动创建出来
			dir.mkdirs();
			System.out.println("目录已创建!");
		}else {
			System.out.println("目录不存在!");
		}
	}
}






