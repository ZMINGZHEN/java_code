package file;

import java.io.File;
import java.io.FileFilter;

/**
 * FileFilter文件过滤器
 * 
 * File[] listFiles(FileFilter filter)
 * 该方法是获取该目录中符合给定过滤器要求的所有子项
 * @author Xiloer
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		FileFilter filter = new FileFilter() {
			/*
			 * accept 接受
			 * 当前方法的作用是定义过滤file的规则。当file符合
			 * 要求时方法应当返回true
			 */
			public boolean accept(File file) {
				//过滤条件，满足:名字是以"."开始的
				//1 先获取file表示的文件或目录的名字
				String name = file.getName();
				//2 判断该名字这个字符串是否是以"."开始的
				boolean starts = name.startsWith(".");
				return starts;
			}			
		};
		
		
		/*
		 * 获取当前目录下所有名字以"."开始的子项
		 */
		File dir = new File(".");
		if(dir.isDirectory()) {
			File[] subs = dir.listFiles(filter);
			System.out.println("子项个数:"+subs.length);
			
			for(int i=0;i<subs.length;i++) {
				System.out.println(subs[i].getName());
			}
		}
	}
}














