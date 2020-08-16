package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 文件输出流的追加写模式
 * 
 * FileOutputStream(String name)
 * FileOutputStream(File file)
 * 以上两种构造方法创建文件流是覆盖模式。
 * 特点是:文件流在创建时，如果发现执行的文件已经存在，则会
 * 将该文件原内容全部抹除。然后再将通过当前流写出的数据保存
 * 在文件中。
 * 
 * FileOutputStream(String name,boolean append)
 * FileOutputStream(File file,boolean append)
 * 以上两种构造方法第二个参数如果传入的是true,则为追加模式
 * false则还是覆盖模式。
 * 特点:创建文件流时，如果指定的文件存在，原数据保留，所有
 * 写出的数据都会被追加到文件中。
 * 
 * 
 * @author Xiloer
 *
 */
public class FOSDemo4 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("fos4.txt",true);
		
//		String str = "简单点，说话的方式简单点.";
//		fos.write(str.getBytes("UTF-8"));
		
		String str = "演员";
		fos.write(str.getBytes("UTF-8"));
		str = ",薛之谦.";
		fos.write(str.getBytes("UTF-8"));

		System.out.println("写出完毕!");
		fos.close();
	}
}









