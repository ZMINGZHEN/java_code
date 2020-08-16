package file;

import java.io.File;

/**
 * 删除一个目录
 * @author Xiloer
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		//将当前目录下的demo目录删除
		File dir = new File("./a");
		if(dir.exists()) {
			/*
			 * delete方法删除目录时有一个前提:该目录必须
			 * 是一个空目录才可以删除!
			 */
			dir.delete();
			System.out.println("目录已删除!");
		}else {
			System.out.println("目录不存在!");
		}
		
	}
}
